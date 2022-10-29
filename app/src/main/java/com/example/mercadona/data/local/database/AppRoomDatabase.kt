package com.example.mercadona.data.local.database

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase

abstract class AppRoomDatabase : RoomDatabase(){

    companion object {

        private const val DATABASE_NAME = "MercaFilmsDatabase.db"

        fun buildDatabase(context: Context) {
            Room.databaseBuilder(
                context.applicationContext,
                AppRoomDatabase::class.java,
                DATABASE_NAME
            ).build()
        }
    }
}