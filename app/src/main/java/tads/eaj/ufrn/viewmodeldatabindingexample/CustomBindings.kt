package tads.eaj.ufrn.viewmodeldatabindingexample

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

@BindingAdapter("loadImage")
fun loadImage(imageView: ImageView, url:String){
    Glide.with(imageView.context)
            .load(url)
            .into(imageView)
}
