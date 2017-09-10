package com.example.akshay.parth;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by akshay on 10/9/17.
 */

public class SectionsPagerAdapter extends FragmentPagerAdapter {


    public int semValue;
    public SectionsPagerAdapter(FragmentManager fragmentManager) {

        super(fragmentManager);

    }



    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 2:
                return new FragmentJobFinder();
            default:
                return new FragmentRedAlert();
        }

    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch(position){
            case 1:
                return "Files";
            case 2:
                return "PDF";
            case 0:
                return "Notes";
            default:
                return "Files";

        }

    }
}
