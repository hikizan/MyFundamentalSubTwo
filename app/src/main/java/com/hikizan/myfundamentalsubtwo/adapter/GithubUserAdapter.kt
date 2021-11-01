package com.hikizan.myfundamentalsubtwo.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.hikizan.myfundamentalsubtwo.databinding.ItemRowUserBinding
import com.hikizan.myfundamentalsubtwo.model.GithubUser

class GithubUserAdapter(private val listGithubUser: ArrayList<GithubUser>) :
    RecyclerView.Adapter<GithubUserAdapter.ViewHolder>() {
    class ViewHolder(var binding: ItemRowUserBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemRowUserBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val (name, username, photo) = listGithubUser[position]

        holder.binding.tvItemName.text = name
        holder.binding.tvItemUsername.text = username

        Glide.with(holder.itemView.context)
            .load(photo)
            .circleCrop()
            .into(holder.binding.imgItemPhoto)
    }

    override fun getItemCount(): Int {
        return listGithubUser.size
    }
}