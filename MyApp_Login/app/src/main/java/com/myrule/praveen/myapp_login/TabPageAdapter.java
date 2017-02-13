package com.myrule.praveen.myapp_login;

import android.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by praveen on 7/11/16.
 */

public class TabPageAdapter extends FragmentPagerAdapter {
    public TabPageAdapter(FragmentManager fm) {
        super(fm);
    }
        public android.support.v4.app.Fragment getItem(int arg0)
    {
        switch (arg0) {
            case 0: return new SignIn();
            case 1: return new Register();
            default: break;
        }
    return null;
    }
    public int getCount() {
        return 2;
    }
}
