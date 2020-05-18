
package com.tshepo.SPRING.BOOT.Apllication.Dao;

public interface FakeRepoInterface {

    static String insertUser(int userId, String userName, String userSurname) {
        return null;
    }



    String findUserById(int userId);
    String deleteUser(int userId);

}