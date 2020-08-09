package com.example.appusuario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void registro(View View){
        
        Intent registro = new Intent(this, Registro.class);
        startActivity(registro);
    }

    public void inicio (View view){

        Intent inicio = new Intent(this, Inicio.class);
        startActivity(inicio);
    }
}