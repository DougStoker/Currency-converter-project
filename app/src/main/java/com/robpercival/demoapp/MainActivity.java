package com.robpercival.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Spinner;
import java.util.ArrayList;



public class MainActivity extends AppCompatActivity {
    public double[][] exchangeRates = {
        {1.,0.72,0.86,70.3,20.35,113.4},
        {1.38,1.,1.18,96.98,28.08,156.53},
        {1.17,0.85,1.,82.07,23.78,132.49},
        {0.014,0.01,0.012,1.,0.29,1.61},
        {0.049,0.036,0.042,3.45,1.,5.57},
        {0.0088,0.0064,0.0075,0.62,0.18,1.},
    };

    public void buttonfunc(View view){

        EditText textfield = (EditText) findViewById(R.id.editInputNumber);
        Spinner sp1 = (Spinner) findViewById(R.id.spinner);
        Spinner sp2 = (Spinner) findViewById(R.id.spinner2);
        String text = sp1.getSelectedItem().toString();
        int s1 = sp1.getSelectedItemPosition();
        int s2 = sp2.getSelectedItemPosition();
        //Toast.makeText(MainActivity.this, textfield.getText(),Toast.LENGTH_SHORT).show();
        double input = Double.parseDouble(textfield.getText().toString());
        double output = input * exchangeRates[s1][s2];

        Toast.makeText(MainActivity.this, Double.toString(output),Toast.LENGTH_SHORT).show();
        TextView outText = (TextView) findViewById(R.id.textOutput);
        outText.setText(String.valueOf(output));
        Log.i("info",textfield.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
