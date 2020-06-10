package com.jetbrains;

public class Lab5 {

    public static void main(String[] args) {
        LogicalOperations op = new LogicalOperations();
        op.myArray100();
        int[] array = new int[50];
        array = op.fillArray(array);


        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
