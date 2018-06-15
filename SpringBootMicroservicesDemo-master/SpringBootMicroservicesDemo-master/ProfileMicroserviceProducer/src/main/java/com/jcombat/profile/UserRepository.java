package com.jcombat.profile;

import java.util.List;

public interface UserRepository {
    List<User> getAllUsers();
    User getUser(String userId);
    Boolean CheckPassword(String username, String password);
    User getUserByName(String userName);
}
