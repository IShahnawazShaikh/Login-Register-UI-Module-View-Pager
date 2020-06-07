package com.shahnawazshaikh.baechat;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.tabs.TabLayout;
import com.shahnawazshaikh.baechat.fragment.LoginFragment;
import com.shahnawazshaikh.baechat.fragment.RegisterFragment;
import com.shahnawazshaikh.baechat.pageradapter.MyPagerAdapter;

public class MainActivity extends AppCompatActivity implements LoginFragment.OnFragmentInteractionListener, RegisterFragment.OnFragmentInteractionListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabLayout tabLayout=(TabLayout) findViewById(R.id.tabLayout);
        tabLayout.addTab(tabLayout.newTab().setText("LOGIN"));
        tabLayout.addTab(tabLayout.newTab().setText("REGISTER"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        final ViewPager viewPager=findViewById(R.id.Pager);
        final MyPagerAdapter adapter=new MyPagerAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.setOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }
    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
