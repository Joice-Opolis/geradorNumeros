package com.example.geradornumeros;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText idQtdNum;
    Button bGerarNum;
    TextView idNumGerados;

    int vetorNumeros[];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idQtdNum=findViewById(R.id.idQtdNum);
        bGerarNum=findViewById(R.id.bGerarNum);
        idNumGerados=findViewById(R.id.idNumGerados);

        bGerarNum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String idPegaQtdNum = idQtdNum.getText().toString();
                int intIdPegaQtdNum = Integer.parseInt(idPegaQtdNum);

                vetorNumeros = new int [intIdPegaQtdNum];


                for (int i: vetorNumeros){
                    int sorteiaNumeros = (int) (Math.random()*intIdPegaQtdNum);
                    vetorNumeros.getClass(sorteiaNumeros);
                }
            }
        });

    }
}