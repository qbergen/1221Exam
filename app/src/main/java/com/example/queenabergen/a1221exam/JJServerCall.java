package com.example.queenabergen.a1221exam;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by queenabergen on 12/21/16.
 */

public interface JJServerCall {
    @GET("12_21_2016_exam.pl")
    Call<Example> getJJsInfo();
}
