package com.sparta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        Addition.add(x, y);
        Subtraction.operate(x, y);
        Multiplication.multiplier(x, y);
        DevideClass.devideNumbers(x, y);
    }
}