package com.hikizan.myfundamentalsubtwo.contract

import com.hikizan.myfundamentalsubtwo.model.detail.ResponseDetail
import com.hikizan.myfundamentalsubtwo.model.followers.ResponseFollowers
import com.hikizan.myfundamentalsubtwo.model.following.ResponseFollowing
import com.hikizan.myfundamentalsubtwo.model.search.ResponseSearch
import com.hikizan.myfundamentalsubtwo.model.users.ResponseUsers

interface UsersContract {

    interface usersView {
        fun _onSuccess(usersResponse: List<ResponseUsers>?)
        fun _onFailed(message: String?)
        fun _onSuccessDetail(detailResponse: ResponseDetail?)
        fun _onFailedDetail(message: String?)
        fun _onSuccessSearch(searchResponse: ResponseSearch?)
        fun _onFailedSearch(message: String?)
        fun _onSuccessFollowing(followingResponse: List<ResponseFollowing>?)
        fun _onFailedFollowing(message: String?)
        fun _onSuccessFollowers(followersResponse: List<ResponseFollowers>?)
        fun _onFailedFollowers(message: String?)
    }

    interface usersPresenter {
        fun getListUser()
        fun getDetailUser(username: String?)
        fun getSearch(username: String?)
        fun getFollowing(username: String?)
        fun getFollowers(username: String?)
    }



}