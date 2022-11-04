package com.ktyoung0507.seoulpubliclibraries.data

data class SeoulPublicLibraryInfo(
    val RESULT: RESULT,
    val list_total_count: Int,
    val row: List<Row>
)