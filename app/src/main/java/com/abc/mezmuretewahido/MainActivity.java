package com.abc.mezmuretewahido;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private CardView card1;
    private CardView card2;
    private CardView card3;
    private CardView card4;
    private CardView card5;

//declaration

    ListView listView;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //call the id of a card view from activity_main.xml resource file

     card1 = (CardView) findViewById(R.id.card1);
     card2 = (CardView) findViewById(R.id.card2);
     card3 = (CardView) findViewById(R.id.card3);
     card4 = (CardView) findViewById(R.id.card4);
     card5 = (CardView) findViewById(R.id.card5);


     //set Click listener for each card view
        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);
        card5.setOnClickListener(this);



        //set the id of drawer layout, navigation view and toolbar
        drawerLayout = findViewById(R.id.drawer_layout);



        //set navigation bar to open on toolbar menu
        navigationView = (NavigationView)findViewById(R.id.nav_view);
        toolbar = findViewById(R.id.toolbar);
        navigationView.setItemIconTintList(null);
        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,
                R.string.navigation_drawer_open,
                R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();


        //set a main activities on navigation bar to menuItem

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId())
                {
                    case  R.id.maddis:

                          Intent intent = new Intent(MainActivity.this,Mezmur1.class);
                          startActivity(intent);
                          break;

                    case  R.id.mmesqel:

                        Intent intent1 = new Intent(MainActivity.this,Mezmur2.class);
                        startActivity(intent1);
                        break;

                    case  R.id.mtsige:

                        Intent intent2 = new Intent(MainActivity.this,Mezmur3.class);
                        startActivity(intent2);
                        break;

                     case  R.id.mlidet:
                         
                        Intent intent3 = new Intent(MainActivity.this,Mezmur4.class);
                        startActivity(intent3);
                         break;

                    case  R.id.mtimeqet:

                        Intent intent4 = new Intent(MainActivity.this,Mezmur5.class);
                        startActivity(intent4);
                        break;

                    case  R.id.mserg:

                        Intent intent5 = new Intent(MainActivity.this,Mezmur6.class);
                        startActivity(intent5);
                        break;

                    case  R.id.myensha:

                        Intent intent6 = new Intent(MainActivity.this,Mezmur7.class);
                        startActivity(intent6);
                        break;

                    case  R.id.mhosaena:

                        Intent intent7 = new Intent(MainActivity.this,Mezmur8.class);
                        startActivity(intent7);
                        break;

                    case  R.id.mtinsae:

                        Intent intent8 = new Intent(MainActivity.this,Mezmur9.class);
                        startActivity(intent8);
                        break;

                    case  R.id.mmedihanialem:

                        Intent intent9 = new Intent(MainActivity.this,Mezmur10.class);
                        startActivity(intent9);
                        break;

                    case  R.id.memebete:

                        Intent intent10 = new Intent(MainActivity.this,Mezmur11.class);
                        startActivity(intent10);
                        break;


                    case  R.id.myemelaekt:

                        Intent intent11 = new Intent(MainActivity.this,Mezmur12.class);
                        startActivity(intent11);
                        break;

                    case  R.id.mkidusan:

                        Intent intent12 = new Intent(MainActivity.this,Mezmur13.class);
                        startActivity(intent12);
                        break;

                    case  R.id.mmahiber:

                        Intent intent13 = new Intent(MainActivity.this,Mezmur14.class);
                        startActivity(intent13);
                        break;

                    case  R.id.nav_share:
                        try {
                            Intent intent14 = new Intent(Intent.ACTION_SEND);
                            intent14.setType("text/plain");
                            intent14.putExtra(Intent.EXTRA_SUBJECT,"ዝማሬ  መላእክት");
                            intent14.putExtra(Intent.EXTRA_TEXT,"https://play.google.com/store/apps/datails?id="+getApplication().getPackageName());
                            startActivity(Intent.createChooser(intent14,"Share Withe"));
                        }

                        catch (Exception e){
                            Toast.makeText(MainActivity.this, "unable to share this app", Toast.LENGTH_SHORT).show();
                             }
                        break;


                    case R.id.nav_about:
                        Toast.makeText(MainActivity.this, "version 1.0.1", Toast.LENGTH_SHORT).show();
                        break;
                }

                return false;
            }
        });




    }


    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START))
        {
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        else{
            super.onBackPressed();
        }

    }


    //set onClick method for each main activity

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.card1:
                i = new Intent(this,Mawicha1.class);startActivity(i);
                break;
            case R.id.card2:
                i = new Intent(this,Mawicha2.class);startActivity(i);break;
            case R.id.card3:
                i = new Intent(this,Mawicha3.class);startActivity(i);break;
            case R.id.card4:
                i = new Intent(this,Mawicha4.class);startActivity(i);break;
            case R.id.card5:
                i = new Intent(this,Mezmur14.class);startActivity(i);break;
            case R.id.maddis:
                i = new Intent(MainActivity.this,Mezmur1.class);
                startActivity(i);
                default:break;

        }
    }


}