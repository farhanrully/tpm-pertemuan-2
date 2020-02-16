package com.example.hitungluas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn_segitiga,btn_jajargenjang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    btn_segitiga = findViewById(R.id.btn_segitiga);
    btn_jajargenjang = findViewById(R.id.btn_jajargenjang);

    btn_segitiga.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(),SegitigaActivity.class);
            startActivity(intent);
        }
    });
    btn_jajargenjang.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(),JajargenjangActivity.class);
            startActivity(intent);
        }
    });
    }


}
