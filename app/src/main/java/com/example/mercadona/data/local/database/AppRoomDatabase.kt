package com.example.mercadona.data.local.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.mercadona.data.entity.dbo.*

@Database(entities = [FilmDbo::class, LocationDbo::class, PeopleDbo::class, SpecieDbo::class, VehicleDbo::class], version = 1)
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