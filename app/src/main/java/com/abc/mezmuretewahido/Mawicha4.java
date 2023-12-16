package com.abc.mezmuretewahido;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class Mawicha4 extends AppCompatActivity implements View.OnClickListener{
    private CardView Meze1;
    CardView Meze2;
    CardView Meze3;
    CardView Meze4;
    Toolbar mToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mawicha4);


        mToolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);

        Meze1 = (CardView) findViewById(R.id.Meze1);
        Meze2 = (CardView) findViewById(R.id.Meze2);
        Meze3 = (CardView) findViewById(R.id.Meze3);
        Meze4 = (CardView) findViewById(R.id.Meze4);



        Meze1.setOnClickListener(this);
        Meze2.setOnClickListener(this);
        Meze3.setOnClickListener(this);
        Meze4.setOnClickListener(this);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(item.getItemId()==android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.Meze1:
                i = new Intent(this,Mezmur10.class);startActivity(i);break;

            case R.id.Meze2:
                i = new Intent(this,Mezmur11.class);startActivity(i);break;

            case R.id.Meze3:
                i = new Intent(this,Mezmur12.class);startActivity(i);break;
            case R.id.Meze4:
                i = new Intent(this,Mezmur13.class);startActivity(i);break;
            default:break;
        }

    }
}
