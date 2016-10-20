package edu.tecii.android.practica5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txtc, txtf, txtk, txtr;
    Button btncon;
    double c, f, k, r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtc = (EditText)findViewById(R.id.txtc);
        txtf = (EditText)findViewById(R.id.txtf);
        txtk = (EditText)findViewById(R.id.txtk);
        txtr = (EditText)findViewById(R.id.txtr);
        btncon = (Button) findViewById(R.id.btnconv);
    }
    public void convertir(View v){
        c = Double.parseDouble(txtc.getText().toString());
        f = (c * 1.8) + 32;
        k = c + 273.15;
        r = (c * 1.8) + 491.67;
        txtf.setText(f + "");
        txtk.setText(k + "");
        txtr.setText(r + "");
    }
}