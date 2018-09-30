package ca.nick.nestedrecyclerviewfun.ui

import android.support.v7.widget.RecyclerView
import android.view.View
import kotlinx.android.synthetic.main.item_inner.view.*

class TheInnerViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    fun bindViewHolder(item: Int) {
        itemView.glorious_number.text = item.toString()
    }
}