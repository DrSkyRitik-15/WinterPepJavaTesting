package FacbookUsingJAVA;

import java.util.Scanner;

public class OneLogin implements LoginPage {

    OneLogin()
    {
        System.out.println("========================Welcome to Login Page=================");
    }

    @Override
    public void openLoginPage(){
        System.out.println("Enter username and password");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username: ");
        String username = sc.nextLine();
        System.out.println("Enter password: ");
        String password = sc.nextLine();
        login(username, password);

        System.out.println("Login Successful");
    }
    @Override
    public void login(String username, String password) {
        System.out.println("Login with username: " + username + " and password: " + password);
    }
    @Override
    public void logout() {
        System.out.println("Logout");
    }

    
}


