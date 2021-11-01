	package com.hikizan.myfundamentalsubtwo.model.response

import com.google.gson.annotations.SerializedName

data class ResponseListUser(

	@field:SerializedName("ResponseListUser")
	val responseListUser: List<ResponseListUserItem>
)

data class ResponseListUserItem(

	@field:SerializedName("avatar_url")
	val avatarUrl: String,

	@field:SerializedName("repos_url")
	val reposUrl: String,

	@field:SerializedName("html_url")
	val htmlUrl: String,

	@field:SerializedName("following_url")
	val followingUrl: String,

	@field:SerializedName("site_admin")
	val siteAdmin: Boolean,

	@field:SerializedName("id")
	val id: Int,

	@field:SerializedName("login")
	val login: String,

	@field:SerializedName("followers_url")
	val followersUrl: String,

	@field:SerializedName("type")
	val type: String,

	@field:SerializedName("url")
	val url: String,

	@field:SerializedName("node_id")
	val nodeId: String
)
