package com.hikizan.myfundamentalsubtwo.api

import com.hikizan.myfundamentalsubtwo.model.detail.ResponseDetail
import com.hikizan.myfundamentalsubtwo.model.search.ResponseSearch
import com.hikizan.myfundamentalsubtwo.model.users.ResponseUsers
import retrofit2.Call
import retrofit2.http.*

interface ApiService {

    //search
    @Headers("Authorization: token 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")
    @GET("search/users")
    fun getSearchListUser(
        @Query("q") username: String
    ): Call<ResponseSearch>

    //listAll
    @Headers("Authorization: token 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")
    @GET("users")
    fun getListUser(): Call<List<ResponseUsers>>

    //detail user
    @Headers("Authorization: token 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")
    @GET("users/{username}")
    fun getDetailUser(
        @Path("username") username: String
    ): Call<ResponseDetail>


    /*

    //follower
    @Headers("Authorization: token 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")
    @GET("users/{login}/followers")
    fun getListFollowers(
        @Path("login") login: String
    ): Call<ResponseFollowersUser>

    //following
    @Headers("Authorization: token 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")
    @GET("users/{login}/following")
    fun getListFollowing(
        @Path("login") login: String
    ): Call<ResponseFollowingUser>

     */
}