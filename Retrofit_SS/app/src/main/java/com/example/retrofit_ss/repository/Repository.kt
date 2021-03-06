package com.example.retrofit_ss.repository

import com.example.retrofit_ss.api.RetrofitInstance
import com.example.retrofit_ss.model.Post
import retrofit2.Response
import retrofit2.http.OPTIONS

class Repository {

    suspend fun getPost(auth:String): Response<Post>
    {
        return RetrofitInstance.api.getPost(auth)
    }

    suspend fun getPost2(number: Int): Response<Post>
    {
        return RetrofitInstance.api.getPost2(number)
    }

    suspend fun getCustomPosts(userId: Int, sort: String, order: String): Response<List<Post>> {
        return RetrofitInstance.api.getCustomPosts(userId, sort, order)

    }

    suspend fun getCustomPosts2(userId: Int, options: Map<String, String>) : Response<List<Post>> {
        return RetrofitInstance.api.getCustomPosts2(userId, options)

    }

    suspend fun pushPost(post: Post) :Response<Post> {

        return RetrofitInstance.api.pushPost(post)
    }

    suspend fun pushPost2(userId: Int, id: Int, order: String, body: String): Response<Post> {
        return RetrofitInstance.api.pushPost2(userId,id, order, body)
    }
}