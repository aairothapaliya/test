package week8.Utils;

import week8.Constants;
import week8.FileHandler;

public class Registration {

    public String registerUser(String[] userDetail) {
        FileHandler fh = new FileHandler();
        return fh.CreateOrAdd(Constants.userDetailFileName, userDetail);
    }
}
