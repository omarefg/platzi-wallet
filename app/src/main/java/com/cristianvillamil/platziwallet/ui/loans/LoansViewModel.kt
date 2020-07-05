package com.cristianvillamil.platziwallet.ui.loans

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoansViewModel : ViewModel() {
    private val percentageLiveData: MutableLiveData<String> = MutableLiveData()
    private val loansListLiveData: MutableLiveData<List<Loan>> = MutableLiveData()

    fun changeValues() {
        this.percentageLiveData.value = "100%"
        this.loansListLiveData.value = emptyList()
    }

    fun getPercentageLiveData(): LiveData<String> = this.percentageLiveData
    fun getLoansListLiveData(): LiveData<List<Loan>> = this.loansListLiveData

    override fun onCleared() {
        super.onCleared()
    }
}