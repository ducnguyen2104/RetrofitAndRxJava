package com.example.ducnguyenvan.retrofitandrxjava.api;

import com.example.ducnguyenvan.retrofitandrxjava.model.response.Post;

import java.util.List;

import retrofit2.http.GET;

/**
 * Created by Duc Nguyen Van on 05/04/2018.
 */

public interface JsonPlaceHolderApi {
    @GET("posts")
    rx.Observable<List<Post>> getPosts();
}
