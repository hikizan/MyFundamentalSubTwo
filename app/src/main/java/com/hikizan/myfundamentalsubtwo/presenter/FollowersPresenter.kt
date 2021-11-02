package com.hikizan.myfundamentalsubtwo.presenter

import com.hikizan.myfundamentalsubtwo.api.ApiConfig
import com.hikizan.myfundamentalsubtwo.contract.UsersContract
import com.hikizan.myfundamentalsubtwo.model.followers.ResponseFollowers
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class FollowersPresenter : UsersContract.followersPresenter{

    private lateinit var view: UsersContract.followersView
    private lateinit var apiConfig: ApiConfig

    constructor(viewConst: UsersContract.followersView){
        view = viewConst
        apiConfig = ApiConfig()
    }

    override fun getFollowers(username: String?) {
        apiConfig.getApiService().getListFollowers(username!!)
            .enqueue(object: Callback<List<ResponseFollowers>> {
                override fun onResponse(
                    call: Call<List<ResponseFollowers>>,
                    response: Response<List<ResponseFollowers>>
                ) {
                    when (response.code()) {
                        200 -> view._onSuccessFollowers(response.body())
                        404 -> view._onFailedFollowers("Gagal Memuat Data Followers")
                        500 -> view._onFailedFollowers("Gagal Memuat Data Followers")
                        else -> view._onFailedFollowers("Gagal Memuat Data Followers")
                    }
                }

                override fun onFailure(call: Call<List<ResponseFollowers>>, t: Throwable) {
                    view._onFailedFollowers("Pastikan Jaringan Anda Stabil")
                }

            })
    }
}