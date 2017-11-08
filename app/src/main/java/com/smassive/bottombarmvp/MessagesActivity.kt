package com.smassive.bottombarmvp

import android.content.Context
import android.content.Intent

class MessagesActivity : BottomBarActivity() {

  override val layoutId: Int
    get() = R.layout.activity_messages
  override val tabId: Int
    get() = R.id.tab_messages

  companion object {
    fun getIntent(context: Context) = Intent(context, MessagesActivity::class.java)
  }
}