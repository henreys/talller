package com.example.android.taller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Principal extends AppCompatActivity {


    private TextView totalPagar;
    private Intent i;
    private Bundle b;
    private EditText cantidad;
    private Spinner comboMaterial,comboDije,comboTipo;
    private RadioButton rPesos,rdolares;
    private static int cambioDolar= 3200;

    private int aux;
    private int costo;
    private String cadenaTotal="";


    private ArrayAdapter<String> adapterMaterial;
    private ArrayAdapter<String> adapterDije;
    private ArrayAdapter<String> adapterTipo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);



        cantidad = (EditText) findViewById(R.id.txtCantidad);
        totalPagar = (TextView)findViewById(R.id.lbl_totalPagar);


        comboMaterial =  (Spinner)findViewById(R.id.cmb_Material);
        comboDije = (Spinner)findViewById(R.id.cmb_tipoDije);
        comboTipo = (Spinner)findViewById(R.id.cmb_tipo);



        rPesos = (RadioButton)findViewById(R.id.rdb_pesos);
        rdolares= (RadioButton)findViewById(R.id.rdb_dolar);



        b = new Bundle();


        String[] opcMaterial = this.getResources().getStringArray(R.array.str_material);

        adapterMaterial = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, opcMaterial);

        comboMaterial.setAdapter(adapterMaterial);


        String[] opcDije = this.getResources().getStringArray(R.array.str_dije);

        adapterDije = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, opcDije);

        comboDije.setAdapter(adapterDije);



        String[] opcTipo = this.getResources().getStringArray(R.array.str_tipo);

        adapterTipo = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, opcTipo);

        comboTipo.setAdapter(adapterTipo);


    }

    public void Comprar(View v){




        if(rPesos.isChecked()){

            if(comboMaterial.equals(getResources().getString(R.string.str_cuero))
                && comboDije.equals(getResources().getString(R.string.str_martillo))
                    && comboTipo.equals(getResources().getString(R.string.str_oro))
                    )
            {

                costo = 100;


            }


        }

        if(rdolares.isChecked()){

            totalPagar.setText("Dolares");

        }





    }



}
