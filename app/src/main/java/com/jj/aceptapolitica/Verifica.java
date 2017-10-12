package com.jj.aceptapolitica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Verifica extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verifica);

        //------Relaciono el textView y escribio el texto con los datos obtenidos del MainActivity
        TextView nombreTV = (TextView) findViewById(R.id.nombreTV);
        final Bundle bundle = getIntent().getExtras();
        nombreTV.setText("Hola " + bundle.get("NOMBRE") + ", tu edad es " + bundle.getInt("EDAD") +
                " años. ¿Aceptas lapolitica de privacidad?");
        //int edad =




        ///*-*------------------------------------------------------------------------------------
        //------Relaciono los botonese indico que deben hacer cuando se pulsen
            //------Boton aceptar
        Button btAcepto = (Button) findViewById(R.id.aceptoBT);
        btAcepto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String respuesta;
                if(bundle.getInt("EDAD")>=18)
                    respuesta = "Aceptada sin restricciones";
                else
                    respuesta = "Aceptada con restricciones";

                Intent i = new Intent();
                i.putExtra("RESULTADO", respuesta);
                setResult(RESULT_OK, i);
                finish();
            }
        });
        //------Boton rechazar
        Button btRechazo = (Button) findViewById(R.id.rechazoBT);
        btRechazo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String respuesta = "Rechazada";
                Intent i = new Intent();
                i.putExtra("RESULTADO", respuesta);
                setResult(RESULT_OK, i);
                finish();
            }
        });
       // -------------------------------------------------------------------------------------*/
    }
}
