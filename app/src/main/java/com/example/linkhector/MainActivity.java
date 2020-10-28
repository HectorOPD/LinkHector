package com.example.linkhector;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;


import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements RecyclerAdapter.RecyclerItemClick{

   // private TextView textviewResult;
    //private Toolbar mtoolbar;
   private RecyclerView rvList;
    private RecyclerAdapter adapter;
    private List<ItemList> items;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        initValues();
    }

    private void initViews(){
        rvList = findViewById(R.id.rvLista);
    }

    private void initValues(){
        LinearLayoutManager manager = new LinearLayoutManager(this);
        rvList.setLayoutManager(manager);

        items = getItems();
        adapter = new RecyclerAdapter(items, this);
        rvList.setAdapter(adapter);
    }

    private List<ItemList> getItems(){
        List<ItemList> itemLists = new ArrayList<>();

        itemLists.add(new ItemList("Honey Land", "001", R.drawable.link));
        itemLists.add(new ItemList("Parque Los Chorros", "002", R.drawable.link));
        itemLists.add(new ItemList("El Flautista De Hamelin", "003", R.drawable.link));
        itemLists.add(new ItemList("LosTresCerditos", "004", R.drawable.link));
        itemLists.add(new ItemList("El Hijo De Madera", "005", R.drawable.link));
        itemLists.add(new ItemList("La Casa De Chucheria", "006", R.drawable.link));

        return  itemLists;
    }

    @Override
    public void itemClick(ItemList item) {
        String var = item.getTitulo();
        String var2 = var.replace(" ", "");

        if(var2.equals("HoneyLand")) {
            Intent intent = new Intent(this, Prueba.class);
            startActivity(intent);
        } else if (var2.equals("ParqueLosChorros")){
            //Toast.makeText(this,var2,Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, Prueba.class);
            startActivity(intent);
        }else if (var2.equals("ElFlautistaDeHamelin")){
            Intent intent = new Intent(this, Prueba.class);
            startActivity(intent);
        }else if (var2.equals("LosTresCerditos")){
            Intent intent = new Intent(this, Prueba.class);
            startActivity(intent);
        }else if (var2.equals("ElHijoDeMadera")){
            Intent intent = new Intent(this, Prueba.class);
            startActivity(intent);
        }
        else if (var2.equals("LaCasaDeChucheria")){
            Intent intent = new Intent(this, Prueba.class);
            startActivity(intent);
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.option_1:
                Toast.makeText(this, "option_1", Toast.LENGTH_SHORT).show();
                break;

            case R.id.option_2:
                Toast.makeText(this, "option_2", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
        return true;
    }



        //getSupportActionBar().setTitle("Casa");
        //mtoolbar.setSubtitle("Sub Titulo");



       /*textviewResult = findViewById(R.id.text_view_result);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        JsonPlaceHolderApi jsonPlaceHolderApi = retrofit.create(JsonPlaceHolderApi.class);

        Call<List<Post>> call = jsonPlaceHolderApi.getPosts();

        call.enqueue(new Callback<List<Post>>() {
            @Override
            public void onResponse(Call<List<Post>> call, Response<List<Post>> response) {
                if (!response.isSuccessful()){
                    textviewResult.setText("Code" + response.code());
                    return;
                }

                List<Post> posts = response.body();

                for (Post post : posts){
                    String content = "";
                    content += "ID: " + post.getId() + "\n";
                    content += "User ID: " + post.getUserId() + "\n";
                    content += "Title: " + post.getTitle() + "\n";
                    content += "Texto: " + post.getText() + "\n\n";

                    textviewResult.append(content);

                }

            }

            @Override
            public void onFailure(Call<List<Post>> call, Throwable t) {
                textviewResult.setText(t.getMessage());

            }
        });*/


}