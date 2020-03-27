package com.example.velmurugan.bottomnativation.listProject;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.velmurugan.bottomnativation.R;



import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.velmurugan.bottomnativation.R;
import com.example.velmurugan.bottomnativation.api.RetrofitClient;
import com.example.velmurugan.bottomnativation.api.ApiService;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ListFragment extends Fragment {

    private ApiService apiService;
    private RecyclerView listDataRecyclerview;
    private ListAdapter recyclerviewAdapter;
    private ArrayList<ListDataModel> listDataModels;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = LayoutInflater.from(container.getContext()).inflate(R.layout.list_layout,container,false);
        listDataModels = new ArrayList<>();
        listDataRecyclerview = (RecyclerView)view.findViewById(R.id.recycler_view);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        listDataRecyclerview.setLayoutManager(layoutManager);


        recyclerviewAdapter = new ListAdapter(getContext(), listDataModels);
        listDataRecyclerview.setAdapter(recyclerviewAdapter);

        // Create the ArrayList of Sports objects with the titles and
        // information about each sport.

        String[] listData= getResources()
                .getStringArray(R.array.sports_titles);

        for (int i = 0; i < listData.length; i++) {
            listDataModels.add(new ListDataModel(listData[i]));

        }



        return view;
    }


}
