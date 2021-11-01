package com.hikizan.myfundamentalsubtwo.ui

import android.app.SearchManager
import android.content.Context
import android.os.Bundle
import android.view.Menu
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import com.hikizan.myfundamentalsubtwo.R
import com.hikizan.myfundamentalsubtwo.adapter.GithubUserAdapter
import com.hikizan.myfundamentalsubtwo.databinding.ActivityMainBinding
import com.hikizan.myfundamentalsubtwo.model.ApiConfig
import com.hikizan.myfundamentalsubtwo.model.GithubUser

class MainActivity : AppCompatActivity() {

    private val list = ArrayList<GithubUser>()
    private lateinit var iSearch: SearchView

    companion object{
        private const val TAG = "MainActivity"
    }

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        iSearch = findViewById(R.id.i_search)
        supportActionBar?.title = "List Github User"

        binding.rvGithubUser.setHasFixedSize(true)

        //getListGithub()
        showRecyclerList()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.option_menu, menu)

        val searchManager = getSystemService(Context.SEARCH_SERVICE) as SearchManager
        val searchView = menu.findItem(R.id.i_search).actionView as SearchView

        searchView.setSearchableInfo(searchManager.getSearchableInfo(componentName))
        searchView.queryHint = resources.getString(R.string.search_hint)
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                //mencari list user github
                TODO("Not yet implemented")
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                return false
            }
        })
        return true
    }

    /*
    private fun getListGithub() {
        showLoading(true)
        val client = ApiConfig.getApiService().getListUser()
    }
     */



    private fun showRecyclerList(){
        val layoutManager = LinearLayoutManager(this)
        binding.rvGithubUser.layoutManager = layoutManager
        val listGithubAdapter = GithubUserAdapter(list)
        binding.rvGithubUser.adapter = listGithubAdapter
    }


    private fun showLoading(isLoading: Boolean){
        if (isLoading){
            binding.pbMain.visibility = View.VISIBLE
        }else{
            binding.pbMain.visibility = View.INVISIBLE
        }
    }
}