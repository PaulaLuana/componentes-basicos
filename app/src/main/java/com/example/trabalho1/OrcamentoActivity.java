package com.example.trabalho1;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class OrcamentoActivity extends AppCompatActivity {
    ArrayList<String> typesPhotos;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orcamento);


        typesPhotos = new ArrayList<>();
        typesPhotos.add("Externo");
        typesPhotos.add("Casamento em local interno");
        typesPhotos.add("Casamento em local externo");
        typesPhotos.add("Infantil");
        typesPhotos.add("Sensual");
        typesPhotos.add("Formatura");

        setUpListeners();
    }

    private void setUpListeners() {
        Spinner spinner = findViewById(R.id.spinner);

        ArrayAdapter<String> adapter = new ArrayAdapter(this,
                android.R.layout.simple_spinner_item,
                typesPhotos);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }
}
