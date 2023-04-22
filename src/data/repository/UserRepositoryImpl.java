
package data.repository;

import data.model.User;

import java.util.List;

public class UserRepositoryImpl implements UserRepository{
    List<User> users;
    int count;
    @Override
    public User saveUser(User user) {
        if(user.getId()==0){
            user.setId(count()+1);
            count++;
            users.add(user);
        }
        throw new IllegalArgumentException("User does not Exit");
    }

    @Override
    public User findUser(String firstName, String passWord) {
        return null;
    }

    @Override
    public String deleteUser(String firstName) {
        return null;
    }

    @Override
    public String deleteAll() {
        return null;
    }

    @Override
    public int count() {
        return count;
    }




}
