package com.smassive.bottombarmvp.detail

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.MenuItem
import com.smassive.bottombarmvp.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_detail.detailPhoto
import kotlinx.android.synthetic.main.activity_detail.toolbar

class DetailActivity : AppCompatActivity() {

  companion object {
    private const val EXTRA_IMAGE_URL = "EXTRA_IMAGE_URL"

    fun getIntent(context: Context, imageUrl: String): Intent {
      val intent = Intent(context, DetailActivity::class.java)
      intent.putExtra(EXTRA_IMAGE_URL, imageUrl)
      return intent
    }
  }

  private lateinit var imageUrl: String

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_detail)

    configureToolbar()

    imageUrl = intent.getStringExtra(EXTRA_IMAGE_URL)

    Picasso.with(this)
        .load(imageUrl)
        .noFade()
        .resize(1080, 600)
        .centerCrop()
        .into(detailPhoto)
  }

  private fun configureToolbar() {
    val toolbar = toolbar as Toolbar
    toolbar.setNavigationIcon(R.drawable.icon_arrow_left_neg_m)
    setSupportActionBar(toolbar)

    supportActionBar?.setDisplayHomeAsUpEnabled(true)
    supportActionBar?.setDisplayShowHomeEnabled(true)
  }

  override fun finish() {
    super.finish()
    overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right)
  }

  override fun onOptionsItemSelected(item: MenuItem?): Boolean {
    return when(item?.itemId) {
      android.R.id.home -> {
        finish()
        true
      }
      else -> super.onOptionsItemSelected(item)
    }
  }
}