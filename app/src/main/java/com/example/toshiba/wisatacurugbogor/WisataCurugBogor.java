package com.example.toshiba.wisatacurugbogor;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class WisataCurugBogor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata_curug_bogor);
        //menginialisasi dan memanggil widget image button pada file layout

        ImageView imv1 = (ImageView) findViewById(R.id.imv1);
        ImageView imv2 = (ImageView) findViewById(R.id.imv2);
        ImageView imv3 = (ImageView) findViewById(R.id.imv3);
        ImageView imv4 = (ImageView) findViewById(R.id.imv4);

        imv1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                //TODO Auto Generated Method stub
                Intent pindah = new Intent(WisataCurugBogor.this, Curug.class);
                startActivity(pindah);
                //menghubungkan antar activity Intent
            }
        });
        imv2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                //TODO Auto Generated Method stub
                Intent pindah = new Intent(WisataCurugBogor.this, Tips.class);
                startActivity(pindah);
                //menghubungkan antar activity Intent
            }
        });
        imv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah = new Intent(WisataCurugBogor.this, Tentang.class);
                startActivity(pindah);
                //menghubungkan antar activiy Intent
            }
        });
        imv4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                //TODO Auto Generated Method stub
                Intent pindah = new Intent(WisataCurugBogor.this, MapsActivity.class);
                startActivity(pindah);
                //menghubungkan antar activity Intent
            }
        });
    }
        public void onBackPressed() {
            new AlertDialog.Builder(this)
                    .setMessage("Apakah anda ingin menutup aplikasi?")
                    .setCancelable(false)
                    .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            WisataCurugBogor.this.finish();
                        }
                    })
                    .setNegativeButton("Tidak", null)
                    .show();
    }
}
