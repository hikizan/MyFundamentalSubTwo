package com.hikizan.myfundamentalsubtwo.model.response

import com.google.gson.annotations.SerializedName

data class ResponseDetailUser(

	@field:SerializedName("hireable")
	val hireable: Any,

	@field:SerializedName("repos_url")
	val reposUrl: String,

	@field:SerializedName("following_url")
	val followingUrl: String,

	@field:SerializedName("twitter_username")
	val twitterUsername: Any,

	@field:SerializedName("bio")
	val bio: Any,

	@field:SerializedName("created_at")
	val createdAt: String,

	@field:SerializedName("login")
	val login: String,

	@field:SerializedName("followers_url")
	val followersUrl: String,

	@field:SerializedName("type")
	val type: String,

	@field:SerializedName("blog")
	val blog: String,

	@field:SerializedName("public_gists")
	val publicGists: Int,

	@field:SerializedName("url")
	val url: String,

	@field:SerializedName("followers")
	val followers: Int,

	@field:SerializedName("avatar_url")
	val avatarUrl: String,

	@field:SerializedName("updated_at")
	val updatedAt: String,

	@field:SerializedName("html_url")
	val htmlUrl: String,

	@field:SerializedName("following")
	val following: Int,

	@field:SerializedName("site_admin")
	val siteAdmin: Boolean,

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("company")
	val company: String,

	@field:SerializedName("location")
	val location: String,

	@field:SerializedName("id")
	val id: Int,

	@field:SerializedName("public_repos")
	val publicRepos: Int,

	@field:SerializedName("email")
	val email: Any
)
