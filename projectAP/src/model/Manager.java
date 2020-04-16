package model;

import java.util.ArrayList;

public class Manager extends Person {
    private ArrayList<Opinion> opinions;

    public Manager(String userName, String passWord) {
        super(userName, passWord);
    }

}
