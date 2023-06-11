package com.example.convercion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText nu1, nu2, nu3, nu4;
    private TextView re1, re2;
    private Button bo1, bo2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nu1=(EditText)findViewById(R.id.num1);
        nu2=(EditText)findViewById(R.id.num2);
        nu3=(EditText)findViewById(R.id.num3);
        nu4=(EditText)findViewById(R.id.num4);
        re1=(TextView) findViewById(R.id.res1);
        re2=(TextView) findViewById(R.id.res2);
        bo1=(Button)findViewById(R.id.b1);
        bo2=(Button)findViewById(R.id.b2);
    }
    public void Opera1(View view){
        String v1= nu1.getText().toString();
        String v2= nu2.getText().toString();
        String v3= nu3.getText().toString();
        String v4= nu4.getText().toString();
        Double libra = Double.parseDouble(v1);
        Double pie = Double.parseDouble(v2);
        double a, b;
        String resultado;
        a=libra*0.453592;
        b=pie*0.3048;
        resultado= "libra a kilo es "+String.valueOf(a)+" pie a metro es "+String.valueOf(b);
        re1.setText(resultado);
    }
    public void Opera2(View view){

        String v3= nu3.getText().toString();
        String v4= nu4.getText().toString();
        Double kilo = Double.parseDouble(v3);
        Double metro = Double.parseDouble(v4);
        String be;
        double a, b;
        a=kilo*2.20462;
        b=metro*3.28084;
        be= "kilo a libra "+String.valueOf(a)+" metro a pie "+String.valueOf(b);
        re2.setText(be);
    }
}