package com.smassive.bottombarmvp.list

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v4.app.ActivityOptionsCompat
import android.view.View
import android.view.animation.AccelerateDecelerateInterpolator
import android.view.animation.AlphaAnimation
import android.view.animation.AnimationSet
import android.view.animation.TranslateAnimation
import com.smassive.bottombarmvp.base.BottomBarActivity
import com.smassive.bottombarmvp.HomeActivity
import com.smassive.bottombarmvp.R
import kotlinx.android.synthetic.main.activity_main.recyclerView

class MainActivity : BottomBarActivity() {

  override val layoutId: Int
    get() = R.layout.activity_main
  override val tabId: Int
    get() = R.id.tab_search

  companion object {
    private const val ALPHA_DURATION = 450L
    private const val TRANSLATE_DURATION = 200L

    fun getIntent(context: Context) = Intent(context, MainActivity::class.java)
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    bottomBar?.setOnTabReselectListener { tabId -> openHomeAnimation() }

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

    enterAnimation(recyclerView)
  }

  private fun openHomeAnimation() {
    val options = ActivityOptionsCompat.makeCustomAnimation(this, R.anim.slide_from_left, R.anim.slide_to_right)
    startActivity(HomeActivity.getIntent(this), options.toBundle())
  }

  private fun enterAnimation(view: View) {
    val animationSet = AnimationSet(true)
    animationSet.addAnimation(fadeInAnimation())
    animationSet.addAnimation(translateAnimation())
    view.startAnimation(animationSet)
  }

  private fun translateAnimation(): TranslateAnimation {
    val translateAnimation = TranslateAnimation(
        TranslateAnimation.ABSOLUTE, 0f,
        TranslateAnimation.ABSOLUTE, 0f,
        TranslateAnimation.ABSOLUTE, 40f,
        TranslateAnimation.ABSOLUTE, 0f)
    translateAnimation.interpolator = AccelerateDecelerateInterpolator()
    translateAnimation.duration = TRANSLATE_DURATION
    return translateAnimation
  }

  private fun fadeInAnimation(): AlphaAnimation {
    val alphaAnimation = AlphaAnimation(0.0f, 1.0f)
    alphaAnimation.interpolator = AccelerateDecelerateInterpolator()
    alphaAnimation.duration = ALPHA_DURATION
    return alphaAnimation
  }
}
