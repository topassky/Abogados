package com.comcop.abogados;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<TrabajosVo> listaTrabajos;
    RecyclerView recyclerViewTrabajos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConstruirRecycler();


    }

    private void llenarPorfesiones() {
        listaTrabajos.add(new TrabajosVo("Hola mundo","Herschel Shmoikel Pinkus Yerocham Krustofsky, conocido como Krusty el payaso, es un personaje de la serie de dibujos animados Los Simpson.",R.drawable.krusti));
    }

    private void llenarServicios() {
        listaTrabajos.add(new TrabajosVo("Krusty","Herschel Shmoikel Pinkus Yerocham Krustofsky, conocido como Krusty el payaso, es un personaje de la serie de dibujos animados Los Simpson.",R.drawable.krusti));
        listaTrabajos.add(new TrabajosVo("Homero","Homer Jay Simpson es uno de los protagonistas de la serie. Es el padre de la familia protagonista y uno de los personajes centrales y más importantes de la serie.",R.drawable.homero));
        listaTrabajos.add(new TrabajosVo("Bart","Bartholomew JoJo «Bart» Simpson, es uno de los protagonistas de la serie. Bart tiene 10 años y es el primogénito, y único hijo varón de Homer y Marge Simpson. ",R.drawable.bart));
        listaTrabajos.add(new TrabajosVo("Lisa","Lisa Marie Simpson es una de las protagonistas de la serie. Es la hija mediana de Homer y Marge Simpson, y hermana de Bart y Maggie. Goza de notable protagonismo y complejidad en la serie.",R.drawable.lisa));
        listaTrabajos.add(new TrabajosVo("Magie","Margaret Evelyn \"Maggie\" Simpson es una de las protagonistas de la serie. Es la tercera hija del matrimonio protagonista, Homer y Marge Simpson, y la más joven de ellos.",R.drawable.magie));
        listaTrabajos.add(new TrabajosVo("Flanders","Nedward «Ned» Flanders es un personaje ficticio de la serie de televisión de dibujos animados Los Simpson. La voz original en inglés es de Harry Shearer.",R.drawable.flanders));
        listaTrabajos.add(new TrabajosVo("Milhouse","Milhouse Mussolini Van Houten es un personaje ficticio de la serie animada Los Simpson, creado por Matt Groening.",R.drawable.milhouse));
        listaTrabajos.add(new TrabajosVo("Mr. Burns","Charles Montgomery Burns, más conocido como el señor Burns o Monty Burns, es un personaje ficticio recurrente de la serie de televisión de dibujos animados Los Simpson, creada por Matt Groening.",R.drawable.burns));

    }

    public void OnClick(View view) {
        switch (view.getId()){
            case R.id.btnProfesiones:
                Utilidades.visualizacion=Utilidades.PROFESIONES;
                break;
            case R.id.btnServicios:
                Utilidades.visualizacion=Utilidades.SERVICIOS;
                break;
        }

        ConstruirRecycler();
    }

    private void ConstruirRecycler() {

        listaTrabajos = new ArrayList<>();
        recyclerViewTrabajos=findViewById(R.id.recycleviewPrimario);

        if (Utilidades.visualizacion==Utilidades.SERVICIOS){
            recyclerViewTrabajos.setLayoutManager(new LinearLayoutManager(this));
            llenarServicios();
            AdaptadorTrabajos adaptadorTrabajos= new AdaptadorTrabajos(listaTrabajos);
            adaptadorTrabajos.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(),"Se slecciono :"+
                            listaTrabajos.get(recyclerViewTrabajos.getChildAdapterPosition(v)).getNombre(),
                            Toast.LENGTH_SHORT).show();
                }
            });
            recyclerViewTrabajos.setAdapter(adaptadorTrabajos);


        }else{
            recyclerViewTrabajos.setLayoutManager(new LinearLayoutManager(this));
            llenarPorfesiones();
            AdaptadorTrabajos adaptadorTrabajos= new AdaptadorTrabajos(listaTrabajos);
            adaptadorTrabajos.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(),"Se slecciono :"+
                                    listaTrabajos.get(recyclerViewTrabajos.getChildAdapterPosition(v)).getNombre(),
                            Toast.LENGTH_SHORT).show();
                }
            });
            recyclerViewTrabajos.setAdapter(adaptadorTrabajos);
        }


    }


}
