package data.repository;

import data.model.User;

public interface  UserRepository {
    User saveUser (User user);
    User findUser(String firstName,String passWord);
    String deleteUser(String firstName);
    String deleteAll();

    int count();
}

