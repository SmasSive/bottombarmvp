package com.smassive.bottombarmvp

import android.content.Context
import android.content.Intent

class HomeActivity : BottomBarActivity() {

  override val layoutId: Int
    get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
  override val tabId: Int
    get() = R.id.tab_search

  companion object {
    fun getIntent(context: Context) = Intent(context, HomeActivity::class.java)
  }
}