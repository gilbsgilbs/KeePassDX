package com.kunzisoft.keepass.adapters

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.kunzisoft.keepass.activities.fragments.IconCustomFragment
import com.kunzisoft.keepass.activities.fragments.IconStandardFragment

class IconPickerPagerAdapter(fragment: Fragment)
    : FragmentStateAdapter(fragment) {

    private val iconStandardFragment = IconStandardFragment()
    private val iconCustomFragment = IconCustomFragment()

    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            1 -> iconCustomFragment
            else -> iconStandardFragment
        }
    }
}