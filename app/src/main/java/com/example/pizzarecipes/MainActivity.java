package com.example.pizzarecipes;

import static com.example.pizzarecipes.Utils.CHEESE_DESCRIPTION;
import static com.example.pizzarecipes.Utils.PEPERONI_DESCRIPTION;
import static com.example.pizzarecipes.Utils.RECIPE;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<PizzaRecipeItem> pizzaRecipeItems = new ArrayList<>();

        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.peperoni,"Pepperoni",
                PEPERONI_DESCRIPTION,RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.cheese,"Cheese pizza",
                CHEESE_DESCRIPTION,RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.peperoni,"Pepperoni",
                PEPERONI_DESCRIPTION,RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.cheese,"Cheese pizza",
                CHEESE_DESCRIPTION,RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.peperoni,"Pepperoni",
                PEPERONI_DESCRIPTION,RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.cheese,"Cheese pizza",
                CHEESE_DESCRIPTION,RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.peperoni,"Pepperoni",
                PEPERONI_DESCRIPTION,RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.cheese,"Cheese pizza",
                CHEESE_DESCRIPTION,RECIPE));

        recyclerView = findViewById(R.id.recycleView);
        recyclerView.setHasFixedSize(true);
        adapter = new PizzaRecipeAdapter(pizzaRecipeItems,this);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);

    }
}