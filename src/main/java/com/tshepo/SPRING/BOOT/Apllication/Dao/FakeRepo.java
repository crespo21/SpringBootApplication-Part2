package com.tshepo.SPRING.BOOT.Apllication.Dao;
import com.tshepo.SPRING.BOOT.Apllication.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public  class FakeRepo implements FakeRepoInterface{
   private static ArrayList<User> usr = new ArrayList<>();

    public static String insertUser(int userId, String userName, String userSurname) {
        User user = new User(userId,userName,userSurname);
        usr.add(user);
        return userName + " entered";
    }

    @Override
    public String findUserById(int userId) {
        for (User user: usr ) {
            if (user.getUserId() == userId){
                return "Hello " + user.getUserName();
            }
        }
        return null;
    }

    @Override
    public String deleteUser(int userId) {
        for (User user: usr){
            if (user.getUserId() == userId){
                usr.remove(user);
                return user.getUserName() + " removed";
            }
    }
        return null;

    }

}



