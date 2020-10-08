package com.example.repaso_viajes_juan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RadioButton jrbcartagena, jrbsantamarta, jrbsanandres;
    TextView jtvciudad, jtvautomovil, jtvtotal;
    CheckBox jcbautomovil;
    Button jbttotal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jrbcartagena=findViewById(R.id.rbcartagena);
        jrbsantamarta=findViewById(R.id.rbsantamarta);
        jrbsanandres=findViewById(R.id.rbsanandres);
        jtvciudad=findViewById(R.id.tvciudad);
        jtvautomovil=findViewById(R.id.tvautomovil);
        jtvtotal=findViewById(R.id.tvtotal);
        jbttotal=findViewById(R.id.bttotal);
        jcbautomovil=findViewById(R.id.cbautomovil);
    }
}