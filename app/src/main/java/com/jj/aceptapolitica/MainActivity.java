package com.jj.aceptapolitica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btVerificar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btVerificar = (Button) findViewById(R.id.verificaBT);
    }

    public void lanzarVerifica(){
        Intent i = new Intent(this, Verifica.class);
    }
}
