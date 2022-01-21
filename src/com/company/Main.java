package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // System.out.println("What is your number");
        //int userNum = input.nextInt();
        // for (int i = 0; i <= 10; i++){
        // System.out.println(userNum);
        //}
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(j + i);
            }
            System.out.println("");
        }
    }
}