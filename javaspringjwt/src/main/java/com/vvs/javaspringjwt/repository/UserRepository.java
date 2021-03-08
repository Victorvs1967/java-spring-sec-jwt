package com.vvs.javaspringjwt.repository;

import java.util.ArrayList;
import java.util.List;

import com.vvs.javaspringjwt.model.User;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    
    private List<User> users = new ArrayList<>();

    User u1 = new User("victor", "1234", "Victor", "Smirnov", 54);
    User u2 = new User("nata", "4321", "Natasha", "Smirnova", 51);

    public UserRepository() {
        
        this.users.add(new User("victor", "1234", "Victor", "Smirnov", 54));
        this.users.add(new User("nata", "4321", "Natasha", "Smirnova", 51));
    }

    public User getByLogin(String login) {
        return this.users.stream()
                .filter(user -> login.equals(user.getLogin()))
                .findFirst()
                .orElse(null);
    }

    public List<User> getAll() {
        return this.users;
    }
}
