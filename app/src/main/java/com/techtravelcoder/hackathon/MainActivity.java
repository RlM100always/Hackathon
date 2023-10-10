package com.techtravelcoder.hackathon;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.techtravelcoder.hackathon.loginandsignup.UserLoginActivity;

public class MainActivity extends AppCompatActivity {


    DrawerLayout drawerLayout; //drawerlayouuut
    LinearLayout contentView;
    FirebaseAuth auth;
    NavigationView navigationView;//navigation view
    ActionBarDrawerToggle actionBarDrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NavigationView navigationView = findViewById(R.id.nav_view);
        View headerView = navigationView.getHeaderView(0);


        int colorPrimary = 0;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.M) {
            colorPrimary = getColor(R.color.service_bar);
        }

        getWindow().setStatusBarColor(colorPrimary);

        managementNavigationDrawerItem();
    }


    @Override
    public void onBackPressed() {


        AlertDialog.Builder alertObj= new AlertDialog.Builder(MainActivity.this);
        alertObj.setTitle("Confirm Exit...!");
        alertObj.setMessage("Do you want to Exit this Application ?");

        alertObj.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finishAffinity();
            }
        });
        alertObj.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog dialog = alertObj.create();
        alertObj.show();



    }
    public void managementNavigationDrawerItem() {
        drawerLayout = findViewById(R.id.draw_layout);
        navigationView = findViewById(R.id.nav_view);
        androidx.appcompat.widget.Toolbar toolbar = findViewById(R.id.tolbar);
        setSupportActionBar(toolbar);

        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.nav_open, R.string.nav_close);

        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {


                if (item.getItemId() == R.id.home_Id) {
                    drawerLayout.closeDrawer(GravityCompat.START);
                }
                if (item.getItemId() == R.id.university_Id) {
                    drawerLayout.closeDrawer(GravityCompat.START);
                }
                if(item.getItemId()==R.id.share_Id){
                    String textToShare = "Check out this awesome link:";
                    String linkToShare = "https://www.example.com";

                    Intent shareIntent = new Intent(Intent.ACTION_SEND);
                    shareIntent.setType("text/plain");

                    String message = textToShare + "\n" + linkToShare;
                    shareIntent.putExtra(Intent.EXTRA_TEXT, message);

                    // Start the sharing activity
                    startActivity(Intent.createChooser(shareIntent, "Share via"));
                }

                if(item.getItemId()==R.id.exit_Id){
                    AlertDialog.Builder alertObj= new AlertDialog.Builder(MainActivity.this);
                    alertObj.setTitle("Confirm Exit...!");
                    alertObj.setMessage("Do you want to Exit this Application ?");

                    alertObj.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finishAffinity();
                        }
                    });
                    alertObj.setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                        }
                    });
                    AlertDialog dialog = alertObj.create();
                    alertObj.show();
                }
                if(item.getItemId()==R.id.log_out_id){
                    auth= FirebaseAuth.getInstance();
                    auth.signOut();
                    Intent intent= new Intent(getApplicationContext(), UserLoginActivity.class);
                    startActivity(intent);

                }




                return true;
            }
        });

        //  animateNavigationDrawer();

    }
}