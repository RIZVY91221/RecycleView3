package com.example.rizvyahmed.recycleview;

import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView nRecyclerView;
    private RecyclerView oRecyclerView;

    private RecyclerView.LayoutManager mLayoutmanger;
    private RecyclerView.LayoutManager nLayoutmaneger;
    private RecyclerView .LayoutManager oLayoutmanager;

    private RecyclerView.Adapter mAdapter;
    private RecyclerView.Adapter nAdapter;
    private RecyclerView.Adapter oAdapter;

    private ArrayList<String>mDataset;
    private ArrayList<String>nDataset;
    private ArrayList<String>oDataset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDataset=new ArrayList<>();
        for (int i = 0; i <30; i++) {
            mDataset.add("Item"+i);
        }
        nDataset=new ArrayList<>();
        for (int i = 0; i <30 ; i++) {
            nDataset.add("Item"+i);
        }
        oDataset=new ArrayList<>();
        for (int i = 0; i <30 ; i++) {
            oDataset.add("Item"+i);
        }

        mRecyclerView=(RecyclerView)findViewById(R.id.recycler_book);
        mRecyclerView.setHasFixedSize(true);
        mLayoutmanger=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        mRecyclerView.setLayoutManager(mLayoutmanger);
        mAdapter=new MainAdapter(mDataset);
        mRecyclerView.setAdapter(mAdapter);

        nRecyclerView=(RecyclerView)findViewById(R.id.recycler_author);
        nRecyclerView.setHasFixedSize(true);
        nLayoutmaneger=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        nRecyclerView.setLayoutManager(nLayoutmaneger);
        nAdapter=new MainAdapter(nDataset);
        nRecyclerView.setAdapter(nAdapter);

        oRecyclerView=(RecyclerView)findViewById(R.id.recycler_event);
        oRecyclerView.setHasFixedSize(true);
        oLayoutmanager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        oRecyclerView.setLayoutManager(oLayoutmanager);
        oAdapter=new MainAdapter(oDataset);
        oRecyclerView.setAdapter(oAdapter);
    }
}

