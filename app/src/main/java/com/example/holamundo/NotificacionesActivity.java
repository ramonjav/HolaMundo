package com.example.holamundo;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.holamundo.listado.ListadoNotasActivity;

public class NotificacionesActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnToast;
    Button btnSnack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notificaciones);

        btnToast = findViewById(R.id.btntoast);
        btnSnack = findViewById(R.id.btnsnack);

        btnToast.setOnClickListener(this);
        btnSnack.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        Button botonpulsado = ( Button )v;

        if(botonpulsado == btnToast) {

            Toast.makeText(this, "¿vos que te crees loco?", Toast.LENGTH_LONG).show();
        }

        if(botonpulsado == btnSnack){

            Snackbar.make(v,"Hola gente, ¿como andan?", Snackbar.LENGTH_INDEFINITE).show();

        }

    }
}
