package com.smassive.bottombarmvp

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.bottomBar

class MainActivity : AppCompatActivity() {

  companion object {
    fun getIntent(context: Context) = Intent(context, MainActivity::class.java)
  }

  private val bottomBarNavigator = BottomBarNavigator()

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    bottomBar.setDefaultTab(R.id.tab_search)
    bottomBar.setOnTabSelectListener({ tabId -> bottomBarNavigator.openActivity(this, tabId) }, false)
  }
}
