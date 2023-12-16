package com.abc.mezmuretewahido;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Mezmur1 extends AppCompatActivity {
    ArrayAdapter mAdapter;
    TextView mEmptyView;
    Toolbar mToolbar;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mezmur1);


        //call toolbar id form xml and set toolbar instead of action bar
        mToolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);



        //for back arrow button
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        // get a string resource from string xml file
        String[] tStory=getResources().getStringArray(R.array.title_story1);
        String[] dStory=getResources().getStringArray(R.array.details_story1);



        listView =(ListView) findViewById(R.id.list2);
        //mEmptyView = (TextView) findViewById(R.id.emptyView);



        listView=findViewById(R.id.list2);


        //set string on array list view
        mAdapter = new ArrayAdapter(Mezmur1.this,
                android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.title_story1));
        listView.setAdapter(mAdapter);

        //set onclick listener on list view to get a new activity(zirzir)
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String t=dStory[position];
                Intent intent=new Intent(Mezmur1.this,zirzir.class);
                intent.putExtra("story",t);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(item.getItemId()==android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

}