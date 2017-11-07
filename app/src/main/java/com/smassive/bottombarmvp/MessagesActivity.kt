package com.smassive.bottombarmvp

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_messages.bottomBar

class MessagesActivity : AppCompatActivity() {

  companion object {
    fun getIntent(context: Context) = Intent(context, MessagesActivity::class.java)
  }

  private val bottomBarNavigator = BottomBarNavigator()

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_messages)

    bottomBar.setDefaultTab(R.id.tab_messages)
    bottomBar.setOnTabSelectListener({ tabId -> bottomBarNavigator.openActivity(this, tabId) }, false)
  }
}