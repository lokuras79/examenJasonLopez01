package com.example.lking.examenjasonlopez;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    public String TipoConversion="",Conversion;
    EditText Num;
    TextView Resultado;
    public double Numero,Total;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TipoConversion = getIntent().getStringExtra("Tipo_Conversion");
        Conversion = getIntent().getStringExtra("Conver");
        this.setTitle(TipoConversion);
    }
    public void Calcular(View v){
        try{
            Resultado=(TextView)findViewById(R.id.lbl_Total);
            Num=(EditText)findViewById(R.id.txt_Numero);
            Numero=Integer.parseInt(Num.getText().toString());
            switch (Conversion){
                case "1":
                    Total=(Numero*9/5)+32;
                    Resultado.setText(Total+" F°");
                    break;
                case "2":
                    Total=(Numero-32)*5/9;
                    Resultado.setText(Total+" C°");
                    break;
                case "3":
                    Total=Numero+273.15;
                    Resultado.setText(Total+" K°");
                    break;
                case "4":
                    Total=Numero-273.15;
                    Resultado.setText(Total+" C°");
                    break;
                case "5":
                    Total=Numero*100;
                    Resultado.setText(Total+" cm");
                    break;
                case "6":
                    Total=Numero/100;
                    Resultado.setText(Total+" m");
                    break;
                case "7":
                    Total=Numero/2.54;
                    Resultado.setText(Total+" inch");
                    break;
                case "8":
                    Total=Numero*2.54;
                    Resultado.setText(Total+" cm");
                    break;
            }
        }
        catch (Exception e){
            Toast.makeText(getApplicationContext(),"No dejar el campo vacio",Toast.LENGTH_SHORT).show();
        }
    }
    public void Atras(View v){
        CambiarVentana();
    }
    public void CambiarVentana(){
        Intent Ventana=new Intent(getApplicationContext(),MainActivity.class);
        startActivity(Ventana);
    }

}
