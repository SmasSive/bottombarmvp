package com.smassive.bottombarmvp.base

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import com.smassive.bottombarmvp.AlertsActivity
import com.smassive.bottombarmvp.FavoritesActivity
import com.smassive.bottombarmvp.MessagesActivity
import com.smassive.bottombarmvp.MoreActivity
import com.smassive.bottombarmvp.R
import com.smassive.bottombarmvp.list.MainActivity

class BottomBarNavigator {

  fun openActivity(activity: AppCompatActivity, tabId: Int) {
    val intent = when (tabId) {
      R.id.tab_search -> MainActivity.getIntent(activity)
      R.id.tab_favorites -> FavoritesActivity.getIntent(activity)
      R.id.tab_alerts -> AlertsActivity.getIntent(activity)
      R.id.tab_messages -> MessagesActivity.getIntent(activity)
      R.id.tab_more -> MoreActivity.getIntent(activity)
      else -> Intent()
    }
    activity.startActivity(intent)
    activity.finish()
  }
}