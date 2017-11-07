package com.smassive.bottombarmvp

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_favorites.bottomBar

class FavoritesActivity : AppCompatActivity() {

  companion object {
    fun getIntent(context: Context) = Intent(context, FavoritesActivity::class.java)
  }

  private val bottomBarNavigator = BottomBarNavigator()

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_favorites)

    bottomBar.setDefaultTab(R.id.tab_favorites)
    bottomBar.setOnTabSelectListener({ tabId -> bottomBarNavigator.openActivity(this, tabId) }, false)
  }
}