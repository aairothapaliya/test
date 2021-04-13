package week8.Utils;

import week8.Constants;
import week8.FileHandler;

public class Login {
    public boolean checkLogin (String userName, String password) {
        FileHandler fh = new FileHandler();
        boolean validUser = false;

        String data[] = fh.ReadOrFetch(Constants.userDetailFileName, userName, 4);
        if (data != null) {
            validUser = validateUser(password, data[5]);
        }
        return validUser;
    }

    boolean validateUser(String typedPassword, String savedPassword) {
        return typedPassword.equals(savedPassword);
    }
}
