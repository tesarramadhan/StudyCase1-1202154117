package com.tesarramadhan.studycase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText makanan, jumlah;
    Intent intent;
    String restoran, menu;
    int porsi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        makanan = (EditText)findViewById(R.id.makanan);
        jumlah = (EditText)findViewById(R.id.jumlah);
        intent = new Intent(this,MainActivity2.class);
    }
    public void onEatbus(View view) {
        menu = makanan.getText().toString();
        restoran = "Eatbus";
        porsi = Integer.parseInt(jumlah.getText().toString());
        int total = 50000 * porsi;
        Log.d( "TOTAL HARGA", "Rp."+total);
        intent.putExtra("restoran", restoran);
        intent.putExtra("menu", menu);
        intent.putExtra("porsi", porsi);
        intent.putExtra("harga", total);
        startActivity(intent);
    }
    public void onAbnormal(View view) {
        menu = makanan.getText().toString();
        restoran = "Abnormal";
        porsi = Integer.parseInt(jumlah.getText().toString());
        int total = 30000 * porsi;
        Log.d( "TOTAL HARGA", "Rp."+total);
        intent.putExtra("restoran", restoran);
        intent.putExtra("menu", menu);
        intent.putExtra("porsi", porsi);
        intent.putExtra("harga", total);
        startActivity(intent);
    }
}
