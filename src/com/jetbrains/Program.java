package com.jetbrains;

public class Program {private Read read = new Read();
    private Calculator calc = new Calculator();
    private LogicalOperations op = new LogicalOperations();

    public void startProgram() {

        boolean repeatProgram;
        do {
            repeatProgram = executeProgram();
        } while (repeatProgram);


    }

    private boolean executeProgram() {
        printMenu();
        int number = read.getInt();
        switch (number) {
            case 1:
                doSum();
                break;
            case 2:
                doSubstract();
                break;
            case 3:
                doDivision();
            case 4:
                printHigherNumber();
                break;
            case 5:
                checkTextFast();
                break;
            case 6:
                multiplication();
                break;
            case 7:
                checkTextFastAndNumber();
                break;
            case 8:
                snow();
                break;
                case 0:
                System.out.println("See you next time!");
                return false;


            default:
                printMenu();
        }
        return true;
    }


    private void printMenu() {
        System.out.println(
                "Hello!\n" +
                        "Choose an option:\n" +
                        "1. Sum\n" +
                        "2. Substraction\n" +
                        "3. Division\n" +
                        "4. Get higher number\n" +
                        "5. Check text FastTrack\n" +
                        "6. Multiplication\n"+
                        "7. CheckTextFastAndNumber\n"+
                        "8. Snow\n"+
                        "\n" +
                        "0. EXIT"

        );
    }

    private void doSum() {
        System.out.println("Enter two values.");
        int first = read.getInt();
        int second = read.getInt();
        System.out.println("The sum is: " + calc.sum(first, second));
    }

    private void doSubstract() {
        System.out.println("Enter two values.");
        int first = read.getInt();
        int second = read.getInt();
        System.out.println("The result is: " + calc.substraction(first, second));
    }
    private void doDivision() {
        System.out.println("Enter two values.");
        int first = read.getInt();
        int second = read.getInt();
        System.out.println("The result is: " + calc.division(first, second));
    }


    private void printHigherNumber() {
        System.out.println("Enter two values.");
        int first = read.getInt();
        int second = read.getInt();
        System.out.println("the higher number is: " +
                op.getHigherNumber(first, second));
    }

    private void checkTextFast() {
        System.out.print("Enter text:");
        String text = read.getString();
        System.out.println(op.checkTextFastTrack(text));
    }
    private void multiplication() {
        System.out.println("Enter two values.");
        int first = read.getInt();
        int second = read.getInt();
        System.out.println("The result is: " + calc.multiplication (first, second));
    }
    private void checkTextFastAndNumber() {
        System.out.print("Enter text:");
        String text = read.getString();
        int number = read.getInt();
        System.out.println(op.exercitiu5(text,number));
    }
    private void snow() {
        System.out.print("Enter number:");
        int number = read.getInt();
        System.out.println(op.exercitiu6(number));
    }


    private void sortList() {
//        List<Integer> list = read.getList();
//        System.out.println(op.sortList(list));
    }
}


