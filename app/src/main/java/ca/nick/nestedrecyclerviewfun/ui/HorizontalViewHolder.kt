package ca.nick.nestedrecyclerviewfun.ui

import androidx.recyclerview.widget.RecyclerView
import android.view.View
import kotlinx.android.synthetic.main.item_horizontal.view.*

class HorizontalViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    fun bindViewHolder(item: Int) {
        itemView.glorious_number.text = item.toString()
    }
}