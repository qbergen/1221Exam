package com.example.queenabergen.a1221exam;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    public int textColor;
    private View changeBackgroundColor;
    private TextView mTextView;
    private String TAG = " ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView = (TextView) findViewById(R.id.textView);
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(R.id.maincontainer, new JJfragment(), "JJ Fragment");
        transaction.commit();


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://jsjrobotics.nyc/cgi-bin/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        JJServerCall service = retrofit.create(JJServerCall.class);
        Call<Example> call = service.getJJsInfo();

        call.enqueue(new Callback<Example>() {
            @Override
            public void onResponse(Call<Example> call, Response<Example> response) {
                try {
                    if (response.isSuccessful()) {
                        Log.d(TAG, "Success: " + response.body());


                    } else {
                        Log.d(TAG, "ERROR: Something Happened" + response.errorBody().string());
                    }
                } catch (IOException e) {
                    Log.e(TAG, e.getMessage());
                }
            }

            @Override
            public void onFailure(Call<Example> call, Throwable t) {
                Log.d("Error", t.getMessage());
            }
        });
    }


}
