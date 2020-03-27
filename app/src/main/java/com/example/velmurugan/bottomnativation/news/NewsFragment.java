package com.example.velmurugan.bottomnativation.news;

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
import com.example.velmurugan.bottomnativation.api.ApiService;
import com.example.velmurugan.bottomnativation.api.RetrofitClient;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class NewsFragment extends Fragment {

    private ApiService apiService;
    private RecyclerView shopsRecyclerview;
    private NewsAdapter recyclerviewAdapter;
    private List<NewsDataModel> movieList;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = LayoutInflater.from(container.getContext()).inflate(R.layout.latest_layout,container,false);
        movieList = new ArrayList<>();
        shopsRecyclerview = (RecyclerView)view.findViewById(R.id.recycler_view);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        shopsRecyclerview.setLayoutManager(layoutManager);
        apiService = RetrofitClient.getInstance().create(ApiService.class);
        recyclerviewAdapter = new NewsAdapter(getContext(), movieList);
        shopsRecyclerview.setAdapter(recyclerviewAdapter);
        loadshopData();
        return view;
    }

    private void loadshopData() {

        Call<List<NewsDataModel>> listCall = apiService.getshops1();

        listCall.enqueue(new Callback<List<NewsDataModel>>() {
            @Override
            public void onResponse(Call<List<NewsDataModel>> call, Response<List<NewsDataModel>> response) {
                movieList = response.body();
                recyclerviewAdapter.loadShops(movieList);
                Log.d("Response",response.body().toString());
            }

            @Override
            public void onFailure(Call<List<NewsDataModel>> call, Throwable t) {
                Log.d("Response",t.toString());

            }
        });
    }
}
