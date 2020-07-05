package com.cristianvillamil.platziwallet.ui.transfer.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [TransferEntity::class], version = 1)
abstract class ApplicationDatabase : RoomDatabase() {
    abstract fun getDAO(): TransferDAO

    companion object {
        private var INSTANCE: ApplicationDatabase? = null

        fun getAppDatabase(context: Context) : ApplicationDatabase? {
            if (this.INSTANCE == null) {
                this.INSTANCE = Room.databaseBuilder(
                    context.applicationContext,
                    ApplicationDatabase::class.java,
                    "PlatziWalletDatabase"
                ).allowMainThreadQueries()
                    .build()
            }
            return this.INSTANCE
        }


        fun destroyInstance () {
            this.INSTANCE = null
        }
    }
}