package com.smassive.bottombarmvp

import android.content.Intent
import android.support.v7.app.AppCompatActivity

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