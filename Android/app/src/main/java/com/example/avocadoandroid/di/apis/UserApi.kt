package com.example.avocadoandroid.di.apis

import com.example.avocadoandroid.entities.CaloricNeedsResponse
import com.example.avocadoandroid.entities.CaloriesDTO
import com.example.avocadoandroid.entities.User
import io.reactivex.rxjava3.core.Observable
import retrofit2.http.*


interface UserApi {

    @POST("login")
    fun login(@Body user:User): Observable<User>

    @POST("signup")
    fun signUp(@Body user:User):Observable<User>

    @PUT("edit")
    fun editProfile(@Body user:User):Observable<User>

    @POST("caloric_needs")
    fun calcualteCaloricNeeds(@Body caloriesDTO: CaloriesDTO):Observable<CaloricNeedsResponse>

    @POST("categories")
    fun getCategories(@Body string:String):Observable<List<String>>§

}