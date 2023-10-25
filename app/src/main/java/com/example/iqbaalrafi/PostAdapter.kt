package com.example.iqbaalrafi

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.iqbaalrafi.databinding.ItemPostBinding


class PostAdapter (private val list: ArrayList<PostResponse>): RecyclerView.Adapter<PostAdapter.PostViewHolder>(){

    class PostViewHolder(private val itemBinding : ItemPostBinding): RecyclerView.ViewHolder(itemBinding.root){
        fun bind(postResponse: PostResponse){

                val text = "id: ${postResponse.id}\n" +
                        "title: ${postResponse.title}\n" +
                        "text: ${postResponse.text}"
                itemBinding.tvText.text = text

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val view = ItemPostBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PostViewHolder(view)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        holder.bind(list[position])
    }
}