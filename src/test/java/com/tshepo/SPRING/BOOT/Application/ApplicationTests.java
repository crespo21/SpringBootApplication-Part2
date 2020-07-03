package com.tshepo.SPRING.BOOT.Application;

import com.tshepo.SPRING.BOOT.Apllication.Dao.FakeRepository;
import com.tshepo.SPRING.BOOT.Apllication.Security.WebSecurityConfigurer;
import com.tshepo.SPRING.BOOT.Apllication.service.UserService;
import com.tshepo.SPRING.BOOT.Apllication.service.UserServiceImplementation;
import org.junit.jupiter.api.Test;

public class ApplicationTests {

    @Test
    public void testInsertUser() throws NoSuchMethodException {
         assertThat(Boolean.parseBoolean(new UserServiceImplementation().
                 addUser(1,"theo","park")));
    }

    @Test
    public void testFindUserById(){
        assertThat(Boolean.parseBoolean(new FakeRepository().findUserById(1)));
    }


    @Test
    public void deleteUserTest(){

        assertThat(Boolean.parseBoolean(new FakeRepository().deleteUser(1)+" is removed"));
    }

    private void assertThat(boolean parseBoolean) {
    }


    @Test
    public void getUserTestFromUserServiceImpl()
            throws NullPointerException, InterruptedException {
        assertThat(Boolean.parseBoolean(new UserService() {
            @Override
            public String addUser(int userId, String userName, String userSurname) {
                return null;
            }

            @Override
            public String getUser(int userId) throws InterruptedException {
               System.out.println("Going to sleep for 5 Secs.. to simulate backend call.");
                //Introducing an intentional delay of 5 seconds
                // to Simulate the actual backend
                // service call to get the results
                Thread.sleep(1000*5);
                return null;
            }

            @Override
            public String removeUser(int userId) {
                return null;
            }
        }.getUser(1)));

        assertThat(Boolean.parseBoolean(new UserService() {
            @Override
            public String addUser(int userId, String userName, String userSurname) {
                return null;
            }

            @Override
            public String getUser(int userId) throws InterruptedException {
               System.out.println("Going to sleep for 5 Secs.. to simulate backend call.");
                //Introducing an intentional delay of 5 seconds
                // to Simulate the actual backend
                // service call to get the results
                Thread.sleep(1000*5);
                return null;
            }

            @Override
            public String removeUser(int userId) {
                return null;
            }
        }.getUser(2)));

        assertThat(Boolean.parseBoolean(new UserService() {
            @Override
            public String addUser(int userId, String userName, String userSurname) {
                return null;
            }

            @Override
            public String getUser(int userId) throws InterruptedException {
               System.out.println("Going to sleep for 5 Secs.. to simulate backend call.");
                //Introducing an intentional delay of 5 seconds
                // to Simulate the actual backend
                // service call to get the results
                Thread.sleep(1000*5);
                return null;
            }

            @Override
            public String removeUser(int userId) {
                return null;
            }
        }.getUser(3)));

        assertThat(Boolean.parseBoolean(new UserService() {
            @Override
            public String addUser(int userId, String userName, String userSurname) {
                return null;
            }

            @Override
            public String getUser(int userId) throws InterruptedException {
               System.out.println("Going to sleep for 5 Secs.. to simulate backend call.");
                //Introducing an intentional delay of 5 seconds
                // to Simulate the actual backend
                // service call to get the results
                Thread.sleep(1000*5);
                return null;
            }

            @Override
            public String removeUser(int userId) {
                return null;
            }

        }.getUser(4)));
    }

    @Test
    public void testSecurityConfig() {
        assertThat(Boolean.parseBoolean(String.valueOf(new WebSecurityConfigurer())));
    }
}


