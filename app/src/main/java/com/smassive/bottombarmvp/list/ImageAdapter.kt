package com.smassive.bottombarmvp.list

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import com.smassive.bottombarmvp.R
import com.smassive.bottombarmvp.extensions.inflate
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_list_main.view.photo

class ImageAdapter(private val context: Context,
                   private val imageUrls: List<String>,
                   private val onClickListener: (imageUrl: String) -> Unit = {}) : RecyclerView.Adapter<ImageAdapter.ImageViewHolder>() {

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
      ImageViewHolder(context, parent.inflate(R.layout.item_list_main), onClickListener)

  override fun onBindViewHolder(holder: ImageViewHolder, position: Int) = holder.bind(imageUrls[position])

  override fun getItemCount() = imageUrls.size

  class ImageViewHolder(private val context: Context, itemView: View, private val onClickListener: (imageUrl: String) -> Unit) :
      RecyclerView.ViewHolder(itemView) {

    fun bind(imageUrl: String) {
      itemView.setOnClickListener { onClickListener.invoke(imageUrl) }
      Picasso.with(context)
          .load(imageUrl)
          .noFade()
          .resize(1080, 600)
          .centerCrop()
          .into(itemView.photo)
    }
  }
}