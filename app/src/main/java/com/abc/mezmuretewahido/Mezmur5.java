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

public class Mezmur5 extends AppCompatActivity {
    ArrayAdapter mAdapter;
    TextView mEmptyView;
    Toolbar mToolbar;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mezmur5);




        mToolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        String[] tStory=getResources().getStringArray(R.array.title_story5);
        String[] dStory=getResources().getStringArray(R.array.detail_story5);

        listView =(ListView) findViewById(R.id.list2);
        mEmptyView = (TextView) findViewById(R.id.emptyVeiw);



        listView=findViewById(R.id.list2);


        mAdapter = new ArrayAdapter(Mezmur5.this,
                android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.title_story5));
        listView.setAdapter(mAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String t=dStory[position];
                Intent intent=new Intent(Mezmur5.this,zirzir.class);
                intent.putExtra("story",t);
                startActivity(intent);
            }
        });
        listView.setEmptyView(mEmptyView);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(item.getItemId()==android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}