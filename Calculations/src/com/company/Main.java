package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //enter first number
        System.out.println("Enter a number:");
        int firstNum = input.nextInt();

        //enter second number
        System.out.println("Enter another number:");
        int secondNum = input.nextInt();

        //calculate sum
        int sumTotal = firstNum + secondNum;
        System.out.println("Sum =" + sumTotal);

        //calculate product
        int prodTotal = firstNum * secondNum;
        System.out.println("Product =" + prodTotal);

        //calculate sqaure
        int sqaureTotal = firstNum * firstNum;
        System.out.println("The sqaure =" + sqaureTotal);

        Scanner newinput = new Scanner(System.in);

        //input first string
        System.out.println("Enter a string :");
        String firsString = newinput.nextLine();

        //input second string
        System.out.println("Enter another string :");
        String secondString = newinput.nextLine();

        System.out.println(firsString + " " + secondString);
    }
}
