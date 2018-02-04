package com.tesarramadhan.studycase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity2 extends AppCompatActivity {
    TextView t_restoran, t_menu, t_porsi, t_harga;
    String restoran, menu;
    int porsi, harga;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);
        t_restoran = (TextView) findViewById(R.id.restoran);
        t_menu = (TextView) findViewById(R.id.menu);
        t_porsi = (TextView) findViewById(R.id.porsi);
        t_harga = (TextView) findViewById(R.id.harga);
        Intent intent = getIntent();
        restoran = intent.getStringExtra("restoran");
        menu = intent.getStringExtra("menu");
        porsi = intent.getIntExtra("porsi", 0);
        harga = intent.getIntExtra("harga", 0);
        t_restoran.setText(restoran); //kiri komponen, kanan variabel, setText utk mengisi komponen dgn data
        t_menu.setText(menu);
        t_porsi.setText("" + porsi);
        t_harga.setText("Rp." + harga);
        Toast toast = null;
        if (harga > 65000) {
            toast = Toast.makeText(getApplicationContext(), "Jangan makn disini, uang kamu tidak cukup", Toast.LENGTH_SHORT); //getAppCon dimana kita berada
        }else{
            toast = Toast.makeText(getApplicationContext(), "Makan disini aja", Toast.LENGTH_SHORT);
        }
        toast.show();
    }
}

