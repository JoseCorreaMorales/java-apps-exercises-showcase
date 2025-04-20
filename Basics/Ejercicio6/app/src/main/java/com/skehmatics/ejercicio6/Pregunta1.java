package com.skehmatics.ejercicio6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;

public class Pregunta1 extends AppCompatActivity {
// variables globales
    Button siguiente;
    RadioButton correcta;
    int aciertos = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pregunta1);
        // ligar
        siguiente = findViewById(R.id.siguiente);
        correcta = findViewById(R.id.correcta);
        // click en boton
        siguiente.setOnClickListener(evento -> {
            if (correcta.isChecked()){
                aciertos++;
            }
            // lanzar actividad
            Intent actividad = new Intent(this, Pregunta2.class);
            // codigo enviar
            actividad.putExtra("aciertos", aciertos);
            startActivity(actividad);
            // cerrar
            finish();
        });
    }

    // evitar cierre
    @Override
    public void onBackPressed(){
        onResume();
    }

}

