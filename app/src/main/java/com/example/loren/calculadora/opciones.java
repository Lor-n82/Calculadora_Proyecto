package com.example.loren.calculadora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

import java.util.ArrayList;

public class opciones extends AppCompatActivity {

    Switch mSwitchSuma;
    Switch mSwitchResta;
    Switch mSwitchMultiplacion;
    Switch mSwitchDivision;

    boolean estadoSuma;
    private Bundle infoOpciones;
    Intent enviarDatos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.opciones);

        mSwitchSuma = (Switch) findViewById(R.id.switchSuma);
        mSwitchResta = (Switch) findViewById(R.id.switchResta);
        mSwitchMultiplacion = (Switch) findViewById(R.id.switchMultiplicacion);
        mSwitchDivision = (Switch) findViewById(R.id.switchDivision);


        //mBotonSuma = (Button) findViewById(R.id.botonSuma); ni idea
    }

    /*public void onClickSwitchSuma(View v) {
        if (v.getId()==R.id.switchSuma){
            if(mSwitchSuma.isChecked()){
                mBotonSuma.setEnabled(false);
            }else{
                mBotonSuma.setEnabled(true);
            }

        }*/

    public void onClick(View v) {

        if (v.getId() == R.id.switchSuma) {

            if (mSwitchSuma.isChecked()) {
                estadoSuma = true;
                infoOpciones.putBoolean("estadoSwitchSumar", estadoSuma);
                enviarDatos.putExtras(infoOpciones);
                startActivity(enviarDatos);


            } else {
                estadoSuma = false;
                infoOpciones.putBoolean("estadoSwitchSumar", estadoSuma);
                enviarDatos.putExtras(infoOpciones);
                startActivity(enviarDatos);
            }

        }

    }
    @Override
    protected void onSaveInstanceState (Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putBoolean("botonSuma",estadoSuma);
    }
}
