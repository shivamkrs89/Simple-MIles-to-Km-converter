package com.example.justdo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

import static com.example.justdo.R.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);
        Button m2k= (Button)findViewById(id.m2k);
        m2k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText textq1 = (EditText)findViewById(id.editTextqn);
                EditText texta1 = (EditText)findViewById(id.editTextans);
                Double vmiles=Double.valueOf(textq1.getText().toString());
                Double rkm= (Double) vmiles/0.62137;
                DecimalFormat formatval= new DecimalFormat("##.###");
                texta1.setText(formatval.format(rkm));
            }
        });
        Button k2m= (Button)findViewById(id.k2m);
        k2m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText textqn = (EditText)findViewById(id.editTextqn);

                 EditText textan = (EditText)findViewById(id.editTextans);
                Double vkm=Double.valueOf(textqn.getText().toString());
                Double rm= vkm*0.62137;
                DecimalFormat formatval= new DecimalFormat("##.###");
                textan.setText(formatval.format(rm));
            }
        }
        ) ;
    }
}
