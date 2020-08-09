package com.example.actionupbuttondemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    TextView textView,like,clap,dontlike;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // this is the code of how to enable the home or back arrow in actionbar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        textView = findViewById(R.id.secondactivityTextView);


        String get = getIntent().getStringExtra("key");


        textView.setText(get);

        // finding

        like = findViewById(R.id.likeId);
        clap = findViewById(R.id.clapId);
        dontlike = findViewById(R.id.dontlikeId);


        like.setOnClickListener(this);
        clap.setOnClickListener(this);
        dontlike.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {





        switch (v.getId()){

            case R.id.likeId:
                Toast.makeText(getApplicationContext(),"Like It",Toast.LENGTH_SHORT).show();
                break;

                case R.id.clapId:

                    Toast.makeText(getApplicationContext(),"Like It",Toast.LENGTH_SHORT).show();

                    break;


                case R.id.dontlikeId:
                    Toast.makeText(getApplicationContext(),"Like It",Toast.LENGTH_SHORT).show();

                    break;





        }



    }


    // this code is optional
    // we can use a very different way and a very simple way to make what is happend after clicking
    // back button or up button
    // that's why we need to go android manifests

   /* @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(item.getItemId()==android.R.id.home){

            this.finish();

        }


        return super.onOptionsItemSelected(item);
    }*/
}
