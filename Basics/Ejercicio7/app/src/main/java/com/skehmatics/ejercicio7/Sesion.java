package com.skehmatics.ejercicio7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Sesion extends AppCompatActivity {
    // variables globales
    EditText correo;
    EditText contrasenia;
    Button iniciar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sesion);

        //ligar
        correo = findViewById(R.id.correo);
        contrasenia = findViewById(R.id.contrasenia);
        iniciar = findViewById(R.id.iniciar);
        // codigo click boton
        iniciar.setOnClickListener(evento ->{
            if (correo.getText().toString().equals("")){
                // mandar mensaje
                Toast.makeText(getApplicationContext(),
                        "Falta el correo electronico",
                        Toast.LENGTH_SHORT).show();
                return;
            }
            if (contrasenia.getText().toString().equals("")){
                // mandar mensaje
                Toast.makeText(getApplicationContext(),
                        "Falta la contraseña",
                        Toast.LENGTH_SHORT).show();
                return;
            }
            if (correo.getText().toString().equals("jose@gmail.com")){
                if (contrasenia.getText().toString().equals("123")){
                    // lanza una actividad
                    Intent actividad = new Intent(this,Bienvenida.class);
                    startActivity(actividad);
                    // cerrar
                    finish();
                }
                else {
                    // mandar un mensaj

                    Toast.makeText(getApplicationContext(),
                            "Contraseña incorrecta",
                            Toast.LENGTH_SHORT).show();

                return;
                }
            }
            else {
                // mandar un mensaj

                Toast.makeText(getApplicationContext(),
                        " Correo incorrecto",
                        Toast.LENGTH_SHORT).show();

                return;
            }

        });
    }
}
