package com.coder.guoy.recyclerview.ui.tablayout;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.List;

/**
 * @Version:
 * @Author:
 * @CreateTime:
 * @Descrpiton:
 */
public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

    private List<String> mList;

    public MyFragmentPagerAdapter(FragmentManager fm, List<String> list) {
        super(fm);
        this.mList = list;
    }

    @Override
    public Fragment getItem(int position) {
        return new PageFragment();
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mList.get(position);
    }
}
