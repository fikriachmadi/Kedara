package com.dimsen.kedara.main;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.dimsen.kedara.R;
import com.dimsen.kedara.data.Lists;
import com.dimsen.kedara.data.Weathers;
import com.dimsen.kedara.data.api.Api;
import com.dimsen.kedara.data.api.ApiClient;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    public static final String APP_ID = "8f415b7021ae02e32442cc8555f6d572";
    private RecyclerView recyclerView;
    private List<Lists> listList = new ArrayList<>();
    private WeatherAdapter weatherAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerWeather);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(weatherAdapter);
        
        LoadApi();
    }

    private void LoadApi() {
        Api api = ApiClient.getApiClient().create(Api.class);
        String q = "jakarta";
        String units = "metric";
        Call<Weathers> weathersCall;
        weathersCall = api.getWeather(q, units, APP_ID);

        weathersCall.enqueue(new Callback<Weathers>() {
            @Override
            public void onResponse(@NonNull Call<Weathers> call, @NonNull Response<Weathers> response) {
                Log.d("Data", response.body().getList().toString());
            }

            @Override
            public void onFailure(@NonNull Call<Weathers> call, Throwable t) {

            }
        });
    }
}