package com.example.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerViewData.LayoutManager layoutManager;

    List<Data> friendsList = new ArrayList<Data>();


    private void setListAdapter() {
        Data f0 = new Data(1,"Asad", 1980, "Giglgit");
        Data f1 = new Data(2,"Zubair", 1981, "Lahore");
        Data f2 = new Data(3,"Musa", 1980, "Quetta");
        Data f3 = new Data(4,"Nadeem",1987,"Peshawar");
        Data f4 = new Data(5,"Shahid", 1980, "Karachi");
        Data f5 = new Data(6,"Zia",1987,"Faisalabad ");
        Data f6 = new Data(7,"Badar", 1980, "Rawalpindi");
        Data f7 = new Data(8,"Hashim",1987,"Lahore");

        friendsList.addAll(Arrays.asList(new Data[]{f0,f1,f2,f3,f4,f5,f6,f7,}));
        recyclerView = findViewById(R.id.recyclerView);

        //recyclerView.setHasFixedSize(true);

        //LinearLayoutManager GridLayoutManager
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new RecyclerViewAdapter(friendsList,MainActivity.this) {

        };

        recyclerView.setAdapter(adapter);
    }
}