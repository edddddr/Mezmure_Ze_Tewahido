# Zimare_Melaekt
####  Song lyrics displayer

## IDE
#### Android Studio 
![OIP](https://github.com/edddddr/Mezmure_Ze_Tewahido/assets/97146464/559a9d88-83e0-433e-acf2-0b8ff73451e6)
> Languages `Java ` and `XML`

- The aim of this project is to assisting the singer to see song lyrics on his/her mobile screen their preference.
- Java and XML are more interactive and have fast reposive time compairing from other Programming languages.
- Fore the features will add Search bar(engine), night mood futures. 

[========]


| Main Directory
| ------------ |
|[ .idea](https://github.com/edddddr/Mezmure_Ze_Tewahido/tree/main/.idea " .idea")  |
|[app](https://github.com/edddddr/Mezmure_Ze_Tewahido/tree/main/app "app")   |
|[gradle/wrapper](https://github.com/edddddr/Mezmure_Ze_Tewahido/tree/main/gradle/wrapper "gradle/wrapper")   |

## Sample Code


`Java`


    public class Mawicha1 extends AppCompatActivity implements View.OnClickListener {
        private CardView Meze1;
                CardView Meze2;
                CardView Meze3;
                Toolbar mToolbar;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_mawicha1);
    
            //call toolbar id form xml and set toolbar instead of action bar
            mToolbar = (Toolbar)findViewById(R.id.toolbar);
            setSupportActionBar(mToolbar);
    
            Meze1 = (CardView) findViewById(R.id.Meze1);
            Meze2 = (CardView) findViewById(R.id.Meze2);
            Meze3 = (CardView) findViewById(R.id.Meze3);
    
    
    
            Meze1.setOnClickListener(this);
            Meze2.setOnClickListener(this);
            Meze3.setOnClickListener(this);
    
              //for back arrow button
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    
        }
    
        //set on option menu for back button arrow
        @Override
        public boolean onOptionsItemSelected(@NonNull MenuItem item) {
    
            if(item.getItemId()==android.R.id.home){
                finish();
            }
            return super.onOptionsItemSelected(item);
        }
    
        //set onclick for each Activities
        @Override
        public void onClick(View v) {
            Intent i;
            switch (v.getId()) {
                case R.id.Meze1:
                    i = new Intent(this,Mezmur1.class);startActivity(i);
                    break;
    
                case R.id.Meze2:
                    i = new Intent(this,Mezmur2.class);startActivity(i);
                    break;
    
                case R.id.Meze3:
                    i = new Intent(this,Mezmur3.class);startActivity(i);
                    break;
    
            }
    
    
        }
    
    
        }

`XML`


    <?xml version="1.0" encoding="utf-8"?>
    <RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        xmlns:tools="http://schemas.android.com/tools"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:orientation="vertical"
        tools:context=".Mezmur1">
    
    
    
        <include
            android:id="@+id/toolbar"
            layout="@layout/toolbar" />
        <TextView
            android:id="@+id/emptyVeiw"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_centerInParent="true"
            android:text="No Results"
            android:textSize="20sp"
            android:visibility="gone"/>
    
    
        <ListView
            android:id="@+id/list2"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_below="@+id/toolbar" />
    
    
    </RelativeLayout>



## UI/UX


- The UI/UX is designed using Adobe XD.
- Their is four common layout pages.
> -  Home page
> -  CardeViews
> -  List views
> - Lyrics Container

`Home page`

![photo_4_2023-12-07_10-05-42](https://github.com/edddddr/Mezmure_Ze_Tewahido/assets/97146464/893a3a0b-7e9e-447b-b570-f30f88dcaa29)

  `CardeViews`

![photo_2_2023-12-07_10-05-42](https://github.com/edddddr/Mezmure_Ze_Tewahido/assets/97146464/50b1d7c9-4952-4175-ad2a-16cec05628c2)

 `List views`

![photo_3_2023-12-07_10-05-42](https://github.com/edddddr/Mezmure_Ze_Tewahido/assets/97146464/548a2a7b-5df8-413b-a472-945e56a260e4)

`Lyrics Container`

![photo_1_2023-12-07_10-05-42](https://github.com/edddddr/Mezmure_Ze_Tewahido/assets/97146464/2491a94a-324e-43c5-b4b3-8b119db83792)

#Author
Endrias Thomas  Email[endt6342@gmail.com]
