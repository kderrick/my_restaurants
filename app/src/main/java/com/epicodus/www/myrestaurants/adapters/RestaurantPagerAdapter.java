package com.epicodus.www.myrestaurants.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.epicodus.www.myrestaurants.models.Restaurant;
import com.epicodus.www.myrestaurants.ui.RestaurantDetailFragment;

import java.util.ArrayList;

/**
 * Created by Guest on 4/26/16.
 */
 public class RestaurantPagerAdapter extends FragmentPagerAdapter {
        private ArrayList<Restaurant> mRestaurants;

        public RestaurantPagerAdapter(FragmentManager fm, ArrayList<Restaurant> restaurants) {
            super(fm);
            mRestaurants = restaurants;
        }

        @Override
        public Fragment getItem(int position) {
            return RestaurantDetailFragment.newInstance(mRestaurants.get(position));
        }

        @Override
        public int getCount() {
            return mRestaurants.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mRestaurants.get(position).getName();
        }
    }
