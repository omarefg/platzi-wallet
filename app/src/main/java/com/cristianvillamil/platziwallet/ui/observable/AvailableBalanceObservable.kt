package com.cristianvillamil.platziwallet.ui.observable

class AvailableBalanceObservable : Observable {
    private val amountObserverList: ArrayList<Observer> = arrayListOf()
    private var amount:Double = 0.0

    fun changeAmount(value: Double) {
        this.amount = value
        notifyObservers(this.amount)
    }

    override fun addObserver(observer: Observer) {
        amountObserverList.add(observer)
    }

    override fun removeObserver(observer: Observer) {
        amountObserverList.remove(observer)
    }

    override fun notifyObservers(value: Double) {
        amountObserverList.forEach {
            it.notifyChange(value)
        }
    }
}