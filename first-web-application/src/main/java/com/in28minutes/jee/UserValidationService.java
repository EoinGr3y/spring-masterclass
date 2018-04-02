package com.in28minutes.jee;

public class UserValidationService {

    public boolean isUserValid(final String user, final String password) {
        if (user.equals("John") && password.equals("password"))
            return true;

        return false;
    }

}
