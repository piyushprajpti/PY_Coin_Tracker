package com.piyushprajpti.pycointracker.coin.domain

data class Coin(
    val id: String,
    val rank: Int,
    val name: String,
    val symbol: String,
    val marketCapInd: Double,
    val priceInd: Double,
    val changePercent24Hr: Double,

)