package com.skehmatics.ejercicio4;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Reverso extends AppCompatActivity {
ConstraintLayout fondo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reverso);

        // codigo pa ligar
        fondo = findViewById(R.id.fondo);
        // codigo para click en el fondo
        fondo.setOnClickListener(evento ->{
            // codigo para lanzar una actividad
            Intent actividad = new Intent(this, Frente.class);
            startActivity(actividad);
            // codigo para cerrar esta actividad
            finish();
        });


    }
}
