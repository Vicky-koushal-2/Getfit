package com.example.news;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class CoustomViewHolder extends RecyclerView.ViewHolder {

    TextView text_title, text_source;
    ImageView img_headline;
    CardView cardView;
    public CoustomViewHolder(@NonNull View itemView) {
        super(itemView);
        text_title = itemView.findViewById(R.id.text_titile);
        text_source =itemView.findViewById(R.id.text_source);
        img_headline = itemView.findViewById(R.id.img_headline);
        cardView = itemView.findViewById(R.id.main_container);

    }
}
