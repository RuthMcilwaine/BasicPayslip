package com.jetbrains.ch6;


import java.util.*;

public class Exercises {
    public static void main(String[] args) {
        //   Exercise0601();
//        Exercise0602();
//        Exercise0603HashMaps();
        Exercise0603Arrays();
//        Exercise0605();

    }

    Scanner input = new Scanner(System.in);

    public static void Exercise0601() {
        ArrayList<Integer> arrOfScores = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students: ");

        int numOfStudents = input.nextInt();
        //arrOfScores = new Integer[numOfStudents];

        System.out.print("Enter " + numOfStudents + " scores: ");

        //adding scores into the array
        for (int i = 0; i < numOfStudents; i++) {
            // arrOfScores[i] = input.nextInt();
            arrOfScores.add(input.nextInt());
        }
        int max = Collections.max(arrOfScores);
        //  print
        for (int i = 0; i < arrOfScores.size(); i++) {
            // System.out.println("Student " + i + " score is " + arrOfScores[i] + " and grade is " + getGrade(max, arrOfScores[i]));
            System.out.println("Student " + i + " score is " + arrOfScores.get(i) + " and grade is " + getGrade(max, arrOfScores.get(i)));
        }

    }

    public static String getGrade(int max, int score) {
        if (score >= max - 10) {
            return "A";
        } else if (score >= max - 20) {
            return "B";
        } else if (score >= max - 30) {
            return "C";
        } else if (score >= max - 40) {
            return "D";
        } else {
            return "F";
        }
    }


    private static void Exercise0602() {
        ArrayList<Integer> reverseTen = new ArrayList<Integer>();

        reverseTen.add(1);
        reverseTen.add(2);
        reverseTen.add(3);
        reverseTen.add(4);
        reverseTen.add(5);
        reverseTen.add(6);
        reverseTen.add(7);
        reverseTen.add(8);
        reverseTen.add(9);
        reverseTen.add(10);
        Collections.reverse(reverseTen);
        System.out.println("Reverse list " + reverseTen);

//        System.out.println("Reversed array: ");
//        for (int k = reverseTen.length - 1; k < reverseTen.length; k--) {
//            System.out.println(reverseTen[k]);
//        }

    }


    private static void Exercise0603HashMaps() {
        Scanner input = new Scanner(System.in);

        HashMap<Integer, Integer> countNums = new HashMap<Integer, Integer>();

        while (true) {
            int enteredNumber = input.nextInt();

            if (enteredNumber == 0) {
                break;
            }

            countNums.putIfAbsent(enteredNumber, 0);
            int currentCount = countNums.get(enteredNumber);
            countNums.replace(enteredNumber, currentCount + 1);

        }

        for (int i = 1; i <= 100; i++) {
            if (countNums.containsKey(i)) {
                System.out.println("number " + i + " was entered " + countNums.get(i) + " times.");
            }
        }
    }

    private static void Exercise0603Arrays() {
        Scanner input = new Scanner(System.in);
        int[] numberArray = new int[100];

        while (true) {
            int num = input.nextInt();
            if (num == 0) {
                break;
            }
            numberArray[num - 1]++;
        }

        for (int i = 0; i < numberArray.length; i++) {
            if (numberArray[i] == 0) {
                continue;
            }
            System.out.println("number " + ( i + 1 ) + " was entered " + numberArray[i] + " times.");
        }
    }

    public static void Exercise0604() {
        Scanner input = new Scanner(System.in);

        //store user input scores
        //calculate the average
        //above or equal avg
        // below avg
        //neg num end the program
        System.out.println("Enter score and press enter after each entry.");
        ArrayList<Float> scoreList = new ArrayList<>();

        //int scoreList[] = new int[10];
        int aboveCounter = 0;
        int belowCounter = 0;
        float sum = 0;
        float avg;

        //for (int j = 0; j < scoreList.length; j++) {
        //scoreList[j] = input.nextInt();
        // sum = sum + scoreList[j];

        for (int i = 0; i < 10; i++) {
            float value = input.nextInt();
            if (value < 0) {
                break;
            }
            scoreList.add(value);
            sum += value;
        }
        avg = sum / scoreList.size();

        for (int j = 0; j < scoreList.size(); j++) {
            if (avg < scoreList.get(j)) {
                aboveCounter++;
            } else {
                belowCounter++;
            }
        }
        System.out.println(" " + aboveCounter + " are above or equal to the average and " + belowCounter + " are below average.");
    }

    public static void Exercise0605() {
        //takes in 10 numbers
        //display distinct numb (duplicates aren't counted)

        Scanner input = new Scanner(System.in);
        Set<Integer> distinctNums = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            distinctNums.add(input.nextInt());
        }

        System.out.println(distinctNums.size() + " distinct numbers.");
        distinctNums.forEach(System.out::println);


        //
    }

}


