package com.example.velmurugan.bottomnativation.news;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.velmurugan.bottomnativation.R;

import java.util.List;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.MyViewHolder> {

    private List<NewsDataModel> movieList;
    private Context context;

    NewsAdapter(Context context, List<NewsDataModel> movieList){
        this.context = context;
        this.movieList = movieList;
    }

    public void loadShops(List<NewsDataModel> movieList){
        this.movieList = movieList;
        notifyDataSetChanged();
    }

    @Override
    public NewsAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.latest_adapter_layout,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(NewsAdapter.MyViewHolder holder, int position) {
        holder.shopName.setText(movieList.get(position).title);
        Glide.with(context).load(movieList.get(position).image).into(holder.shopImage);
    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView shopName;
        private ImageView shopImage;

        public MyViewHolder(View itemView) {
            super(itemView);
            shopName = (TextView) itemView.findViewById(R.id.shopName);
            shopImage = (ImageView)itemView.findViewById(R.id.shopImage);

        }
    }
}
