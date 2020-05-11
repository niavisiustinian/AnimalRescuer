package com.jetbrains;



public class Main {
    public static void main(String[] args) {
    LogicalOperators op = new LogicalOperators();



    System.out.println(op.getHigherNumber( 4, 6));
    System.out.println(op.checkTextFastTrack("fasttrack"));
    System.out.println(op.exercitiu5 ("FastTrackIT" , 3 ));
    System.out.println(op.exercitiu6(5) );
    System.out.println( op.exercitiu7(5) );
    op.exercitu8(2);
    System.out.println( op.isNumberEven(3));
    System.out.println( op.isEligibleToVote(18));
    System.out.println( op.exercitiu11(18,12,14));
    //lab5
    op.printTo100(99);
    op.printToMinus100(1);
    op.printFromXToY(1,5);
    op.countFromSmallToBig(16,8);
    op.numereParePanaLa100(1);
    op.numereImparePanaLa100(2);
    op.sumTo100(99);
    System.out.println(op.sumAverageTo100(99));
    op.printTo100While(99);
    op.printToMinus100While(-99);
    op.printFromXToYWhile(1,3);
    op.countFromSmallToBigWhile(5,1);
    op.numereParePanaLa100While(90);
    op.numereImparePanaLa100While(1);
    System.out.println(op.sumAverageWhile());
    System.out.println(op.averageDivBy7FromXToY(7,21));
    op.fibonacci();




}



}

