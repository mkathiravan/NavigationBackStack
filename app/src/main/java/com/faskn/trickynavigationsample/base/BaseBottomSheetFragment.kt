package com.faskn.trickynavigationsample.base

import android.app.Dialog
import android.os.Bundle
import android.view.Gravity
import android.view.WindowManager
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

/**
 * Created by Kathiravan on 18.04.2020
 */

open class BaseBottomSheetFragment : BottomSheetDialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val dialog = super.onCreateDialog(savedInstanceState)
        if (dialog.window != null) {
            dialog.window!!.setGravity(Gravity.BOTTOM)
            dialog.window!!.setBackgroundDrawableResource(android.R.color.transparent)
            dialog.window!!.clearFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND)
            dialog.setCancelable(false)
        }
        return dialog
    }
}