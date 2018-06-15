package com.jcombat.profile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;

@Repository
public class  StubUserRepository implements UserRepository {

    private List<User> users = new ArrayList<>();

    public StubUserRepository() {
        User profile = new User("1000", "Ajit", "123");
        users.add(profile);
        profile = new User("2000", "Amay", "123");
        users.add(profile);
        profile = new User("3000", "Dinesh", "123");
        users.add(profile);
    }

    @Override
    public List<User> getAllUsers() {
        return users;
    }

    @Override
    public User getUser(String userId) {
        for (User u : users)
        {
            if (u.getUserID().equals(userId))
            {
                return u;
            }
        }
        return null;
    }

    @Override
    public Boolean CheckPassword(String username, String password)
    {
        Boolean toreturn = false;
        for (User u : users) {
            if (u.getName().equals(username))
            {
                if (u.getPassword().equals(password))
                {
                    toreturn = true;
                }
            }

        }
        return toreturn;
    }

    @Override
    public User getUserByName(String username)
    {
        for (User u : users
             ) {
            if (u.getName().equals(username))
            {
                return u;
            }

        }
        return null;
    }



}