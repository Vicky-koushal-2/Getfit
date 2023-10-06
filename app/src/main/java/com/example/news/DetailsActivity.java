package com.example.news;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.news.Models.NewsHeaslines;
import com.squareup.picasso.Picasso;

public class DetailsActivity extends AppCompatActivity {

    NewsHeaslines heaslines;
    TextView txt_title,txt_author,txt_time,txt_detail,txt_contain;
    ImageView img_news;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        txt_title = findViewById(R.id.text_detail_title);
        txt_author = findViewById(R.id.text_detail_author);
        txt_time = findViewById(R.id.text_detail_time);
        txt_detail = findViewById(R.id.text_detail_detail);
        txt_contain = findViewById(R.id.text_detal_content);
        img_news = findViewById(R.id.image_detail_news);


        heaslines = (NewsHeaslines) getIntent().getSerializableExtra("data");
        txt_title.setText(heaslines.getTitle());
        txt_author.setText(heaslines.getAuthor());
        txt_time.setText(heaslines.getPublishedAt());
        txt_detail.setText(heaslines.getDescription());
        txt_contain.setText(heaslines.getContent());
        Picasso.get().load(heaslines.getUrlToImage()).into(img_news);


    }
}