package com.kanulp.taxcalculation.repo

import androidx.annotation.WorkerThread
import com.kanulp.taxcalculation.database.Tax
import com.kanulp.taxcalculation.database.TaxDao
import kotlinx.coroutines.flow.Flow

class TaxRepository(private val taxDao: TaxDao) {

    val allUsers : Flow<List<Tax>> = taxDao.getAllUsers()

    @WorkerThread
    suspend fun insert(tax:Tax){
        taxDao.insertUser(tax)
    }
}