package com.droidyu.javademo.thread.annotation.processor;

public abstract class Api {
    @GET("https://api.github.com")
    abstract void getGithub();

    @POST("https://api.github.com/droidYu")
    abstract void updateUserInfo();
}
