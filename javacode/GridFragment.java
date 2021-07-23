package com.example.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class GridFragment extends Fragment {

    // Add RecyclerView member
    private RecyclerView recyclerView;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {



//        // Add the following lines to create RecyclerView
//        recyclerView = view.findViewById(R.id.recyclerview);
//        recyclerView.setHasFixedSize(true);
//        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
//        recyclerView.setAdapter(new RandomNumListAdapter(1234));
        View view = inflater.inflate(R.layout.fragment_grid, container, false);
        recyclerView = view.findViewById(R.id.gridView);


//        Item finalarray[]= new Item[10];
//        for(int i=0;i<10;i++){
//            finalarray[i]=new Item("Item1","$ 100","Same day shipping");
//        }

        Item finalarray[]= new Item[9];

        finalarray[0]=new Item("Item1","$ 100","Same day shipping");
        finalarray[1]=new Item("Item2","$ 400","Same day shipping");
        finalarray[2]=new Item("Item3","$ 100","Same day shipping");
        finalarray[3]=new Item("Item4","$ 80","");
        finalarray[4]=new Item("Item5","$ 80","");
        finalarray[5]=new Item("Item6","$ 190","");
        finalarray[6]=new Item("Item7","$ 70","");
        finalarray[7]=new Item("Item8","$ 190","");
        finalarray[8]=new Item("Item9","$ 190","");




        GridLayoutManager gridLayoutManager = new GridLayoutManager(view.getContext(),3,GridLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(gridLayoutManager);
        GridViewAdapter myAdapter = new GridViewAdapter(finalarray,view.getContext());
        recyclerView.setAdapter(myAdapter);







        return view;
    }


}