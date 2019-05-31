package com.example.holamundo.listado;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.holamundo.R;
import com.example.holamundo.datos.Nota;

import java.util.ArrayList;


public class ListadoNotasActivity extends AppCompatActivity {

    ListView ListViewNotas;
    ArrayList<Nota> listanotas;
    ListadoNotasAdapter lna;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado_notas);

        ListViewNotas = findViewById(R.id.listnotas);
        listanotas = new ArrayList<>();

        listanotas.add(new Nota("Ser buena persona", "Urgente"));
        listanotas.add(new Nota("Ser el mejor amigo del mundo para Nicole", "Urgente"));
        listanotas.add(new Nota("Ser guapo", "Importante"));
        listanotas.add(new Nota("Tomar agua", "Normal"));
        listanotas.add(new Nota("Cuidar de mi mismo", "Normal"));
        listanotas.add(new Nota("Coger", "Importante"));
        listanotas.add(new Nota("Ser buena persona", "Urgente"));
        listanotas.add(new Nota("Ser el mejor amigo del mundo para Nicole", "Urgente"));
        listanotas.add(new Nota("Ser guapo", "Importante"));
        listanotas.add(new Nota("Tomar agua", "Normal"));
        listanotas.add(new Nota("Cuidar de mi mismo", "Normal"));
        listanotas.add(new Nota("Coger", "Importante"));
        listanotas.add(new Nota("Ser buena persona", "Urgente"));
        listanotas.add(new Nota("Ser el mejor amigo del mundo para Nicole", "Urgente"));
        listanotas.add(new Nota("Ser guapo", "Importante"));
        listanotas.add(new Nota("Tomar agua", "Normal"));
        listanotas.add(new Nota("Cuidar de mi mismo", "Normal"));
        listanotas.add(new Nota("Coger", "Importante"));

        lna = new ListadoNotasAdapter(this, listanotas);
        ListViewNotas.setAdapter(lna);

    }
}
