package com.spring.IoC;

public class UserLogin {
    private User user;

    public UserLogin(User user) {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public UserLogin() {

    }

    public boolean userLogin(User user) {
        if (!(!user.getPassword().equals("1234") && !user.getAccount().equals("225171"))) {
            return true;
        }
        return  false;
    }
}