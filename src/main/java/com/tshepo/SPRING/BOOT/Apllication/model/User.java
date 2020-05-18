package com.tshepo.SPRING.BOOT.Apllication.model;

//Creating a table User with column rows
@Entity
public class User {
//    creating a primary on our User table
    @Id
    public int userId;
    public String userName;
    public String userSurname;

// Constructing class User
    public User(int userId, String userName, String userSurname) {
        this.userId = userId;
        this.userName = userName;
        this.userSurname = userSurname;
    }

    public int getUserId() {
        return  userId;
    }

    public int setUserId(int userId) {

        this.userId = userId;
        return userId;
    }

    public String getUserName() {

        return this.userName;
    }

    public void setUserName(String userName) {

        this.userName = userName;
    }

    public  String getUserSurname() {
        return userSurname;
    }

    public void setUserSurname(String userSurname) {

        this.userSurname = userSurname;
    }


}
