package com.example.elton.prova1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    private TextView displayEdTxt;
    int contador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayEdTxt = (TextView) findViewById(R.id.displayEdTxt);
    }

    public void incrementar(View view) {
        contador = contador + 1;
        displayEdTxt.setText(String.valueOf(contador));
    }

    public void decrementar(View view) {
        contador = contador - 1;
        displayEdTxt.setText(String.valueOf(contador));
    }

    public void zerarContador(View view) {
        contador = 0;
        displayEdTxt.setText(String.valueOf(contador));
    }
}
