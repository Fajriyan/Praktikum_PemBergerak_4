package com.example.p_inten;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView tampil1,tampil2,tampil3,tampil4,tampil5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tampil1 = (TextView) findViewById(R.id.nama_terima);
        tampil2 = (TextView) findViewById(R.id.nim_terima);
        tampil3 = (TextView) findViewById(R.id.jk_terima);
        tampil4 = (TextView) findViewById(R.id.gaji_terima);
        tampil5 = (TextView) findViewById(R.id.jbt_terima);

        Intent terima_hasil = getIntent();
        String input_nama = (String) terima_hasil.getSerializableExtra("kirim_nama");
        String input_nim = (String) terima_hasil.getSerializableExtra("kirim_nim");
        String input_jk = (String) terima_hasil.getSerializableExtra("kirim_jk");
        String input_jbt = (String) terima_hasil.getSerializableExtra("kirim_jbt");

        if (input_jbt.equals("     DIREKTUR    ")){
            tampil5.setText(input_jbt);
            tampil4.setText("20 JUTAA");
        } else if (input_jbt.equals("    MANAGER    ")){
            tampil5.setText(input_jbt);
            tampil4.setText("10 JUTAA");
        } else if (input_jbt.equals("PROGRMANER")){
            tampil5.setText(input_jbt);
            tampil4.setText("5 JUTAA");
        } else if (input_jbt.isEmpty()){
            tampil5.setText(input_jbt);
            tampil4.setText("Masukkan Jabatan Dahulu");
        }

        tampil1.setText(input_nama);
        tampil2.setText(input_nim);
        tampil3.setText(input_jk);


    }
}
