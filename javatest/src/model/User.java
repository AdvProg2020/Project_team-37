package model;

import java.util.Scanner;

public class User {
    protected String userName;
    protected String name;
    protected String lastName;
    protected String emailAddress;
    protected String passWord;
    protected String telephoneNumber;
    protected Scanner scanner;

    public User(String userName, String name, String lastName, String emailAddress, String passWord, String telephoneNumber) {
        this.userName = userName;
        this.name = name;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.passWord = passWord;
        this.telephoneNumber = telephoneNumber;
        scanner=new Scanner(System.in);
    }

    public String getUserName() {
        return userName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getPassWord() {
        return passWord;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }
}
