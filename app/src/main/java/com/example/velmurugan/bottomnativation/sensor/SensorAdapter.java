package com.example.velmurugan.bottomnativation.sensor;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.velmurugan.bottomnativation.R;
import com.example.velmurugan.bottomnativation.listProject.ListDataModel;

import java.util.ArrayList;
import java.util.List;

public class SensorAdapter extends RecyclerView.Adapter<SensorAdapter.MyViewHolder> {

    private ArrayList<SensorDataModel> movieList;
    private Context context;

    SensorAdapter(Context context, ArrayList<SensorDataModel> movieList){
        this.context = context;
        this.movieList = movieList;
    }


    @Override
    public SensorAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_adapter_layout,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(SensorAdapter.MyViewHolder holder, int position) {
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
            }


        }
    }
}