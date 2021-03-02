package com.example.Library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class LibraryStarter {
    @Autowired
    private LogoutController logout;
    @Autowired
    private BookIssuer issue;
    @Autowired
    private ReturnController reeturn;

    public void start() {

        String user_name = "admin";
        String user_password = "admin";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter user name");
        String name = sc.next();
        System.out.println("Enter password");
        String password = sc.next();
        if (user_name.equals(name) && user_password.equals(password)) {
            System.out.println("Welcome to the library!");
            System.out.println("You can choose from the following functions.");
            System.out.println();
            System.out.println("If you want to Issue Books   : press 1");
            System.out.println("If you want to Return Books  : press 2");
            System.out.println("If you want to Logout        : press 3");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    issue.issueProcess();
                    break;
                case 2:
                    reeturn.returnProcedure();
                    break;
                case 3:
                    logout.logout();
                    break;
                default:
                    System.out.println("OOPS!...You entered wrong choice.");
            }
        } else {
            System.out.println("Wrong user name or password");
        }
    }

}
