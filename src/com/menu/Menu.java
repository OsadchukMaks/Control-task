package com.menu;

import com.tasks.*;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static final String USER_NAME = "John";
    public static final String PASSWORD = "123456";

    private static String getUserInfo(String message) {
        System.out.println(message);
        return SCANNER.next();
    }

    public static void loginToApp() {
        while(true) {
            String login = getUserInfo("Enter login");

            String password = getUserInfo("Enter password");

            try {
                if (!login.equals(USER_NAME)) {
                    throw new IOException("Incorrect login");
                }

                if (!password.equals(PASSWORD)) {
                    throw new IOException("Incorrect password");
                }
                System.out.println("Hello " + USER_NAME + "!");
                return;
            } catch (IOException e) {
                System.out.println(e.getMessage());
                continue;
            }
        }
    }

    public static void main(String[] args) {
        loginToApp();
        while (true) {
            menu();
            int key = SCANNER.nextInt();
            try {
                switch (key) {
                    case 1: {
                        String number = getUserInfo("Enter number for checking on even");
                        boolean isEven = EvenNumber.checkEvenNumber(Integer.parseInt(number));
                        System.out.println("Result " + isEven);
                        break;
                    }
                    case 2: {
                        String number = getUserInfo("Enter number for checking on Armstrong number");
                        boolean isArmstrong = Armstrong.isArmstrong(Integer.parseInt(number));
                        System.out.println("Result " + isArmstrong);
                        break;
                    }
                    case 3: {
                        String str = getUserInfo("Enter string for reverse");
                        if (str.isEmpty()) {
                            throw new IOException("The string is empty");
                        }

                        System.out.println("Result = " + ReverseString.reverse(str));
                        break;
                    }case 4: {
                        System.out.println("Print first 50 numbers Fibonacci");
                        Fibonacci.printFirstFiftyFibonachi();
                        break;
                    }
                    case 5: {
                        System.out.println("Enter string for replacing symbols");
                        SCANNER.reset();
                        String str = SCANNER.next();
                        if (str.isEmpty()) {
                            throw new IOException("The string is empty");
                        }
                        if (str.length() > 30) {
                            throw new IOException("The string length > 30");
                        }

                        System.out.println("Result = " + ReplaceSymbols.replace(str));
                        break;
                    }
                    case 6:
                        return;
                    default:
                        return;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void menu() {
        System.out.println("Choose task\n" +
                "1) Even Number.\n" +
                "2) Armstrong.\n" +
                "3) Reverse.\n" +
                "4) Fibonacci.\n" +
                "5) Replace.\n" +
                "6) Exit.");
    }
}

