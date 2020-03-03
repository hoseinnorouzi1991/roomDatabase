package com.computertalk.pushnotif.RoomLayer.dataAccessObjects

import androidx.room.*
import com.computertalk.pushnotif.RoomLayer.entities.UserEntity

@Dao
interface UserDoa {

    @Query("select * from users")
    fun getAll(): List<UserEntity>

    @Query("select * from users where id = :id")
    fun getSingleById(id:Int)

    @Insert
    fun insert(user:UserEntity)

    @Update
    fun update(user:UserEntity)

    @Delete
    fun delete(user:UserEntity)

    @Query("delete from users")
    fun deleteAll()


}