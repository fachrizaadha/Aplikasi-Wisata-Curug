package com.example.toshiba.wisatacurugbogor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Curug extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_curug);
        //Menginialisasi dan memanggil widget button pada file Layout

        ImageView curug1 = (ImageView) findViewById(R.id.curug1);
        ImageView curug2 = (ImageView) findViewById(R.id.curug2);
        ImageView curug3 = (ImageView) findViewById(R.id.curug3);
        ImageView curug4 = (ImageView) findViewById(R.id.curug4);
        ImageView curug5 = (ImageView) findViewById(R.id.curug5);
        ImageView curug6 = (ImageView) findViewById(R.id.curug6);
        ImageView curug7 = (ImageView) findViewById(R.id.curug7);
        ImageView curug8 = (ImageView) findViewById(R.id.curug8);
        ImageView curug9 = (ImageView) findViewById(R.id.curug9);
        ImageView curug10 = (ImageView) findViewById(R.id.curug10);

        curug1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Todo Auto Generated method stub
                Intent pindah = new Intent(Curug.this, CurugCibereum.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent
            }
        });
        curug2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Todo Auto Generated method stub
                Intent pindah = new Intent(Curug.this, CurugLeuwiHejo.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent
            }
        });
        curug3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Todo Auto Generated method stub
                Intent pindah = new Intent(Curug.this, CurugBidadari.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent
            }
        });
        curug4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Todo Auto Generated method stub
                Intent pindah = new Intent(Curug.this, CurugCilember.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent
            }
        });
        curug5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Todo Auto Generated method stub
                Intent pindah = new Intent(Curug.this, CurugNgumpet.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent
            }
        });
        curug6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Todo Auto Generated method stub
                Intent pindah = new Intent(Curug.this, CurugLeuwiLieuk.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent
            }
        });
        curug7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Todo Auto Generated method stub
                Intent pindah = new Intent(Curug.this, CurugBarong.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent
            }
        });

        curug8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    //Todo Auto Generated method stub
                    Intent pindah = new Intent(Curug.this, CurugPanjang.class);
                    startActivity(pindah);
                    //menghubungkan antar activity dengan intent
                }
            });
        curug9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    //Todo Auto Generated method stub
                    Intent pindah = new Intent(Curug.this,CurugLuhur.class);
                    startActivity(pindah);
                    //menghubungkan antar activity dengan intent
                }
            });
        curug10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Todo Auto Generated method stub
                Intent pindah = new Intent(Curug.this,CurugCiheurang.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent

            }
        });
    }
}

