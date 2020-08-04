package com.tshepo.SPRING.BOOT.Apllication;

public interface UserService {

    String addUser(int userId, String userName, String userSurname) throws NoSuchMethodException;
    String getUser(int userId) throws InterruptedException;
    String removeUser(int userId);

}
