package com.skehmatics.ejercicio6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;

public class Pregunta2 extends AppCompatActivity {
    // variables globales
    Button siguiente;
    RadioButton correcta;
    int aciertos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pregunta2);
        // recibir
        aciertos =  getIntent().getIntExtra("aciertos", 0);
        // ligar
        siguiente = findViewById(R.id.siguiente);
        correcta = findViewById(R.id.correcta);
        // click en boton
        siguiente.setOnClickListener(evento -> {
            if (correcta.isChecked()){
                aciertos++;
            }
            // lanzar actividad
            Intent actividad = new Intent(this, Pregunta3.class);
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

