package com.example.act11;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.pamactivity9.R;


public class MainActivity extends AppCompatActivity {
    Button tambahBtn, lihatBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tambahBtn = findViewById(R.id.Btntmbh);
        lihatBtn = findViewById(R.id.btnSelect);

        tambahBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, com.example.act11.TambahData.class);
                startActivity(intent);
            }
        });
        lihatBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(com.example.act11.LihatBarang.getActIntent(MainActivity.this));
            }
        });
    }

}