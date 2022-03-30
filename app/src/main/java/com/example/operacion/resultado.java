package com.example.operacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class resultado extends AppCompatActivity {

    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        tv1 = (TextView)findViewById(R.id.tv1);
        String dato=getIntent().getStringExtra("dato");
        tv1.setText("Hola "+dato);
    }
    //Regresar
    public void regresar (View view){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }

}