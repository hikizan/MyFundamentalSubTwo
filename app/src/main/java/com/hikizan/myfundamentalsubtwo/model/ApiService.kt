package com.hikizan.myfundamentalsubtwo.model

import com.hikizan.myfundamentalsubtwo.model.response.ResponseDetailUser
import com.hikizan.myfundamentalsubtwo.model.response.ResponseFollowersUser
import com.hikizan.myfundamentalsubtwo.model.response.ResponseFollowingUser
import com.hikizan.myfundamentalsubtwo.model.response.ResponseSearchListUser
import retrofit2.Call
import retrofit2.http.*

interface ApiService {

    //listAll
    @Headers("Authorization: token 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")
    @GET("users")
    fun getListUser()

    //search
    @Headers("Authorization: token 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")
    @GET("search/user")
    fun getSearchListUser(
        @Path("q") q: String
    ): Call<ResponseSearchListUser>

    //detail user
    @Headers("Authorization: token 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")
    @GET("users/{login}")
    fun getDetailUser(
        @Path("login") login: String
    ): Call<ResponseDetailUser>

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
}