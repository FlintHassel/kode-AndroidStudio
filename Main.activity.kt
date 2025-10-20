package com.example.widget;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SpinnerActivity extends AppCompatActivity {

    Spinner spinner;
    TextView textViewResult;
    String[] items = {"Tulip", "Lisianthus", "Rose", "Verocina", "Anemone", "Peony", "Lavender", "Azalea"};
    boolean isSpinnerInitialized = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spinner);

        spinner = findViewById(R.id.spinner);
        textViewResult = findViewById(R.id.textViewResult);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, items);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (isSpinnerInitialized) {
                    String selectedItem = parent.getItemAtPosition(position).toString();
                    textViewResult.setText("Kamu memilih: " + selectedItem);
                } else {
                    isSpinnerInitialized = true;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                textViewResult.setText("Belum ada pilihan");
            }
        });
    }
}
