package com.smassive.bottombarmvp

import android.content.Context
import android.content.Intent
import com.smassive.bottombarmvp.base.BottomBarActivity

class HomeActivity : BottomBarActivity() {

  override val layoutId: Int
    get() = R.layout.activity_home
  override val tabId: Int
    get() = R.id.tab_search

  companion object {
    fun getIntent(context: Context): Intent {
      return Intent(context, HomeActivity::class.java)
    }
  }
}