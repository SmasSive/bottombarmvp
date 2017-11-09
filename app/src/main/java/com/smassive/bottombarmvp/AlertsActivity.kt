package com.smassive.bottombarmvp

import android.content.Context
import android.content.Intent
import com.smassive.bottombarmvp.base.BottomBarActivity

class AlertsActivity : BottomBarActivity() {

  override val layoutId: Int
    get() = R.layout.activity_alerts
  override val tabId: Int
    get() = R.id.tab_alerts

  companion object {
    fun getIntent(context: Context) = Intent(context, AlertsActivity::class.java)
  }
}