package com.example.androidtest.utils

import android.content.Context
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.EditText
import androidx.annotation.ColorRes
import androidx.core.content.ContextCompat
import com.google.android.material.button.MaterialButton

@Suppress("NOTHING_TO_INLINE")
inline fun View.visibleIf(boolean: Boolean, falseVue: Int = View.GONE) {
    this.visibility = if (boolean) View.VISIBLE else falseVue
}

@Suppress("NOTHING_TO_INLINE")
inline fun MaterialButton.visibleIf(boolean: Boolean, falseVue: Int = View.GONE) {
    this.visibility = if (boolean) View.VISIBLE else falseVue
}

