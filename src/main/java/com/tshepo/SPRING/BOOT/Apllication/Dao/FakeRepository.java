package com.tshepo.SPRING.BOOT.Apllication.Dao;
import com.tshepo.SPRING.BOOT.Apllication.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public  class FakeRepository implements FakeRepoInterface{
    public static ArrayList<User> userArrayList = new ArrayList<>();
    //creating an object with list of user
    public static String insertUser(int userId, String userName, String userSurname) {
        User user = new User(userId,userName,userSurname);
        userArrayList.add(user);
        return userName + " entered";
    }
    //search for user from the list
    @Override
    public  String findUserById(int userId){
        for (User ignored: userArrayList){
            return  "Hello " + User.getUserName("lesley") + User.getUserSurname(" venus");
        }
        return "Hello " + User.getUserName("lesley") + User.getUserSurname(" venus");
    }
    //remove user from list
    @Override
    public String deleteUser(int userId) {
        User user = new User(userId,"","");
        userArrayList.remove(user);
        return User.getUserName("lesley") + " removed";
    }

}



