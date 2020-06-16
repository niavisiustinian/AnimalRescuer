package com.jetbrains;

public class Program {
    private Read read = new Read();
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
            case 9:
                threeOrFour();
                break;
            case 10:
                cifra();
                break;
            case 11:
                isNumberEven();
                break;
            case 12:
                isEligibleToVote();
                break;
            case 13:
                getHigherOfThree();
                break;
            case 14:
                printTo100();
                break;
            case 15:
                printToMinus100();
                break;
            case 16:
                printFromXToY();
                break;
            case 17:
                countFromSmallToBig();
                break;
            case 18:
                numereParePanaLa100();
                break;
            case 19:
                numereImparePanaLa100();
                break;
            case 20:
                sumTo100();
                break;
            case 21:
                printPattern();
                break;
            case 22:
                printTo100While();
                break;
            case 23:
                printToMinus100While();
                break;
            case 24:
                printFromXToYWhile();
                break;
            case 25:
                countFromSmallToBigWhile();
                break;
            case 26:
                sumAverageWhile();
                break;
            case 27:
                averageDivBy7FromXToY();
                break;
            case 28:
                fibonacci();
                break;
            case 29:
                cozaWozaLoza();
                break;
            case 30:
                myArray100();
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
                        "7. Check Text Fast And Number\n"+
                        "8. Snow\n"+
                        "9. Three Or Four\n"+
                        "10. Cifra\n"+
                        "11. Is Number Even\n"+
                        "12. Is Eligible To Vote\n"+
                        "13. Get Higher Of Three\n"+
                        "14. Print To 100\n"+
                        "15. Print To Minus 100\n"+
                        "16. Print From X To Y\n"+
                        "17. Count From Small To Big\n"+
                        "18. Numere Pare Pana La 100\n" +
                        "19. Numere Impare Pana La 100\n" +
                        "20. Sum To 100\n"+
                        "21. Print Pattern\n"+
                        "22. Print To 100 While\n"+
                        "23. Print To  Minus 100 While\n"+
                        "24. Print From X To Y While\n"+
                        "25. Count From Small To Big While\n"+
                        "26. Sum Average While\n"+
                        "27. Average Div By 7 From X To Y\n"+
                        "28. Fibonacci\n"+
                        "29. Coza Woza Loza\n"+
                        "30. My Array 100\n"+
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
        int number = read.getInt();
        System.out.println(op.exercitiu6(number));
    }
    private void threeOrFour () {
        int number = read.getInt();
        System.out.println(op.exercitiu7(number));
    }
    private void cifra () {
        int number = read.getInt();
        op.exercitu8(number);
    }
    private void isNumberEven () {
        int number = read.getInt();
        System.out.println(op.isNumberEven(number));
    }
    private void isEligibleToVote () {
        int number = read.getInt();
        System.out.println(op.isEligibleToVote(number));
    }
    private void getHigherOfThree() {
        System.out.println("Enter three values.");
        int first = read.getInt();
        int second = read.getInt();
        int third = read.getInt();
        System.out.println("The highest number is " + op.exercitiu11(first,second,third));
    }
    private void printTo100 () {
        int number = read.getInt();
        op.printTo100(number);
    }
    private void printToMinus100 () {
        int number = read.getInt();
        op.printToMinus100(number);
    }
    private void printFromXToY(){
        int first = read.getInt();
        int second = read.getInt();
        op.printFromXToY(first,second);
    }
    private void countFromSmallToBig(){
        int first = read.getInt();
        int second = read.getInt();
        op.countFromSmallToBig(first,second);
    }
    private void numereParePanaLa100(){

       op.numereParePanaLa100();
    }
    private void numereImparePanaLa100(){

        op.numereImparePanaLa100();
    }
    private void sumTo100(){
        int numar = read.getInt();
        op.sumTo100(numar);
    }
    private void printPattern(){
        op.printPattern();
    }
    private void printTo100While(){
        int numar = read.getInt();
        op.printTo100While(numar);
    }
    private void printToMinus100While(){
        int numar = read.getInt();
        op.printToMinus100While(numar);
    }
    private void printFromXToYWhile(){
        int first = read.getInt();
        int second = read.getInt();
        op.printFromXToYWhile(first,second);
    }
    private void countFromSmallToBigWhile(){
        int first = read.getInt();
        int second = read.getInt();
        op.countFromSmallToBigWhile(first,second);
    }
    private void sumAverageWhile(){
        op.sumAverageWhile();
    }
    private void averageDivBy7FromXToY(){
        int first = read.getInt();
        int second = read.getInt();
        op.averageDivBy7FromXToY(first,second);
    }
    private void fibonacci()
    {
        op.fibonacci();
    }
    private void cozaWozaLoza()
    {
        op.cozaWozaLoza();
    }
    private void  myArray100(){

        op. myArray100();
    }



}



