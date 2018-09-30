package ca.nick.nestedrecyclerviewfun.ui

import android.support.v7.util.DiffUtil

object TheInnerDiffCallback : DiffUtil.ItemCallback<Int>() {

    override fun areItemsTheSame(p0: Int, p1: Int): Boolean {
        return p0 == p1
    }

    override fun areContentsTheSame(p0: Int, p1: Int): Boolean {
        return p0 == p1
    }
}