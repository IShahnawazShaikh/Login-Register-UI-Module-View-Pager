package com.shahnawazshaikh.baechat.pageradapter;

import android.widget.Switch;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.shahnawazshaikh.baechat.fragment.LoginFragment;
import com.shahnawazshaikh.baechat.fragment.RegisterFragment;

public class MyPagerAdapter extends FragmentStatePagerAdapter {
    int tabNo;
    public MyPagerAdapter(FragmentManager fm, int tabNo){
        super(fm);
        this.tabNo=tabNo;

    }
    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                LoginFragment lg=new LoginFragment();
                return lg;
            case 1:
                RegisterFragment rg= new RegisterFragment();
                return rg;
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return tabNo;
    }
}
