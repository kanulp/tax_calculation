package com.kanulp.taxcalculation.repo

import androidx.lifecycle.*
import com.kanulp.taxcalculation.database.Tax
import kotlinx.coroutines.launch

class TaxViewModel(private val repository: TaxRepository) : ViewModel() {

    val allUsers : LiveData<List<Tax>> = repository.allUsers.asLiveData()

    fun insert(tax:Tax) = viewModelScope.launch {
        repository.insert(tax)
    }



}

class TaxViewModelFactory(private val repository: TaxRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(TaxRepository::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return TaxViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}