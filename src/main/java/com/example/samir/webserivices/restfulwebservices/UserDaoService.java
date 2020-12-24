package com.example.samir.webserivices.restfulwebservices;

import com.example.samir.webserivices.restfulwebservices.user.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Component
public class UserDaoService {
    private static int count = 6;
    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User(1, "samir1", new Date()));
        users.add(new User(2, "samir2", new Date()));
        users.add(new User(3, "samir3", new Date()));
        users.add(new User(4, "samir4", new Date()));
        users.add(new User(5, "samir5", new Date()));
        users.add(new User(6, "samir6", new Date()));
    }

    public List<User> findAll() {
        return users;
    }


    public User save(User user) {

        if (user.getId() == null) {
            user.setId(++count);
        }
        users.add(user);
        return user;
    }

    public User findone(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }

        return null;
    }


    public User deleteById(int id) {
        Iterator<User> iterator = users.iterator();

        while (iterator.hasNext())
        {
            User user= iterator.next();

            if (user.getId()==id){
                iterator.remove();
                return user;

            }
        }

        return null;
    }

}
