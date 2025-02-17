package com.f0x1d.logfox.extensions

import androidx.fragment.app.Fragment
import com.f0x1d.logfox.R

fun Fragment.showAreYouSureDialog(
    title: Int,
    message: Int = R.string.are_you_sure,
    okPressed: () -> Unit
) = requireActivity().showAreYouSureDialog(title, message, okPressed)

fun Fragment.showAreYouSureDeleteDialog(okClicked: () -> Unit) = showAreYouSureDialog(
    R.string.delete,
    R.string.delete_warning,
    okClicked
)
fun Fragment.showAreYouSureClearDialog(okClicked: () -> Unit) = showAreYouSureDialog(
    R.string.clear,
    R.string.clear_warning,
    okClicked
)