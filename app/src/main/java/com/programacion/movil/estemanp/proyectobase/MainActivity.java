package com.programacion.movil.estemanp.proyectobase;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button cambiarLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cambiarLayout =(Button)findViewById(R.id.boton);

        cambiarLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent cabiarLayout= new Intent(MainActivity.this,Main2Activity.class);
                startActivity(cabiarLayout);
            }
        });
    }


}
