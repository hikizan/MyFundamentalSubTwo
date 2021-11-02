package com.hikizan.myfundamentalsubtwo.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hikizan.myfundamentalsubtwo.contract.UsersContract
import com.hikizan.myfundamentalsubtwo.databinding.FragmentFollowersBinding
import com.hikizan.myfundamentalsubtwo.model.followers.ResponseFollowers
import com.hikizan.myfundamentalsubtwo.presenter.FollowersPresenter

class FollowersFragment : Fragment(), UsersContract.followersView {

    private lateinit var presenterFollowers: UsersContract.followersPresenter
    private lateinit var binding: FragmentFollowersBinding
    private lateinit var responseFollowers: ResponseFollowers

    companion object{
        const val EXTRA_NAME = "extra_name"
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentFollowersBinding.inflate(inflater,container,false)
        return binding.root
        
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initPresenter()

        //presenterFollowers.getFollowers()
    }

    private fun initPresenter(){
        presenterFollowers = FollowersPresenter(this)
    }

    override fun _onSuccessFollowers(followersResponse: List<ResponseFollowers>?) {
        TODO("Not yet implemented")
    }

    override fun _onFailedFollowers(message: String?) {
        TODO("Not yet implemented")
    }

}