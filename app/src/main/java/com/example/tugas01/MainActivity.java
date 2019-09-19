package com.example.tugas01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    private LinearLayout btnSimulasi, btnCuaca, btnNilai, btnProfil, btnIkon1, btnIkon2, btnSaran, btnTentang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSimulasi = (LinearLayout) findViewById(R.id.btnSimulasi);

        btnSimulasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent simulasiN = new Intent(MainActivity.this,simulasi.class);
                startActivity(simulasiN);
            }
        });

        btnCuaca = (LinearLayout) findViewById(R.id.btnCuaca);

        btnCuaca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cuacaN = new Intent(MainActivity.this,cuaca.class);
                startActivity(cuacaN);
            }
        });

        btnNilai = (LinearLayout) findViewById(R.id.btnNilai);

        btnNilai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nilaiN = new Intent(MainActivity.this,nilai.class);
                startActivity(nilaiN);
            }
        });

        btnProfil = (LinearLayout) findViewById(R.id.btnProfil);

        btnProfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent profilN = new Intent(MainActivity.this,profil.class);
                startActivity(profilN);
            }
        });

        btnIkon1 = (LinearLayout) findViewById(R.id.btnIkon1);

        btnIkon1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ikon1N = new Intent(MainActivity.this,ikon1.class);
                startActivity(ikon1N);
            }
        });
        btnIkon2 = (LinearLayout) findViewById(R.id.btnIkon2);

        btnIkon2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ikon2N = new Intent(MainActivity.this,ikon2.class);
                startActivity(ikon2N);
            }
        });
        btnSaran = (LinearLayout) findViewById(R.id.btnSaran);

        btnSaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent saranN = new Intent(MainActivity.this,saran.class);
                startActivity(saranN);
            }
        });
        btnTentang = (LinearLayout) findViewById(R.id.btnTentang);

        btnTentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tentangN = new Intent(MainActivity.this,tentang.class);
                startActivity(tentangN);
            }
        });
    }
}
