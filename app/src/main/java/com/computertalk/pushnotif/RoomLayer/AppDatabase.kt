package com.computertalk.pushnotif.RoomLayer

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.computertalk.pushnotif.RoomLayer.dataAccessObjects.UserDoa
import com.computertalk.pushnotif.RoomLayer.entities.UserEntity
import java.security.AccessControlContext

@Database(entities = arrayOf(UserEntity::class),version = 1)
abstract class AppDatabase: RoomDatabase() {
    abstract fun user():UserDoa

    companion object {
        private var instanse:AppDatabase? = null

        public val DB_NAME = "basic_room"

        fun getInstanse(context: Context):AppDatabase{
            if(instanse == null)
            {
                instanse = Room.databaseBuilder(context,AppDatabase::class.java, DB_NAME)
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build()
            }

            return instanse!!

        }
    }

}