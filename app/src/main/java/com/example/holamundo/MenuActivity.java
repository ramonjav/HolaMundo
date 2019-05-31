package com.example.holamundo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.holamundo.listado.ListadoNotasActivity;

public class MenuActivity extends AppCompatActivity {

    Button notifi;
    Button list;
    Button listnot;
    TextView bienvenida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        notifi = findViewById(R.id.btnnoti);
        list = findViewById(R.id.btnlist);
        listnot = findViewById(R.id.btnlistnot);
        bienvenida = findViewById(R.id.txtbien);

        Bundle ext = getIntent().getExtras();

        bienvenida.setText("Bienvenido " + ext.getString("nombre", "sin nombre")+" :D");

        notifi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, NotificacionesActivity.class);
                startActivity(intent);
            }
        });

        list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, ListadoActivity.class);
                startActivity(intent);
            }
        });

        listnot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, ListadoNotasActivity.class);
                startActivity(intent);
            }
        });
    }
}
