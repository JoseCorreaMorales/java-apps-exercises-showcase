package com.skehmatics.evaluacion1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Actividad1 extends AppCompatActivity {
    // variables globales
    Button integrantes;
    Button agenda;
    EditText contrasenia;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad1);
        // pa ligar
        integrantes = findViewById(R.id.Integrantes);
        agenda = findViewById(R.id.agenda);
        contrasenia = findViewById(R.id.contrasenia);
        // click pal boton
        agenda.setOnClickListener(evento -> {
            if (contrasenia.getText().toString().equals("")){
                // mandar un mensaje
                Toast.makeText(getApplicationContext(),
                        " Falta la contraseña :3",
                        Toast.LENGTH_SHORT).show();
                return;
            }
            if (contrasenia.getText().toString().equals("123")){
                // Lanzar la actividad
                Intent actividad = new Intent(this, Actividad2.class);
                startActivity(actividad);
                // Cerrar la actividad
                finish();

            }
            else {

                //mandar un mensaje
                Toast.makeText(getApplicationContext(),
                        "Contraseña incorrecta",
                        Toast.LENGTH_SHORT).show();
                return;
            }
        });
        integrantes.setOnClickListener(evento -> {
            // lanzar la actividad
            Intent actividad = new Intent(this, Informacion.class);
            startActivity(actividad);
        });




    }
}
