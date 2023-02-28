package com.regex;

import java.util.Scanner;

public class ValidPasswordRulesUC6  {
    static String VALID_PATTERN ="([A-Za-z]{8})$";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Password :");
        String name = sc.next();
        boolean valid = name.matches(VALID_PATTERN);
        if (valid) {
            System.out.println("Valid Password Rule 2. ");
        } else {
            System.out.println("Not valid rule for password. ");
        }
    }
}