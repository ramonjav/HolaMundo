package com.example.holamundo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView txtsaludos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txtsaludos = findViewById(R.id.txtSaludo);

        Bundle ext = getIntent().getExtras();

        txtsaludos.setText("Hola " + ext.getString("nombre", "sin nombre") + " tu edad es: " + ext.getString("edad", "inmortal") + " y " + ext.getString("maj", "no te hagas") + " :D");
    }
}
