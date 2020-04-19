package model;

public class Seller extends User {
    private String companyName;

    public Seller(String userName, String name, String lastName, String emailAddress, String passWord, String telephoneNumber,String companyName) {
        super(userName, name, lastName, emailAddress, passWord, telephoneNumber);
        this.companyName=companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

}
