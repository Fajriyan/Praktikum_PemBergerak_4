package com.example.p_inten;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void jalan (View view){
        EditText nama = (EditText) findViewById(R.id.NAMAMU);
        EditText nim = (EditText) findViewById(R.id.NIM);
        RadioGroup jenis = (RadioGroup) findViewById(R.id.grupJk);
        RadioGroup jabatan = (RadioGroup) findViewById(R.id.grupjabatan);

        int pilihan = jenis.getCheckedRadioButtonId();
        RadioButton pilihanjenis = (RadioButton) findViewById(pilihan);

        int Jbt = jabatan.getCheckedRadioButtonId();
        RadioButton pilihanjabatan = (RadioButton) findViewById(Jbt);



        Intent kirim = new Intent(MainActivity.this, Main2Activity.class);
        kirim.putExtra("kirim_nama", nama.getText().toString());
        kirim.putExtra("kirim_nim", nim.getText().toString());
        kirim.putExtra("kirim_jk", pilihanjenis.getText().toString());
        kirim.putExtra("kirim_jbt", pilihanjabatan.getText().toString());


        startActivity(kirim);
    }
    public void Reset (View view){
        EditText nama = (EditText) findViewById(R.id.NAMAMU);
        EditText nim = (EditText) findViewById(R.id.NIM);
        RadioGroup jenis = (RadioGroup) findViewById(R.id.grupJk);
        RadioGroup jabatan = (RadioGroup) findViewById(R.id.grupjabatan);

        nama.setText(null);
        nim.setText(null);
    }
}
