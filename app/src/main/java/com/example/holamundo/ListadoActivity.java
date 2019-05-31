package com.example.holamundo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListadoActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView lista;

    ArrayList<String> datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado);

        lista = findViewById(R.id.listado);

        datos = new ArrayList<>();

        datos.add("Говно");
        datos.add("Блядь");
        datos.add("Пиздец");
        datos.add("Сука");
        datos.add("Сукин сын");
        datos.add("Ссыкун");
        datos.add("Ёб твою мать");
        datos.add("Хуй");
        datos.add("Хуй тебе за щеку!");
        datos.add("Хуем груши околачивать");
        datos.add("Maje");
        datos.add("Pendejo");
        datos.add("Hijuelagranputa");
        datos.add("Joputa");


        ArrayAdapter adaptador = new ArrayAdapter(this, android.R.layout.simple_list_item_1, datos);

        lista.setAdapter(adaptador);

        lista.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        Toast.makeText(this, datos.get(position), Toast.LENGTH_LONG).show();

    }
}
