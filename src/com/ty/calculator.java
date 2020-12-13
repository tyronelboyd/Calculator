package com.ty;

public class calculator {
    public int add(int num1, int num2){
        int numAdd = num1 + num2;
        return numAdd;
    }

    public int subtract(int num1, int num2) {
        int numSubtract = num1 - num2;
        return numSubtract;
    }

    public int multiplication(int num1,int num2){
        int numMultiply = num1 * num2;
        return numMultiply;
    }

    public double divide(double num1, double num2){
        double numDivide = num1 / num2;
        return numDivide;
    }

    public int square(int num1){
        int numSquared = num1 * num1;
        return numSquared;
    }
}

class MagicCalculator extends calculator {
    public double squareRoot(double num1) {
        double temp;
        double sqRoot = divide(num1, 2);

        do {
            temp = sqRoot;
            sqRoot = (temp + (num1 / temp)) / 2;
        } while ((temp - sqRoot) != 0);

        return sqRoot;
    }

    public double sin(double degrees) {
        double radians = Math.toRadians(degrees);
        double sinEquals = Math.sin(radians);

        return sinEquals;
    }

    public double cos(double degrees) {
        double radians = Math.toRadians(degrees);
        double cosEquals = Math.cos(radians);

        return cosEquals;
    }

    public double tan(double degrees) {
        double radians = Math.toRadians(degrees);
        double tanEquals = Math.tan(radians);

        return tanEquals;
    }

    public int factorial(int number) {
        int i, fact = 1;
        for(i = 1; i <= number; i++){
            fact = multiplication(fact,i);
        }
        return fact;
    }

    public static void main(String[] args){
        // To reference non static methods
        MagicCalculator sq = new MagicCalculator();
        
    }

}
