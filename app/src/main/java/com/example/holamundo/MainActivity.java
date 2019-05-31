package com.example.holamundo;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import com.example.holamundo.listado.ListadoNotasActivity;

public class MainActivity extends AppCompatActivity {

    String pa = "1234";

    TextInputEditText pass;

    Button btnaceptar;
    TextInputEditText nombre;
    CheckBox save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pass = findViewById(R.id.txtPass);
        btnaceptar = findViewById(R.id.btnAcep);
        nombre = findViewById(R.id.txtname);
        save = findViewById(R.id.checkmaje);


        SharedPreferences prefs = getSharedPreferences("preferencias", Context.MODE_PRIVATE);

        pass.setText(prefs.getString("password", ""));
        nombre.setText(prefs.getString("nombrep", ""));
        save.setChecked(prefs.getBoolean("save", false));



       btnaceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String paa = pass.getText().toString();
                String name = nombre.getText().toString();

                if(save.isChecked()){

                    SharedPreferences pref = getSharedPreferences("preferencias", Context.MODE_PRIVATE);

                    SharedPreferences.Editor edit = pref.edit();

                    edit.putString("password", pass.getText().toString());
                    edit.putString("nombrep", nombre.getText().toString());
                    edit.putBoolean("save", save.isChecked());

                    edit.commit();

                }else{

                    SharedPreferences pref = getSharedPreferences("preferencias", Context.MODE_PRIVATE);

                    SharedPreferences.Editor edit = pref.edit();

                    edit.putString("password", "");
                    edit.putString("nombrep", "");
                    edit.putBoolean("save", save.isChecked());

                    edit.commit();

                }

                if(name.isEmpty())
                    nombre.setError("Tienes que indroducir un correo");

                if(paa.isEmpty())
                    pass.setError("Tienes que indroducir una contraseña");

                if(!paa.equals(pa)){
                    pass.setText("");
                    pass.setError("Contraseña incorrecta");
                }

                if(paa.equals(pa)){

                    Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                    intent.putExtra("nombre", name);
                    startActivity(intent);

                }
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("COMPROBANDO", "Ejecutandose en el onStart");

    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.i("COMPROBANDO", "Ejecutandose en el onResume");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.i("COMPROBANDO", "Ejecutandose en el onPauset");


    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i("COMPROBANDO", "Ejecutandose en el onStop");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("COMPROBANDO", "Ejecutandose en el onDestroy");
    }
}
