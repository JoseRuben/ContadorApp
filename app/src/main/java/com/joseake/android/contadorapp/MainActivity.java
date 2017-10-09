package com.joseake.android.contadorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mEtiquetaConteo;
    EditText mCampoConteo;
    Button mBotonContar, mBotonReiniciar;
    int conteo = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEtiquetaConteo = (TextView) findViewById(R.id.EtiquetaConteo);
        mCampoConteo = (EditText) findViewById(R.id.campoConteo);
        mBotonContar = (Button) findViewById(R.id.botonContar);
        mBotonReiniciar = (Button) findViewById(R.id.botonReiniciar);

        mBotonContar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                conteo++;
                mCampoConteo.setText("" + conteo);
            }
        });

        mBotonReiniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCampoConteo.setText("0");
            }
        });

    }
}
