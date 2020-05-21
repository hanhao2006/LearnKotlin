package com.example.tipcalc

class Bill constructor(_bill: Double, _tip: Double){

    var bill : Double
    var tip : Double

    init {
        bill = _bill
        tip = _tip
    }

    fun calTip(): Double = (this.bill * (this.tip/100)) + this.bill

}
