package com.example.actionupbuttondemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private GridView gridView;
    int[] image = {R.drawable.england,R.drawable.france , R.drawable.germany,
    R.drawable.india,R.drawable.iran , R.drawable.norway};

    String[] imagename = {"england","France","Germany" ,"India" , "Iran" , "Norway"};

    String[] countryInfo;


    // creating base adapter
    CustomAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // we use logo in this seceniario
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.user);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        // last methos was set Display Use Logo Enable make it true otherwise the program can not show logo


        inOne();

    }

    public void inOne(){
        gridView = findViewById(R.id.gridviewId);

        adapter = new CustomAdapter(getApplicationContext(),image,imagename);

        gridView.setAdapter(adapter);

        countryInfo = getResources().getStringArray(R.array.countryInfo);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("key",countryInfo[position].toString());
                startActivity(intent);


            }
        });




    }





/*    @Override
    public void onBackPressed() {
        super.onBackPressed();


        Toast.makeText(MainActivity.this,"Double Click to exit",Toast.LENGTH_SHORT).
                show();


    }*/
}
