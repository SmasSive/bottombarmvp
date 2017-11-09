package com.smassive.bottombarmvp

import android.content.Context
import android.content.Intent
import com.smassive.bottombarmvp.base.BottomBarActivity

class FavoritesActivity : BottomBarActivity() {

  override val layoutId: Int
    get() = R.layout.activity_favorites
  override val tabId: Int
    get() = R.id.tab_favorites

  companion object {
    fun getIntent(context: Context) = Intent(context, FavoritesActivity::class.java)
  }
}