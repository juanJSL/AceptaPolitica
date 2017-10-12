package com.jj.aceptapolitica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private final static int CODIGO = 0;
    Button btVerificar;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btVerificar = (Button) findViewById(R.id.verificaBT);
        btVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lanzarVerifica();
            }
        });
    }

    public void lanzarVerifica(){
        EditText etNombre = (EditText) findViewById(R.id.nombreET) ;
        String nombre = etNombre.getText().toString();
        EditText etEdad = (EditText) findViewById(R.id.edadET);
        int edad = Integer.parseInt(etEdad.getText().toString());

        Intent i = new Intent(this, Verifica.class);
        Bundle bundle = new Bundle();
        bundle.putString("NOMBRE", nombre);
        bundle.putInt("EDAD", edad);
        i.putExtras(bundle);
        startActivityForResult(i, CODIGO);
    }

    protected void onActivityResult( int requestCode, int resultCode, Intent data) {
        if (requestCode == CODIGO && resultCode == RESULT_OK) {
            String respuesta= "Hola";
            respuesta = data.getExtras().getString("RESULTADO");
            resultado = (TextView) findViewById(R.id.resultadoTV);
            resultado.setText(respuesta);

        }
    }


}
