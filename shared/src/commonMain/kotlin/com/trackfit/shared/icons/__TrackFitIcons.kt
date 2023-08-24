package com.trackfit.shared.icons

import androidx.compose.ui.graphics.vector.ImageVector
import com.trackfit.shared.icons.trackfiticons.BodyParts
import com.trackfit.shared.icons.trackfiticons.Confirm
import com.trackfit.shared.icons.trackfiticons.Cross
import com.trackfit.shared.icons.trackfiticons.EatSign
import com.trackfit.shared.icons.trackfiticons.Help
import com.trackfit.shared.icons.trackfiticons.Okta
import com.trackfit.shared.icons.trackfiticons.Plus
import com.trackfit.shared.icons.trackfiticons.Weight
import kotlin.collections.List as ____KtList

public object TrackFitIcons

private var __AllIcons: ____KtList<ImageVector>? = null

public val TrackFitIcons.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(BodyParts, Confirm, Cross, EatSign, Help, Okta, Plus, Weight)
    return __AllIcons!!
  }
