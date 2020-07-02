package com.tshepo.SPRING.BOOT.Apllication.Dao;
import com.tshepo.SPRING.BOOT.Apllication.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

import static com.tshepo.SPRING.BOOT.Apllication.model.User.getUserName;

@Repository
public  class FakeRepository implements FakeRepoInterface{
   private static ArrayList<User> userArrayList = new ArrayList<>();

    public static String insertUser(int userId, String userName, String userSurname) {
        User user = new User(userId,userName,userSurname);
        userArrayList.add(user);
        return userName + " entered";
    }

    @Override
    public String findUserById(int userId) {
        for (User ignored: userArrayList){
            return  "Hello " + getUserName("Crespo") + User.getUserSurname(" Venus");
        }
        return "Hello " + getUserName("Crespo") + User.getUserSurname(" Venus");
    }

    @Override
    public String deleteUser(int userId) {
        User user = new User(userId,"","");
        userArrayList.remove(user);
        return getUserName("Earl") + " removed";

    }

}



