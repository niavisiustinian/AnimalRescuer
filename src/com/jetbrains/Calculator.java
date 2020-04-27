package com.jetbrains;

public class Calculator {
    public  int sum(int primulNumar, int alDoileaNumar) {
    int rezultat = primulNumar + alDoileaNumar;
    return rezultat;
}

    public  int multiplication(int primulNumar, int alDoileaNumar) {
        int rezultat = primulNumar * alDoileaNumar;
        return rezultat;
    }

    public  int substraction (int primulNumar, int alDoileaNumar) {
        int rezultat = primulNumar - alDoileaNumar;
        return rezultat;
    }

    public double division (double primulNumar, double alDoileaNumar) {
        double rezultat = primulNumar / alDoileaNumar;
        return rezultat;
    }
}
