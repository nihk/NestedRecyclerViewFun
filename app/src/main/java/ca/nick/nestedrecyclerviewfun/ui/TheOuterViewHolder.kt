package ca.nick.nestedrecyclerviewfun.ui

import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import ca.nick.nestedrecyclerviewfun.utils.StartSnapHelper
import kotlinx.android.synthetic.main.item_outer.view.*

class TheOuterViewHolder(view: View, viewPool: RecyclerView.RecycledViewPool) :
    RecyclerView.ViewHolder(view) {

    private val innerAdapter = TheInnerAdapter()
    private val snapHelper = StartSnapHelper()

    init {
        snapHelper.attachToRecyclerView(itemView.inner_recyclerview)
        itemView.inner_recyclerview.setRecycledViewPool(viewPool)
        itemView.inner_recyclerview.adapter = innerAdapter
    }

    fun bindViewHolder(item: List<Int>, scrollPosition: Int) {
        innerAdapter.submitList(item)
        getInnerLayoutManager().scrollToPositionWithOffset(scrollPosition, 0)
    }

    fun findFirstVisibleItemPosition() =
        getInnerLayoutManager().findFirstVisibleItemPosition()

    private fun getInnerLayoutManager() =
        itemView.inner_recyclerview.layoutManager as LinearLayoutManager
}