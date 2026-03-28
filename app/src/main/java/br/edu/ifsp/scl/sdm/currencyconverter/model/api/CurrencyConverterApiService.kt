package br.edu.ifsp.scl.sdm.currencyconverter.model.api

import br.edu.ifsp.scl.sdm.currencyconverter.model.domain.ConversionResult
import br.edu.ifsp.scl.sdm.currencyconverter.model.domain.CurrencyList
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface CurrencyConverterApiService {
    @Headers(
        "x-rapidapi-host: currency-converter5.p.rapidapi.com",
        "x-rapidapi-key: f88850b3afmshe5a00ed0f9d32d5p1a21bbjsn1dc587cfc7b0"
    )
    @GET("list")
    fun getCurrencies(): Call<CurrencyList>

    @Headers(
        "x-rapidapi-host: currency-converter5.p.rapidapi.com",
        "x-rapidapi-key: f88850b3afmshe5a00ed0f9d32d5p1a21bbjsn1dc587cfc7b0"
    )
    @GET("convert")
    fun convert(
        @Query("from") from: String,
        @Query("to") to: String,
        @Query("amount") amount: String
    ): Call<ConversionResult>
}