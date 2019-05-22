package com.example.lking.examenjasonlopez;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public String TP="";
    public String C="" ;


    public Button CelciusFarengel;
    public Button FarengelCelcius;
    public Button CelciusKelvin;
    public Button KelvinCelcius;
    public Button MetrosCentimetros;
    public Button CentimetrosMetros;
    public Button CentimetrosPulgadas;
    public Button PulgadasCentimetros;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        CelciusFarengel = (Button) findViewById(R.id.CelciusFarengel);

        CelciusFarengel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TP=CelciusFarengel.getText().toString();
                C="CelciusFarengel";
                Change();
            }
        });
        FarengelCelcius = (Button) findViewById(R.id.FarengelCelcius);

        FarengelCelcius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TP=FarengelCelcius.getText().toString();
                C="FarengelCelcius";
                Change();
            }
        });
        CelciusKelvin = (Button) findViewById(R.id.CelciusKelvin);

        CelciusKelvin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TP=CelciusKelvin.getText().toString();
                C="CelciusKelvin";
                Change();
            }
        });
        KelvinCelcius = (Button) findViewById(R.id.KelvinCelcius);

        KelvinCelcius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TP=KelvinCelcius.getText().toString();
                C="KelvinCelcius";
                Change();
            }
        });
        MetrosCentimetros = (Button) findViewById(R.id.MetrosCentimetros);

        MetrosCentimetros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TP=MetrosCentimetros.getText().toString();
                C="MetrosCentimetros";
                Change();
            }
        });
        CentimetrosMetros = (Button) findViewById(R.id.CentimetrosMetros);

        CentimetrosMetros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TP=CentimetrosMetros.getText().toString();
                C="CentimetrosMetros";
                Change();
            }
        });
        CentimetrosPulgadas = (Button) findViewById(R.id.CentimetrosPulgadas);

        CentimetrosPulgadas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TP=CentimetrosPulgadas.getText().toString();
                C="CentimetrosPulgadas";
                Change();
            }
        });
        PulgadasCentimetros = (Button) findViewById(R.id.PulgadasCentimetros);

        PulgadasCentimetros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TP=PulgadasCentimetros.getText().toString();
                C="PulgadasCentimetros";
                Change();
            }
        });


    }

    public void Change(){
        Intent Frm1=new Intent(getApplicationContext(),Main2Activity.class);
        Frm1.putExtra("TP",TP);
        Frm1.putExtra("C",C);
        startActivity(Frm1);
    }
}
