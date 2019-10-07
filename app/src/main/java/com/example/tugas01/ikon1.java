package com.example.tugas01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class ikon1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ikon1);

    }

    public void telponNomor(View view){
        Uri uri = Uri.parse("tel:0895701992393");
        Intent it = new Intent(Intent.ACTION_DIAL, uri);
        startActivity(it);
    }
}
