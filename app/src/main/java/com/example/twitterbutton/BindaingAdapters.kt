package com.example.twitterbutton

import android.graphics.drawable.Drawable
import android.widget.ImageButton
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.request.target.CustomTarget
import com.bumptech.glide.request.transition.Transition

@BindingAdapter("image_loader")
fun loadImage(imageButton: ImageButton, resourceId: Int?) {
    Glide.with(imageButton).load(resourceId).into(object : CustomTarget<Drawable>() {
        override fun onResourceReady(resource: Drawable, transition: Transition<in Drawable>?) {
            when (resourceId) {
                R.drawable.one -> { imageButton.setImageResource(R.drawable.one) }
                else -> { imageButton.background = resource }
            }
        }
        override fun onLoadCleared(placeholder: Drawable?) {}
    })
}