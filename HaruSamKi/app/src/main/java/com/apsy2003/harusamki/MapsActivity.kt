package com.apsy2003.harusamki

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.apsy2003.harusamki.data.Library

import com.apsy2003.harusamki.data.Row
import com.apsy2003.harusamki.databinding.ActivityMapsBinding


import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.google.android.gms.maps.model.LatLngBounds
import com.google.maps.android.clustering.ClusterManager

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityMapsBinding
    //clusterManager 프로퍼티를 선언한다.
    private lateinit var clusterManager: ClusterManager<Row>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMapsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
        //클러스터 매니저 초기화
        clusterManager = ClusterManager(this, mMap)
        mMap.setOnCameraIdleListener(clusterManager) //화면을 이동 후 멈췄을 때 설정
        mMap.setOnMarkerClickListener(clusterManager) //마커클릭설정
        loadLibraries()
    }

    fun loadLibraries() {
        // 도메인 주소와 JSON 컨버터를 설정해서 레트로핏을 생성한다.
        val retrofit = Retrofit.Builder()
            .baseUrl(SeoulOpenApi.DOMAIN)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        // 앞에서 정의한 인터페이스를 실행 가능한 서비스 객체로 변환한다.
        val seoulOpenService = retrofit.create(SeoulOpenService::class.java)

        seoulOpenService
            // getLivibray() 메서드에 'API_KEY'를 입력하고, enqueue() 메서드로 서버에 요청
            .getLibrary(SeoulOpenApi.API_KEY)
            .enqueue(object : Callback<Library> {
                // 여기서 Ctrl + I를 눌러서 인터페이스 코드를 2개 자동 생성
                override fun onFailure(call: Call<Library>, t: Throwable) {
                    Toast.makeText(baseContext
                        , "서버에서 데이터를 가져올 수 없습니다."
                        , Toast.LENGTH_LONG).show()
                }
                override fun onResponse(call: Call<Library>, response: Response<Library>) {
                    // 서버에서 데이터를 정상적으로 받았다면 지도에 마커를 표시하는 메서드를 호출
                    showLibraries(response.body() as Library)
                }
            })
    }

    fun showLibraries(libraries: Library) {
        val latLngBounds = LatLngBounds.Builder()
        /* 파라미터로 전달된 libraries의 SeoulPublicLibraryInfo.row에 도서관 목록이 담겨 있다.
        목록에서 반복문을 통해 하나씩 꺼낸다. */
        for (lib in libraries.SeoulPublicLibraryInfo.row) {

            //기존 마커 세팅 코드는 삭제하고 클러스터 메니저에 데이터를 추가하는 코드만 넣어줍니다.
            clusterManager.addItem(lib)
            // 첫 화면에 보여줄 범위를 정하기 위해서 아래 코드 두 줄은 남겨둡니다.
            val position = LatLng(lib.XCNTS.toDouble(), lib.YDNTS.toDouble())

            latLngBounds.include(position)
        }
        /* 현재 카메라가 시드니를 가리키므로 카메라 위치 조정이 필요한데, 마커 전체의 영역을 구하고,
        마커의 영역만큼 보여주는 코드 작성을 위해 마커의 영역을 저장하는 latLngBounds.build() 생성 */
        val bounds = latLngBounds.build()
        /* for 문이 끝난 다음에 앞에서 저장해둔 마커의 영역을 구한다. (위 코드 설명)
        padding 변수는 마커의 영역에 얼마만큼의 여백을 줄 것인지를 정한다. (아래 코드 설명) */
        val padding = 0
        // bounds와 padding로 카메라를 업데이트한다.
        val updated = CameraUpdateFactory.newLatLngBounds(bounds, padding)
        // 업데이트된 카메라를 지도에 반영한다.
        mMap.moveCamera(updated)
    }
}