package com.example.calcalories.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;


import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.calcalories.R;
import com.example.calcalories.fragments.HomeFragment;
import com.example.calcalories.fragments.NotesFragment;
import com.example.calcalories.fragments.RecipesFragment;
import com.example.calcalories.fragments.SettingsFragment;
import com.example.calcalories.fragments.WorkOutFragment;
import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar_main);
        toolbar.setTitle(R.string.menu_home);
        setSupportActionBar(toolbar);

        bottomNavigationView = findViewById(R.id.bottom_nav_main);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
               switch (item.getItemId()){
                   case R.id.menu_home:
                       toolbar.setTitle(R.string.menu_home);
                       setSupportActionBar(toolbar);
                       HomeFragment homeFragment = new HomeFragment();
                       FragmentTransaction fragmentTransactionHome = getSupportFragmentManager().beginTransaction();
                       fragmentTransactionHome.commit();
                        return true;
                   case R.id.menu_notes:
                       toolbar.setTitle(R.string.menu_notes);
                       setSupportActionBar(toolbar);
                       NotesFragment notesFragment = new NotesFragment();
                       loadFragment(notesFragment);
                       return true;
                   case R.id.menu_recipes:
                       toolbar.setTitle(R.string.menu_recipes);
                       setSupportActionBar(toolbar);
                       RecipesFragment recipesFragment = new RecipesFragment();
                       loadFragment(recipesFragment);
                       return true;
                   case R.id.menu_workout:
                       toolbar.setTitle(R.string.menu_workout);
                       setSupportActionBar(toolbar);
                       WorkOutFragment workOutFragmentFragment = new WorkOutFragment();
                       loadFragment(workOutFragmentFragment);
                       return true;
                   case R.id.menu_settings:
                       toolbar.setTitle(R.string.menu_settings);
                       setSupportActionBar(toolbar);
                       SettingsFragment settingsFragment = new SettingsFragment();
                       loadFragment(settingsFragment);
                       return true;
               }
                return false;
            }
        });

    }
    private void loadFragment (Fragment fragment){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_main, fragment);
        transaction.commit();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Fragment fragment = new HomeFragment();
        loadFragment(fragment);
    }
}
