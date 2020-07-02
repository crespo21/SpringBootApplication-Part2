package com.tshepo.SPRING.BOOT.Apllication.model;
public class User {

    public int userId;
    public String userName;
    public String userSurname;

    public User(int userId, String userName, String userSurname){
        this.userId = userId;
        this.userName = userName;
        this.userSurname = userSurname;
    }
    public static String getUserName(String userName){
        return userName;
    }
    public static String getUserSurname(String userSurname){
        return userSurname;
    }
}
