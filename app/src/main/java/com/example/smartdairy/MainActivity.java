package com.example.smartdairy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {



    ImageView GoPay,GoNote,GoToDo,GoHealth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        GoHealth=findViewById(R.id.GoHealth);
        GoNote=findViewById(R.id.GoNote);
        GoPay=findViewById(R.id.GoPay);
        GoToDo=findViewById(R.id.GoToDo);

        GoNote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ShowNote.class);
                startActivity(intent);
            }
        });


    }
}