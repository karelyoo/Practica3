package com.example.david.practica3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText Numero;
    TextView Resultado;
    String result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void convertir(View view){
        Numero = (EditText)findViewById(R.id.edtxt1);
        Resultado = (TextView)findViewById(R.id.txt2);
        int hr, min, seg, dec;
        double num = Double.parseDouble(Numero.getText().toString());

        hr = (int)num;
        num = (num - hr) * 60;
        min = (int)num;
        num = (num - min) * 60;
        seg = (int)num;
        num = (num - seg) * 60;
        dec = (int)num;

        result = "Horas: " + hr + "\nMinutos: "
                + min + "\nSegundos: " + seg +
                "\nDecimales: " + dec;

        Resultado.setText(result);

    }

}
