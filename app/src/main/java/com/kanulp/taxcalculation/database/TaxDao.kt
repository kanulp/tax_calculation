package com.kanulp.taxcalculation.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface TaxDao {

    @Query("SELECT * FROM tax ORDER BY name ASC")
    fun getAllUsers(): Flow<List<Tax>>

    @Insert
    suspend fun insertUser(tax: Tax)

    @Query("DELETE FROM tax")
    suspend fun deleteAll()
}