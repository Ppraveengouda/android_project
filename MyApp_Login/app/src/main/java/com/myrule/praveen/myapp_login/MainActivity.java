package com.myrule.praveen.myapp_login;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;

public class MainActivity extends FragmentActivity implements TabListnener {

    private ViewPager viewPager;
    private TabPageAdapter tabPageAdapter;
    private ActionBar actionBar;
    private String[] tabNames={"Sign in","Register"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager=(ViewPager)findViewById(R.id.viewPager);
        tabPageAdapter=new TabPageAdapter(getSupportFragmentManager());
        viewPager.setAdapter(tabPageAdapter);
        actionBar=getActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        for(int i=0;i<2;i++){
            actionBar.addTab(actionBar.newTab().setText(tabNames[i]).setTabListener((ActionBar.TabListener) this));
        }
        ViewPager.setOnPageChangeListner(new ViewPager.OnPageChangeListener(){
           public void onPageSelected(int position){
               actionBar.setSelectedNavigationItem(position);
           }
            public void onPageScrolled(int arg0, float arg1, int arg2){

            }
            public void onPageScrollStateChanged(int arg0){

            }
        });
    }
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft)
    {
        viewPager.setCurrentItem(tab.getPosition());
    }
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft)
    {

    }
}
