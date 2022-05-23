package com.jetbrains.ch4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        //Exercise0413();
        //     Exercise0412();
        //      Exercises0405();
//        Exercises0403();
//        Exercises0402();
    }

    public static void Exercises0402() {
        final int NUMBER_OF_QUESTIONS = 10;
        int correctCount = 0;
        int count = 0;
        long startTime = System.currentTimeMillis();
        String output = "";
        Scanner input = new Scanner(System.in);

        while (count < NUMBER_OF_QUESTIONS) {
            int number1 = (int) ( Math.random() * 15 );
            int number2 = (int) ( Math.random() * 15 );

            System.out.print(
                    "What is " + number1 + " + " + number2 + "? ");
            int answer = input.nextInt();

            if (number1 + number2 == answer) {
                System.out.println("You are correct!");
                correctCount++;
            } else
                System.out.println("Your answer is wrong.\n" + number1 + " + " + number2 + " should be " + ( number1 + number2 ));
            count++;

            output += "\n" + number1 + "+" + number2 + "=" + answer + ( ( number1 + number2 == answer ) ? " correct" : " wrong" );
        }
        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;

        System.out.println("\nCorrect count is " + correctCount + "\nTest time is " + testTime / 1000 + " seconds\n" + output);
    }

    public static void Exercises0403() {

        System.out.println("Kilograms    Pounds");
//            System.out.println("Enter the amount in kilograms");
//            Scanner scanner = new Scanner(System.in);
//            int userInput = scanner.nextInt();


        for (int i = 1; i < 200; i += 2) {
            int kilograms = i;
            int pounds = (int) ( i * 2.2 );
            System.out.printf(" %d kilograms is equivalent to %f pounds/n", kilograms, pounds);

        }

    }

    public static void Exercises0405() {
        Scanner scanner = new Scanner(System.in);
        String studentName;
        int studentScore;
        String highestName = "";
        int highestScore = 0;


        do {
            System.out.println("Students name?");
            studentName = scanner.nextLine();
            if (studentName.equals("Q")) {
                break;
            }
            System.out.println("Students score?");
            studentScore = Integer.parseInt(scanner.nextLine());

            if (studentScore > highestScore) {
                highestName = studentName;
                highestScore = studentScore;

            }
        } while (true);
        System.out.println(highestName + " has the highest score.");

        //loop through the questions
        //Q for quit
        //exit the loop after the first question
        //compare current highest score with input score
        //store the highest name and score


    }

    public static void Exercise0412() {
        //finding the smallest n such that n2 > 12,000. use a while loop to find the smallest integer n such that n2 is greater than 12,000.
        //find the smallest n
        //while loop
        //n*n and compare if greater than 12,000

        int num = 0;

        while (num * num < 12000) {
            num++;
        }
        System.out.println(num);

    }

    public static void Exercise0413() {
        //find the largest n
        //while loop
        //n*n*n compare if less than 12,000

        int num = 0;

        do {
            num++;
        } while (( num * num * num ) < 12000);
        System.out.println(num - 1);
    }
}
