package com.example.btl_food_ordering_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Layout_main extends AppCompatActivity {

    ViewPager mViewPager;
    BottomNavigationView mBottomNavigationView;

    void Connect_ID()
    {
        mViewPager=findViewById(R.id.view_pager);
        mBottomNavigationView=findViewById(R.id.bottom_navigation);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_main);
        Connect_ID();

        ViewPagerAdapter Adapter=new ViewPagerAdapter(getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        mViewPager.setAdapter(Adapter);

        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position)
                {
                    case 0:
                        mBottomNavigationView.getMenu().findItem(R.id.icon_remarkable).setChecked(true);
                        break;
                    case 1:
                        mBottomNavigationView.getMenu().findItem(R.id.icon_home).setChecked(true);
                        break;
                    case 2:
                        mBottomNavigationView.getMenu().findItem(R.id.icon_cart).setChecked(true);
                        break;
                }

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        mBottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId())
                {
                    case R.id.icon_remarkable:
                        mViewPager.setCurrentItem(0);
                        break;
                    case R.id.icon_home:
                        mViewPager.setCurrentItem(1);
                        break;
                    case R.id.icon_cart:
                        mViewPager.setCurrentItem(2);
                        break;
                }
                return false;
            }
        });
    }
}