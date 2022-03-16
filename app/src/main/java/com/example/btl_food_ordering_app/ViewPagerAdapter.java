package com.example.btl_food_ordering_app;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new Remarkable_Fragment();
            case 1:
                return new Home_Fragment();
            case 2:
                return new Cart_Fragment();
            default:
                return new Home_Fragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
