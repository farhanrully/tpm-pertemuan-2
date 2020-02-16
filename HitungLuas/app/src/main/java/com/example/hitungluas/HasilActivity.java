package com.example.hitungluas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class HasilActivity extends AppCompatActivity {
    private TextView tv_hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        tv_hasil = findViewById(R.id.tv_hasil);
        double hasil = getIntent().getDoubleExtra("hasil", 0);
        String tHasil = ""+hasil;
        tv_hasil.setText(tHasil);
    }
}
