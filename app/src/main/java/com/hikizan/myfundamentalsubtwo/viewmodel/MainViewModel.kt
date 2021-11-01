package com.hikizan.myfundamentalsubtwo.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import retrofit2.Callback
import com.hikizan.myfundamentalsubtwo.model.ApiConfig
import com.hikizan.myfundamentalsubtwo.model.GithubUser
import com.hikizan.myfundamentalsubtwo.model.response.ResponseSearchListUser
import retrofit2.Call
import retrofit2.Response


class MainViewModel : ViewModel() {

    private val listUser = MutableLiveData<ArrayList<GithubUser>>()

    fun setSearchGithubUser(q: String){
        ApiConfig.getApiService().getSearchListUser().enqueue(object: Callback<ResponseSearchListUser>{
            override fun onResponse(
                call: Call<ResponseSearchListUser>,
                response: Response<ResponseSearchListUser>
            ) {
                if (response.isSuccessful){
                    listUser.postValue(response.body()?.items)
                }
            }

            override fun onFailure(call: Call<ResponseSearchListUser>, t: Throwable) {
                TODO("Not yet implemented")
            }

        })
    }

    fun getSearchGithubUser() : LiveData<ArrayList<GithubUser>>{
        return listUser
    }

}