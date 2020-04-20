package com.example.hello_world;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mBtnTextview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnTextview = findViewById(R.id.btn_textview1);
        mBtnTextview.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //jump text1 page
                Intent intent = new Intent(MainActivity.this,text_viewActivity.class);
                startActivity (intent);


            }

        });
    }
}
