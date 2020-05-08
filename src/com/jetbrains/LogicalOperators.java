package com.jetbrains;

public class LogicalOperators {
    public int getHigherNumber(int firstNumber, int secondNumber) {
        if (firstNumber < secondNumber) {
            return secondNumber;
        } else {
            return firstNumber;
        }
    }

    public String checkTextFastTrack(String text) {
        if (text.equals("FastTrack")) {
            return "Learning...";
        } else {
            return "Got to try some more";
        }
    }


    public   String exercitiu5 ( String nume ,int numar) {
        if (nume.equals("FastTrackIT") && numar <= 3) {
            return nume + numar;

        } else if (!nume.equals("FastTrackIT") && numar >= 4) {
            return  numar + nume ;
        }else{return "nici o conditie intrunita ";
        }
    }
//6. Creati o metoda de tip String, care sa primeasca un parametru de tip int.
// Daca numarul primit este mai mare de 8, SAU egal cu 6,
// atunci sa se returneze “The amount of snow this winter was(cm): “ si numarul.
// Daca nu, sa printeze “The forecast snow is(cm):” si numarul. Apelati metoda in main() pentru a verifica daca functioneaza.
    public  String exercitiu6 ( int numar) {
        if (numar > 8 || numar ==6) {
            return " The amount of snow this winter was" + numar;
        }  else {
            return " The forecast snow is(cm): " + numar;
        }
    }

    public   String exercitiu7 ( int numar) {
        if (numar > 3 && numar != 4) {
            return "The number is greater than 3 and not equal to 4";
        } else if (numar == 4) {
            return "The number is equal to 4";
        } else if  (numar < 3) {
            return " The number is lower than 3";
        }
        else {
            return "nu se poate";
        }
    }
    //8. Creati o metoda care primeste un numar ca si parametru si sa afiseze ce numar a primit.
    // Folosind constructia Switch-Case, verificati ce numar s-a primit si afisati textul "The number is:  x !"
    // unde x trebuie sa reprezinte numarul apasat. Pentru exemplul de fata sa nu se foloseasca concatenarea stringului
    // "The number is:" cu numarul de la parametru, ci sa se scrie intreg textul cu tot cu numar pentru fiecare caz din Switch-Case.
    // Apelati metoda in main() pentru a verifica daca functioneaza.
    public   void exercitu8(int numar){
        switch (numar){
            case 1:
                System.out.println("the number is 1");
                break;

            case 2:
                System.out.println("the number is 2");
                break;

            case 3:
                System.out.println("the number is 3");
                break;
            case 4:
                System.out.println(" the number is 4");
                break;
            case 5:
                System.out.println(" the number is 5");
                break;
            case 6:
                System.out.println(" the number is 6");
                break;
            case 7:
                System.out.println(" the number is 7");
                break;
            case 8:
                System.out.println(" the number is 8");
                break;
            case 9:
                System.out.println(" the number is 9");
                break;
            case 0:
                System.out.println(" the number is 0");
                break;

                default:
                System.out.println("the number is <0 or >9 ");
        }

    }
    //9. Creati o metoda care sa se numeasca isNumberEven.
    // Metoda trebuie sa primeasca ca parametru un numar, si sa returneze adevarat sau fals.
    // Daca numarul e par sa returneze true iar daca e impar sa returnese false.
    // Apelati metoda in main() pentru a verifica daca functioneaza.
    public  boolean isNumberEven (int numar) {
        if (numar % 2 == 0) {
            return  true;
        } else {
            return false;
        }
    }
    //10. Creati o metoda care sa se numeasca isEligibleToVote.
    // Metoda sa primeasca ca si parametru un numar, care sa reprezinte varsta,
    // iar metoda sa iti zica daca daca persoana are drept de vot. Daca varsta e peste 18, sa se returneze true iar daca nu
    // , sa returneze false. Apelati metoda in main() pentru a verifica daca functioneaza.
    public  boolean isEligibleToVote(int numar){
        if(numar >= 18){
            return true;
        }else{
            return false;
        }
    }
    //11. Creati o metoda care sa primeasca 3 numere ca si parametrii
    // si sa returneze cel mai mare numar. Apelati metoda in main() pentru a verifica daca functioneaza.
    public  String exercitiu11(int primulNumar,int alDoileaNumar,int alTreileaNumar){
        if( primulNumar>alDoileaNumar && primulNumar>alTreileaNumar){
            return primulNumar +" e cel mai mare";
        }else if( alDoileaNumar>primulNumar && alDoileaNumar>alTreileaNumar){
            return alDoileaNumar +" e cel mai mare numar";
        }else if (alTreileaNumar>primulNumar && alTreileaNumar>alDoileaNumar ){
            return alTreileaNumar +" e cel mai mare numar";
        }else {
            return "nu se poate ";
        }
    }

