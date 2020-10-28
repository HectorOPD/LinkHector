package com.example.linkhector;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class Prueba extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prueba);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.option_1) {
            Toast.makeText(this, "Opcion 1", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.option_2) {
            Toast.makeText(this, getString(R.string.opcion_2), Toast.LENGTH_SHORT).show();
        }

        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
        }

        return true;
    }
}