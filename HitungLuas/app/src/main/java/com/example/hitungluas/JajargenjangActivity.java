package com.example.hitungluas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class JajargenjangActivity extends AppCompatActivity {
    private Button btn_luas;
    private EditText et_alas, et_tinggi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jajargenjang);

        btn_luas = findViewById(R.id.btn_luas);
        et_alas = findViewById(R.id.et_alas);
        et_tinggi = findViewById(R.id.et_tinggi);

        btn_luas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sAlas = et_alas.getText().toString();
                    String sTinggi = et_tinggi.getText().toString();

                    double alas = Double.parseDouble(sAlas);
                    double tinggi = Double.parseDouble(sTinggi);

                    double hasil = alas * tinggi;

                    Intent intent = new Intent(JajargenjangActivity.this, HasilActivity.class);
                    intent.putExtra("hasil", hasil);
                    startActivity(intent);
                } catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "Ada yang Eror", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
