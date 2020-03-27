package com.example.velmurugan.bottomnativation.sensor;


import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.velmurugan.bottomnativation.R;
import com.example.velmurugan.bottomnativation.api.ApiService;

import java.util.ArrayList;

public class SensorFragment extends Fragment {

    private ApiService apiService;
    private RecyclerView listDataRecyclerview;
    private SensorAdapter recyclerviewAdapter;
    private ArrayList<SensorDataModel> listDataModels;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = LayoutInflater.from(container.getContext()).inflate(R.layout.list_layout,container,false);
        listDataModels = new ArrayList<SensorDataModel>();
        listDataRecyclerview = (RecyclerView)view.findViewById(R.id.recycler_view);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        listDataRecyclerview.setLayoutManager(layoutManager);


        recyclerviewAdapter = new SensorAdapter(getContext(), listDataModels);
        listDataRecyclerview.setAdapter(recyclerviewAdapter);

        // Create the ArrayList of Sports objects with the titles and
        // information about each sport.

        String[] listData= getResources()
                .getStringArray(R.array.sports_titles);

        for (int i = 0; i < listData.length; i++) {
            listDataModels.add(new SensorDataModel(listData[i]));

        }



        return view;
    }


}
