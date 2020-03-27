package com.example.velmurugan.bottomnativation.listProject;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.velmurugan.bottomnativation.R;
import com.example.velmurugan.bottomnativation.movies.MovieDataModel;
import com.example.velmurugan.bottomnativation.sensor.SensorFragment;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.MyViewHolder> {

    private List<ListDataModel> movieList;
    private Context context;

    ListAdapter(Context context, List<ListDataModel> movieList){
        this.context = context;
        this.movieList = movieList;
    }

    public void loadShops(List<ListDataModel> movieList){
        this.movieList = movieList;
        notifyDataSetChanged();
    }

    @Override
    public ListAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_adapter_layout,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ListAdapter.MyViewHolder holder, int position) {
        holder.shopName.setText(movieList.get(position).title);

    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }



    public class MyViewHolder extends RecyclerView.ViewHolder implements  View.OnClickListener{
        private TextView shopName;
     ;

        public MyViewHolder(View itemView) {
            super(itemView);
            shopName = (TextView) itemView.findViewById(R.id.shopName);

            // Set the OnClickListener to the entire view.
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {

            if( movieList.get(getAdapterPosition()).title.contains("Sensor")){
                Toast.makeText(context,"Hello Javatpoint",Toast.LENGTH_SHORT).show();
//                Intent detailIntent = new Intent(context, SensorFragment.class);
//                context.startActivity(detailIntent);

                Intent detailIntent = new Intent(context, DetailActivity.class);
                context.startActivity(detailIntent);


            }


        }
    }
}
