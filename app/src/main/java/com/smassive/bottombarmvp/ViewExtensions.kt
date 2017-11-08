package com.smassive.bottombarmvp

import android.support.annotation.LayoutRes
import android.view.LayoutInflater
import android.view.ViewGroup

fun ViewGroup.inflate(@LayoutRes layoutRes: Int, attachToRoot: Boolean = false) =
    LayoutInflater.from(context).inflate(layoutRes, this, attachToRoot)