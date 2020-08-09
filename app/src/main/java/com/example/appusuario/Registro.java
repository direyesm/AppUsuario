package com.example.appusuario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Registro extends AppCompatActivity {

    private EditText nombre, apepater,apemater, pass1, pass2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        nombre = findViewById(R.id.txtnombrer);
        apepater = findViewById(R.id.txtapelpar);
        apemater = findViewById(R.id.txtapelmar);
        pass1 = findViewById(R.id.txtpass);
        pass2 = findViewById(R.id.txtpassr);

        nombre.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                EditText et = (EditText) view;
                if(et.getText().toString().length() == 0 && b == Boolean.FALSE){
                    nombre.setError("Ingrese un nombre");
                    Toast.makeText(Registro.this, "Ingrese su nombre", Toast.LENGTH_LONG).show();
                }
            }
        });
        apepater.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                EditText et = (EditText) view;
                if(et.getText().toString().length() == 0 && b == Boolean.FALSE){
                    apepater.setError("Ingrese su apellido paterno");
                    Toast.makeText(Registro.this, "Ingrese su apellido paterno", Toast.LENGTH_LONG).show();
                }
            }
        });
        apemater.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                EditText et = (EditText) view;
                if(et.getText().toString().length() == 0 && b == Boolean.FALSE){
                    apemater.setError("Ingrese su apellido Materno");
                    Toast.makeText(Registro.this, "Ingrese su apellido Materno", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public void atras(View view){

        Intent atras = new Intent(this,  MainActivity.class);
        startActivity(atras);
    }
}