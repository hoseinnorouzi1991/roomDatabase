package com.computertalk.pushnotif

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.computertalk.pushnotif.RoomLayer.AppDatabase
import com.computertalk.pushnotif.RoomLayer.entities.UserEntity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun test(){
            val db = AppDatabase.getInstanse(this)
            val user1 = UserEntity("mohammad hosein","mh.norouzi89@gmail.com","09398299779")
            db.user().insert(user1)
            val getData = db.user().getAll()
        }
    }
}
