package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {

        //  TEST#1
        SimpleUser simpleUser = new SimpleUser("Marcin");
        String result = simpleUser.getUSername();
        if (result.equals("Marcin")) {
            System.out.println("Test 1 OK");
        } else {
            System.out.println("Error");
        }

        //  TEST#2
        Calculator calculator = new Calculator();
        int addResult = calculator.add(3, 11);
        if(addResult == 14) {
            System.out.println("Test 2 OK");
        } else {
            System.out.println("Error");
        }

        // Test#3
        int subResult = calculator.subtract(6, 2);
        if(subResult == 4) {
            System.out.println("Test 3 OK");
        } else {
            System.out.println("Error");
        }
    }
}