package com.comarch.camp.it.rent.car.db;

import com.comarch.camp.it.rent.car.model.User;

public class UserRepository {
    private final User[] users = new User[3];

    public UserRepository() {
        this.users[0] = new User("admin", "d7df75a7310ab5cefaabd61266c7b028", "ADMIN");
        this.users[1] = new User("janusz", "7ffa31a869e122c0aff17af274c55cfb", "USER");
        this.users[2] = new User("mateusz", "a5530b291d856416c2f0699c78b80f35", "USER");
    }

    public User findByLogin(String login) {
        for(User user : this.users) {
            if(user.getLogin().equals(login)) {
                return user;
            }
        }

        return null;
    }
}
