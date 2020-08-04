package com.tshepo.SPRING.BOOT.Apllication;

import com.tshepo.SPRING.BOOT.Apllication.FakeRepoInterface;
import com.tshepo.SPRING.BOOT.Apllication.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImplementation implements UserService {

    @Autowired
    FakeRepoInterface fakeRepository;


    @Override
    public String addUser(int userId, String userName, String userSurname){
        return fakeRepository.insertUser(2,"black","boy")  + " entered";
    }

    // find user by calling getUser from Fake Repository class
    @Override
    @Cacheable("string")
    public String getUser(int userId) {
        try{
            System.out.println("Going to sleep for 5 Secs.. to simulate backend call.");
            //Introducing an intentional delay of 5 seconds
            // to Simulate the actual backend
            // service call to get the results
            Thread.sleep(1000*5);
        }
        catch ( InterruptedException e){
            e.printStackTrace();
        }
        return  "Hello " +  fakeRepository.findUserById(userId);
    }
    // remove user by calling deleteUser from Fake Repository class
    @Override
    public String removeUser(int userId) {
        return  fakeRepository.deleteUser(userId)  + " removed";
    }
}
