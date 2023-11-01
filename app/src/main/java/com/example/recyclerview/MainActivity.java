package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerview.adapters.PikachuAdapter;
import com.example.recyclerview.models.Chapete;
import com.example.recyclerview.models.Pikachu;
import com.example.recyclerview.models.Pokemon;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rcpokemon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Pikachu> pikachus = new ArrayList<>();

         pikachus.add(new Pikachu(new Chapete("amarillo"), new Chapete("rojo")));
         pikachus.add(new Pikachu(new Chapete("azul"), new Chapete("morado")));

        rcpokemon = findViewById(R.id.rcvpokemon);
        rcpokemon.setAdapter(new PikachuAdapter(pikachus));
        rcpokemon.setLayoutManager(new LinearLayoutManager(this));
        rcpokemon.hasFixedSize();
    }
}