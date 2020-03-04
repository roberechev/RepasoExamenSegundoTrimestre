package com.example.repasoexamensegundotrimestre;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button cambio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cambio = findViewById(R.id.cambio);
        cambio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cambiar();
            }
        });
    }

    public void cambiar() {
        Intent in = new Intent(this, Final.class);
        //in.addFlags(in.FLAG_ACTIVITY_NEW_TASK);
        //in.addFlags(in.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(in);

    }
}
