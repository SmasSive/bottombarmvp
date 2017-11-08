package com.smassive.bottombarmvp

import android.content.Context
import android.content.Intent
import com.smassive.bottombarmvp.base.BottomBarActivity

class MoreActivity : BottomBarActivity() {

  override val layoutId: Int
    get() = R.layout.activity_more
  override val tabId: Int
    get() = R.id.tab_more

  companion object {
    fun getIntent(context: Context) = Intent(context, MoreActivity::class.java)
  }
}