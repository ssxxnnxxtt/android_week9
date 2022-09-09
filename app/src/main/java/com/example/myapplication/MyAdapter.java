package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.Holder>{
    String[] a = {"ant", "bat", "cat", "dog", "emu", "fox", "gnu"};
    int[] photo = {R.drawable.ant, R.drawable.bat, R.drawable.cat, R.drawable.dog, R.drawable.emu, R.drawable.fox, R.drawable.gnu};

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        holder.textView.setText(a[position]);
        holder.imageView.setImageResource(photo[position]);
    }

    @Override
    public int getItemCount() {
        return a.length;
    }

    class Holder extends RecyclerView.ViewHolder {
        TextView textView;
        ImageView imageView;
        public Holder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textView);
            imageView = itemView.findViewById(R.id.imageView);
        }
    }
}
