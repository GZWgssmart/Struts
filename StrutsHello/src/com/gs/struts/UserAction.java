package com.gs.struts;

/**
 * Created by WangGenshen on 2/26/16.
 * Struts Action是线程安全的,每一个请求都会创建一个新的action实例
 */
public class UserAction {

    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String login() {
        return "info";
    }
}
