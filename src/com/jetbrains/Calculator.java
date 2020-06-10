package com.jetbrains;

public class Calculator {

    public  int sum(int primulNumar, int alDoileaNumar) {
    int rezultat = primulNumar + alDoileaNumar;
    return rezultat;
   } public  int sum(int primulNumar, int alDoileaNumar,int alTreiileaNumar) {
    int rezultat = primulNumar + alDoileaNumar + alTreiileaNumar;
    return rezultat;
   }
   public  double sum(double primulNumar, int alDoileaNumar) {
    double rezultat = primulNumar + alDoileaNumar;
    return rezultat;
   }



    public  int multiplication(int primulNumar, int alDoileaNumar) {
        int rezultat = primulNumar * alDoileaNumar;
        return rezultat;
    }
    public  int multiplication(int primulNumar, int alDoileaNumar,int alTreileaNumar) {
        int rezultat = primulNumar * alDoileaNumar* alTreileaNumar;
        return rezultat;
    } public  double multiplication(double primulNumar, double alDoileaNumar) {
        double rezultat = primulNumar * alDoileaNumar;
        return rezultat;
    }



    public  int substraction (int primulNumar, int alDoileaNumar) {
        int rezultat = primulNumar - alDoileaNumar;
        return rezultat;
    }
    public float substraction (float primulNumar, int alDoileaNumar) {
        float rezultat = primulNumar - alDoileaNumar;
        return rezultat;
    }
    public  int substraction (int primulNumar, int alDoileaNumar,int alTreileaNumar) {
        int rezultat = primulNumar - alDoileaNumar-alTreileaNumar;
        return rezultat;
    }

    public double division (double primulNumar, double alDoileaNumar) {
        double rezultat = primulNumar / alDoileaNumar;
        return rezultat;
    } public int division (int primulNumar, int alDoileaNumar) {
        int rezultat = primulNumar / alDoileaNumar;
        return rezultat;
    } public double division (double primulNumar, double alDoileaNumar,double alTreileaNumar) {
        double rezultat = primulNumar / alDoileaNumar/ alTreileaNumar;
        return rezultat;
    }
}
