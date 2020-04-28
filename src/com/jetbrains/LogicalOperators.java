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


    public static  String exercitiu5 ( String nume ,int numar) {
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
    public static  String exercitiu6 ( int numar) {
        if (numar > 8 || numar ==6) {
            return " The amount of snow this winter was" + numar;
        }  else {
            return " The forecast snow is(cm): " + numar;
        }
    }

    public static  String exercitiu7 ( int numar) {
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
    public static  void exercitu8(int numar){
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
    // Daca numarul e par sa returneze true iar daca e impar sa returnese false. Apelati metoda in main() pentru a verifica daca functioneaza.
    public static  boolean isNumberEven (int numar) {
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
    public static boolean isEligibleToVote(int numar){
        if(numar >= 18){
            return true;
        }else{
            return false;
        }
    }
    //11. Creati o metoda care sa primeasca 3 numere ca si parametrii
    // si sa returneze cel mai mare numar. Apelati metoda in main() pentru a verifica daca functioneaza.
    public static String exercitiu11(int primulNumar,int alDoileaNumar,int alTreileaNumar){
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
}










