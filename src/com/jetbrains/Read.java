package com.jetbrains;

import java.util.Scanner;

 import java.util.InputMismatchException;


    public class Read {


        public int getInt() {

            boolean repeat = true;
            int myInt = 0;
            do {
                try {
                    Scanner scanner = new Scanner(System.in);
                    System.out.print("Enter a number: ");
                    myInt = scanner.nextInt();

                    repeat = false;

                } catch (InputMismatchException error) {
                    System.out.println("Incorrect value entered, pls try again.");
                }
            } while (repeat == true);
            return myInt;
        }

        public String getString(){
            Scanner scanner= new Scanner(System.in);
            return scanner.next();
        }

    }

