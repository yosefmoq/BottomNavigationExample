package com.example.bottomnavigationexample.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.bottomnavigationexample.fragments.HomeFragment;
import com.example.bottomnavigationexample.fragments.NotificationFragment;
import com.example.bottomnavigationexample.fragments.ProfileFragment;

import java.util.ArrayList;

public class BottomNavigationAdapter extends FragmentStateAdapter {
    ArrayList<Fragment> fragments;
    public BottomNavigationAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if(position == 0){
            return new HomeFragment();
        }else if(position == 1){
            return new NotificationFragment();
        }else {
            return new ProfileFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