    //lab5

    //1.Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru.
    // Metoda sa verifice numarul primit, si sa afiseze in consola o numaratoare pana la 100,
    // pornind de la numarul primit ca si parametru. Atentie la crearea tipului metodei,
    // deoarece metoda afiseaza, nu returneaza.
    public  void printTo100 (int numar){
        for(int i = numar ; i<=100; i++ ){
            System.out.println(i);
        }
    }
    //2. Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru.
    // Metoda sa verifice numrul primit, si sa afiseze in consola o numaratoare pana la -100
    //  pornind de la numarul primit ca si parametru. Atentie la crearea tipului metodei,
    //  deoarece metoda afiseaza, nu returneaza.
    public void printToMinus100 (int numar){
        for(int i = numar; i >= -100;i-- ){
            System.out.println(i);
        }
    }
   // 3. Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar.
    // Metoda sa afiseze o numaratoare intre cele doua numere primite, pornind de la primul parametru primit,
    // pana la cel de-al doilea(ex: daca int x e primul parametru iar int y  este cel de-al doilea,
    // numaratoarea sa se faca de la x, la y.
   public  void printFromXToY (int x,int y ){
       for(x=x; x<=y; x++){
           System.out.println(x);
       }
   }
   //4. Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar.
    // Metoda trebuie sa verifice care dintre cele doua numere este mai mare,
    // si sa execute o numaratoare crescatoare de la cel mai mic la cel mai mare.(ex: daca int x e primul parametru
    // iar int y  este cel de-al doilea, daca x  este mai mare decat y,  atunci numaratoarea sa fie de la y la x).

      public void countFromSmallToBig (int x,int y){
        if (x <= y){
        for (int i= x;i<=y;i++)
        { System.out.println(i+""); }
        }
        else
            for ( int i =y;i<=x;i++){
                System.out.println(i+"");
            }

      }
      //5. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100.

    public void numereParePanaLa100(int x){

        for (x = 1; x <= 100; x++) {
            if (x % 2 == 0)
                System.out.println(x);
            }
        }
    //6.Creati o metoda in clasa LogicalOp care sa afiseze toate numerele impare de la 1 la 100.
    public void numereImparePanaLa100(int x){

        for (x = 1; x <= 100; x++) {
            if (x % 2 != 0)
                System.out.println(x);
        }
    }
    //7. Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar.
    // Metoda sa adune toate numerele pana la 100, pornind de la numarul primit ca si parametru,
    // iar la final sa returneze rezultatul.
    // Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.

    public void sumTo100(int numar){
        int sum= 0;
        for (int i = numar;i <=100;i++ ){
            sum +=i;
        }
        System.out.println(sum);
    }
    //8. Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar.
    // Metoda sa adune toate numerele pana la 100, pornind de la numarul primit ca si parametru,
    // si sa calculeze media numerelor. La final, metoda sa returneze media.
    // Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.
    public float sumAverageTo100(int numar){
        float sum= 0;
        for (int i = numar;i <=100;i++ ){
            sum +=i;
        }
        float average= sum/(100-numar+1);

        return average;
    }
    //9. Creat o metoda in clasa LogicalOp care sa afiseze urmatorul tipar:

    //*******
    //******
    //*****
    //****
    //***
    //**
    //*
    //Cateva mentiuni:pentru a putea rezolva problema, trebuie folosite doua bucle for. O bucla se va construi in alta bucla.
    //- prima bucla for se va ocupa de afisarea pe orizontala, si cealalta pe verticala
    //- semnul asterisk (*) se poate afisa sub forma de string
    //Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.





}










