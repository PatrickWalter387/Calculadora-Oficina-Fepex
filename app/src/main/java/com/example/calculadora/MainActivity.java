package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtNum1;
    EditText edtNum2;
    TextView txtResultado;
    int num1;
    int num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNum1 = findViewById(R.id.edtNum1);
        edtNum2 = findViewById(R.id.edtNum2);
        txtResultado = findViewById(R.id.txtResultado);
    }

    public void Soma(View view) {
       num1 = Integer.parseInt(edtNum1.getText().toString());
       num2 = Integer.parseInt(edtNum2.getText().toString());

       txtResultado.setText("Resultado: " + (num1 + num2));
        Toast.makeText(MainActivity.this, "Resultado: " + (num1 + num2), Toast.LENGTH_SHORT).show();

    }

    public void Subtracao(View view) {
        num1 = Integer.parseInt(edtNum1.getText().toString());
        num2 = Integer.parseInt(edtNum2.getText().toString());

        txtResultado.setText("Resultado: " + (num1 - num2));
        Toast.makeText(MainActivity.this, "Resultado: " + (num1 - num2), Toast.LENGTH_SHORT).show();
    }

    public void Multiplicacao(View view) {
        num1 = Integer.parseInt(edtNum1.getText().toString());
        num2 = Integer.parseInt(edtNum2.getText().toString());

        txtResultado.setText("Resultado: " + (num1 * num2));
        Toast.makeText(MainActivity.this, "Resultado: " + (num1 * num2), Toast.LENGTH_SHORT).show();
    }

    public void Divisao(View view) {
        num1 = Integer.parseInt(edtNum1.getText().toString());
        num2 = Integer.parseInt(edtNum2.getText().toString());

        txtResultado.setText("Resultado: " + ((double) num1 / num2));
        Toast.makeText(MainActivity.this, "Resultado: " + ((double)num1 / num2), Toast.LENGTH_SHORT).show();
    }
}
