package com.smassive.bottombarmvp

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_list_main.view.photo

class ImageAdapter(private val context: Context, private val imageUrls: List<String>) :
    RecyclerView.Adapter<ImageAdapter.ImageViewHolder>() {

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ImageViewHolder(context, parent.inflate(R.layout.item_list_main))

  override fun onBindViewHolder(holder: ImageViewHolder, position: Int) = holder.bind(imageUrls[position])

  override fun getItemCount() = imageUrls.size

  class ImageViewHolder(private val context: Context, itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bind(imageUrl: String) {
      Picasso.with(context)
          .load(imageUrl)
          .noFade()
          .resize(1080, 600)
          .centerCrop()
          .into(itemView.photo)
    }
  }
}