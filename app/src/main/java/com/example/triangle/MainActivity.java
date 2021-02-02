package com.example.triangle;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements OnClickListener{
    TextView alas;
    TextView tinggi;
    TextView luas;
    TextView keliling;
    TextView panjanga;
    TextView panjangb;
    TextView panjangc;

    RadioButton dtor;
    RadioButton rtod;

    Button count;


    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.desain);

        alas = (TextView)this.findViewById(R.id.alas);
        tinggi = (TextView)this.findViewById(R.id.tinggi);
        keliling = (TextView)this.findViewById(R.id.keliling);
        luas = (TextView)this.findViewById(R.id.luas);
        panjanga=(TextView)this.findViewById(R.id.panjanga);
        panjangb=(TextView)this.findViewById(R.id.panjangb);
        panjangc=(TextView)this.findViewById(R.id.panjangc);

        dtor = (RadioButton)this.findViewById(R.id.dtor);
        dtor.setChecked(true);
        rtod = (RadioButton)this.findViewById(R.id.rtod);

        count = (Button)this.findViewById(R.id.count);
        count.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (dtor.isChecked()){
            convertToLuas();}
        if (rtod.isChecked()){
            convertToKeliling();}
    }

    protected void convertToLuas() {
        double val= Double.parseDouble(alas.getText().toString());
        double val1= Double.parseDouble(tinggi.getText().toString());
        luas.setText(Double.toString(val*val1/2));
    }

    protected void convertToKeliling() {
        double val= Double.parseDouble(panjanga.getText().toString());
        double val1= Double.parseDouble(panjangb.getText().toString());
        double val2= Double.parseDouble(panjangc.getText().toString());
        keliling.setText(Double.toString(val+val1+val2));
    }
}