package com.example.bottomnavigationexample;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.bottomnavigationexample.adapters.BottomNavigationAdapter;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    ViewPager2 viewPager2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bnvHome);
        viewPager2 = findViewById(R.id.vp);
        BottomNavigationAdapter bottomNavigationAdapter = new BottomNavigationAdapter(this);
        viewPager2.setAdapter(bottomNavigationAdapter);

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.nav_home:
                         viewPager2.setCurrentItem(0);
                        break;
                    case R.id.nav_notification:
                        viewPager2.setCurrentItem(1);
                        break;
                    case R.id.nav_profile:
                        viewPager2.setCurrentItem(2);

                }
                return true;
            }
        });

    }
}