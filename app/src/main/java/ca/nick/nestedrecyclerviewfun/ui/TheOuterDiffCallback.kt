package ca.nick.nestedrecyclerviewfun.ui

import android.support.v7.util.DiffUtil

object TheOuterDiffCallback : DiffUtil.ItemCallback<List<Int>>() {

    override fun areItemsTheSame(p0: List<Int>, p1: List<Int>): Boolean {
        return p0 == p1
    }

    override fun areContentsTheSame(p0: List<Int>, p1: List<Int>): Boolean {
        return p0 == p1
    }
}