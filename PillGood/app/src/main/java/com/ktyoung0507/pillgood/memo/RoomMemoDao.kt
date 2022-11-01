package com.ktyoung0507.room

import androidx.room.*
import androidx.room.OnConflictStrategy.REPLACE

@Dao
interface RoomMemoDao {
    @Query("select * from room_memo")
    fun getAll(): List<RoomMemo>

    @Insert(onConflict = REPLACE)
    fun insert(memo: RoomMemo)

    @Delete
    fun delete(memo: RoomMemo)

    @Update
    fun update(memo: RoomMemo)
}