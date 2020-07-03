package com.tshepo.SPRING.BOOT.Apllication.service;

import com.tshepo.SPRING.BOOT.Apllication.Dao.FakeRepository;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImplementation implements UserService {

    final
    FakeRepository fakeRepository;
    // add user by calling insertUser from Fake Repository class
    public UserServiceImplementation(FakeRepository fakeRepository) {
        this.fakeRepository = fakeRepository;
    }

    @Override
    public String addUser(int userId, String userName, String userSurname){
        return FakeRepository.insertUser(2,"black","boy");
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
        return fakeRepository.findUserById(userId);
    }
    // remove user by calling deleteUser from Fake Repository class
    @Override
    public String removeUser(int userId) {
        return  fakeRepository.deleteUser(userId);
    }
}
