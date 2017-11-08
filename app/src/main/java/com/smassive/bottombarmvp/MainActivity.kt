package com.smassive.bottombarmvp

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.bottomBar
import kotlinx.android.synthetic.main.activity_main.recyclerView

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

    val imageUrls = listOf(
        "https://d.inmofactory.com/1/101830/12283936/133081769.jpg",
        "https://d.inmofactory.com/1/89157/5338093/20129730.jpg",
        "https://d.fotocasa.es/anuncio/2017/03/31/142005382/352313052.jpg",
        "https://d.inmofactory.com/1/108152/12320182/149577993.jpg",
        "https://d.inmofactory.com/1/108152/12320182/149577995.jpg",
        "https://d.inmofactory.com/1/108152/12320182/149577994.jpg",
        "https://d.inmofactory.com/1/108152/12320207/149578534.jpg",
        "https://d.inmofactory.com/1/99202/10050601/107596674.jpg",
        "https://d.inmofactory.com/1/108152/12316907/149574341.jpg",
        "https://d.inmofactory.com/1/90885/13061649/148182864.jpg"
    )
    recyclerView.adapter = ImageAdapter(this, imageUrls)
  }
}
