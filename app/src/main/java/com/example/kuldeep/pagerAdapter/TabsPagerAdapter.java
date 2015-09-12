package com.example.kuldeep.pagerAdapter;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.kuldeep.GamesFragment;
import com.example.kuldeep.MoviesFragment;
import com.example.kuldeep.TopRatedFragment;

/**
 * Created by kuldeep on 9/10/2015.
 */
public class TabsPagerAdapter extends FragmentPagerAdapter {


    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public android.support.v4.app.Fragment getItem(int index) {

        switch (index){

            case 0:
                return new TopRatedFragment();
            case 1:
                return new GamesFragment();
            case 2:
                return  new MoviesFragment();

        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
