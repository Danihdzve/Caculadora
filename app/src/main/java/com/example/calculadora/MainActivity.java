package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1; //con edit text indicamos que hay elemento donde se pued moodificar texto
    private EditText et2;
    private TextView tv1; //se indican componentes que se van a utilizar

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.txtn1); //clase r da comunicacion entre parte logica y parte grafica, mando traer primer valor
        et2 = (EditText)findViewById(R.id.txtn2);
        tv1 = (TextView)findViewById(R.id.resultado);
    }

    //parte funcional, este metodo realiza la suma
    public void Sumar(View view) {
        String valor1 = et1.getText().toString();//mando llamar el numero y se convierte a string
        String valor2 = et2.getText().toString();

        int num = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);

        int suma = num + num2;

        String res = String.valueOf(suma); // se convierte de entero a string
        tv1.setText(res); // se manda el resultado al textview
    }
}