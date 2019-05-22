package com.example.lking.examenjasonlopez;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public String TipoConversion="",Conversion="";
    public Button CF,FC,CK,KC,MC,CM,CP,PC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle("Conversor de unidades");
    }
    public void C_F(View v){
        CF=(Button)findViewById(R.id.btn_C_F);
        TipoConversion=CF.getText().toString();
        Conversion="1";
        CambiarVentana();
    }
    public void F_C(View v){
        FC=(Button)findViewById(R.id.btn_F_C);
        TipoConversion=FC.getText().toString();
        Conversion="2";
        CambiarVentana();
    }
    public void C_K(View v){
        CK=(Button)findViewById(R.id.btn_C_K);
        TipoConversion=CK.getText().toString();
        Conversion="3";
        CambiarVentana();
    }
    public void K_C(View v){
        KC=(Button)findViewById(R.id.btn_K_C);
        TipoConversion=KC.getText().toString();
        Conversion="4";
        CambiarVentana();
    }
    public void M_C(View v){
        MC=(Button)findViewById(R.id.btn_M_C);
        TipoConversion=MC.getText().toString();
        Conversion="5";
        CambiarVentana();
    }
    public void C_M(View v){
        CM=(Button)findViewById(R.id.btn_C_M);
        TipoConversion=CM.getText().toString();
        Conversion="6";
        CambiarVentana();
    }
    public void C_P(View v){
        CP=(Button)findViewById(R.id.btn_C_INCH);
        TipoConversion=CP.getText().toString();
        Conversion="7";
        CambiarVentana();
    }
    public void P_C(View v){
        PC=(Button)findViewById(R.id.btn_INCH_C);
        TipoConversion=PC.getText().toString();
        Conversion="8";
        CambiarVentana();
    }
    public void CambiarVentana(){
        Intent Ventana=new Intent(getApplicationContext(),Main2Activity.class);
        Ventana.putExtra("Tipo_Conversion",TipoConversion);
        Ventana.putExtra("Conver",Conversion);
        startActivity(Ventana);
    }
}
