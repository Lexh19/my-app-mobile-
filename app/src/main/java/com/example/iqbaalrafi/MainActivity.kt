package com.example.iqbaalrafi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.iqbaalrafi.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val list = ArrayList<PostResponse>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvPost.setHasFixedSize(true)
        binding.rvPost.layoutManager = LinearLayoutManager(this)

        RetrofitClient.instance.getPosts().enqueue(object : Callback<ArrayList<PostResponse>> {
            override fun onResponse(
                call: Call<ArrayList<PostResponse>>,
                response: Response<ArrayList<PostResponse>>
            ) {
                val responseCode = response.code().toString()
                binding.tvResponseCode.text = responseCode
                Log.e("cek data",response.toString())
                response.body()?.let { list.addAll(it) }
                val adapter = PostAdapter(list)
                binding.rvPost.adapter = adapter
            }

            override fun onFailure(call: Call<ArrayList<PostResponse>>, t: Throwable) {

            }

        })

//        replaceFragment(HomeFragment())
//
//        binding.bottomNavigationView.setOnItemSelectedListener {
//
//            when(it.itemId){
//
//                R.id.profiles -> replaceFragment(ProfilesFragment())
//                R.id.home -> replaceFragment(HomeFragment())
//                R.id.settings -> replaceFragment(SettingsFragment())
//
//                else ->{
//
//                }
//            }
//            true
//        }
//    }
//
//    private fun replaceFragment(fragment: Fragment){
//
//        val fragmentManager = supportFragmentManager
//        val fragmentTransaction = fragmentManager.beginTransaction()
//        fragmentTransaction.replace(R.id.frameLayout,fragment)
//        fragmentTransaction.commit()
//
//    }

    }
}
