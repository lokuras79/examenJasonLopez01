package com.example.lking.examenjasonlopez;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class Main2Activity extends AppCompatActivity {

    private EditText et1;
    public String TP="";
    public String C;
    EditText Num;
    TextView Res;
    public double Numero;
    public double Total;
    public Button Calcular;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TP = getIntent().getStringExtra("TP");
        C = getIntent().getStringExtra("C");
        this.setTitle(TP);
        et1 = (EditText) findViewById(R.id.Numero);
        SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);
        et1.setText(preferences.getString("numero", ""));
        Calcular = (Button) findViewById(R.id.Calcular);

        Calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Calcular(v);

            }
        });

    }
    public void Guardar(View view){
    SharedPreferences preferences =getSharedPreferences("datos", Context.MODE_PRIVATE);
    SharedPreferences.Editor Obj_editor = preferences.edit();
        Obj_editor.putString("numero", et1.getText().toString());
        Obj_editor.commit();
        finish();
    }
    public void Calcular(View v){
        try{
            Res=(TextView)findViewById(R.id.Resultado);
            Num=(EditText)findViewById(R.id.Numero);
            Numero=Integer.parseInt(Num.getText().toString());
            switch (C){
                case "CelciusFarengel":
                    Total=(Numero*9/5)+32;
                    Res.setText(Total+"F");
                    break;
                case "FarengelCelcius":
                    Total=(Numero-32)*5/9;
                    Res.setText(Total+"C");
                    break;
                case "CelciusKelvin":
                    Total=Numero+273.15;
                    Res.setText(Total+"K");
                    break;
                case "KelvinCelcius":
                    Total=Numero-273.15;
                    Res.setText(Total+"C");
                    break;
                case "MetrosCentimetros":
                    Total=Numero*100;
                    Res.setText(Total+"cm");
                    break;
                case "CentimetrosMetros":
                    Total=Numero/100;
                    Res.setText(Total+"m");
                    break;
                case "CentimetrosPulgadas":
                    Total=Numero/2.54;
                    Res.setText(Total+"in");
                    break;
                case "PulgadasCentimetros":
                    Total=Numero*2.54;
                    Res.setText(Total+"cm");
                    break;
            }
        }
        catch (Exception e){
            Toast.makeText(getApplicationContext(),"uPS Algo sucedio porfavor intente nuevamente",Toast.LENGTH_SHORT).show();
        }

    }
}
