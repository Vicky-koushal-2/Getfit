package com.example.news;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.news.Models.NewsHeaslines;
import com.squareup.picasso.Picasso;

import java.util.List;

public class CustomAdapter  extends RecyclerView.Adapter<CoustomViewHolder> {
    private Context context;
    private List<NewsHeaslines> heaslines;
    private SelectListener listener;

    public CustomAdapter(Context context, List<NewsHeaslines> heaslines, SelectListener listener) {
        this.context = context;
        this.heaslines = heaslines;
        this.listener = listener;
    }

    @NonNull
    @Override
    public CoustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CoustomViewHolder(LayoutInflater.from(context).inflate(R.layout.hadline_list_items,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull CoustomViewHolder holder, int position) {
        holder.text_title.setText(heaslines.get(position).getTitle());
        holder.text_source.setText(heaslines.get(position).getSource().getName());
       if(heaslines.get(position).getUrlToImage()!=null){
           Picasso.get().load(heaslines.get(position).getUrlToImage()).into(holder.img_headline);

       }
       holder.cardView.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               listener.OnNewsClicked(heaslines.get(position));
           }
       });

    }

    @Override
    public int getItemCount() {

        return heaslines.size();
    }
}
