package com.ak47.spark;

import java.util.Collection;

public interface UserService {

    public void addUser(User user);

    public Collection<User> getUsers();

    public User getUser(String id);

    public User editUser(User user);

    public void deleteUser(String user);

    public boolean userExist(String user);

}
