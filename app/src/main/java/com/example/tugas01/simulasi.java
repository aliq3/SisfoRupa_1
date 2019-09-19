package com.example.tugas01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class simulasi extends AppCompatActivity {
    private EditText nKehadiran;
    private EditText nTugas;
    private EditText nUts;
    private EditText nUas;
    private TextView vHasil;
    private Button btnHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simulasi);
        initUI();
        initEvent();
    }

    private void initEvent() {
        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HitungHasil();
            }

            private void HitungHasil() {
                int kehadiran = Integer.parseInt(nKehadiran.getText().toString());
                int tugas = Integer.parseInt(nTugas.getText().toString());
                int uts = Integer.parseInt(nUts.getText().toString());
                int uas = Integer.parseInt(nUas.getText().toString());
                int hasil = (( kehadiran * 10 ) / 16) + (( tugas * 20 ) / 100) + (( uts * 30 ) / 100) + (( uas * 40 ) / 100);
                if (hasil<50){
                    vHasil.setText("Hasil \n" + "\n" + "E");
                }
                else if (hasil<60){
                    vHasil.setText("Hasil \n" + "\n" + "D");
                }
                else if (hasil<70){
                    vHasil.setText("Hasil \n" + "\n" + "C");
                }
                else if (hasil<80){
                    vHasil.setText("Hasil \n" + "\n" + "B");
                }
                else if (hasil<=100){
                    vHasil.setText("Hasil \n" + "\n"  + "A");
                }
                //vHasil.setText("Hasil \n"+ hasil);
            }
        });
    }

    private void initUI() {
        nKehadiran = (EditText)findViewById(R.id.nKehadiran);
        nTugas = (EditText)findViewById(R.id.nTugas);
        nUts = (EditText)findViewById(R.id.nUts);
        nUas = (EditText)findViewById(R.id.nUas);
        vHasil = (TextView)findViewById(R.id.vHasil);
        btnHitung = (Button)findViewById(R.id.btnHitung);
    }
}
