package com.hikizan.myfundamentalsubtwo.ui

import android.content.res.Configuration
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.hikizan.myfundamentalsubtwo.databinding.ActivityDetailBinding
import com.hikizan.myfundamentalsubtwo.model.detail.ResponseDetail

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    companion object {
        const val EXTRA_DATA = "extra_data"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val responseDetail: ResponseDetail? = intent.getParcelableExtra(EXTRA_DATA)

        binding.apply {
            tvItemName.text = responseDetail?.name ?: "unknown"
            tvItemLocation.text = responseDetail?.location ?: "no data"
            tvItemCompany.text = responseDetail?.company ?: "no data"
            tvItemRepository.text = responseDetail?.publicRepos.toString()
            tvItemFollowers.text = responseDetail?.followers.toString()
            tvItemFollowing.text = responseDetail?.following.toString()
        }

        Glide.with(this)
            .load(responseDetail?.avatarUrl)
            .into(binding.imgItemPhoto)

        supportActionBar?.title = responseDetail?.login

        numberFont()
    }

    private fun numberFont() {
        if (applicationContext.resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            binding.tvItemFollowers.textSize = 30F
            binding.tvItemFollowing.textSize = 30F
            binding.tvItemRepository.textSize = 30F

        } else {
            binding.tvItemFollowers.textSize = 24F
            binding.tvItemFollowing.textSize = 24F
            binding.tvItemRepository.textSize = 24F
        }
    }
}