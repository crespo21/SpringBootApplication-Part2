
package com.tshepo.SPRING.BOOT.Apllication;

public interface FakeRepoInterface {

    String insertUser(int userId, String userName, String userSurname);
    String findUserById(int userId);
    String deleteUser(int userId);
}