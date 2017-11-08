package com.smassive.bottombarmvp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.roughike.bottombar.BottomBar

abstract class BottomBarActivity : AppCompatActivity() {

  private val bottomBarNavigator = BottomBarNavigator()
  protected var bottomBar: BottomBar? = null

  abstract val layoutId: Int
  abstract val tabId: Int

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(layoutId)
    configureBottomBar()
  }

  private fun configureBottomBar() {
    bottomBar = findViewById(R.id.bottomBar)
    bottomBar?.setDefaultTab(tabId)
    bottomBar?.getTabWithId(R.id.tab_alerts)?.setBadgeCount(100)
    bottomBar?.setOnTabSelectListener({ tabId -> bottomBarNavigator.openActivity(this, tabId) }, false)
  }
}