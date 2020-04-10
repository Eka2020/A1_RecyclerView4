package com.example.a4_recyclerview;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainViewHolder> {
    ArrayList<String> data;

    public  MainAdapter(){
        data=new ArrayList<>();
        for (int i=0; i<100; i++){
            data.add("Elament");
        }
    }

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        int viewHoldersCounter = 0;
        Log.d("ololo", "OnCreateViewHolder- " + ++viewHoldersCounter);
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.view_holder_main, parent,false);
        MainViewHolder viewHolder=new MainViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
Log.d("ololo", "onBindViewHolder" +" - "+ position);
        holder.textView.setText("position + " + data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
