package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	System.out.println("thanh dep trai");
        Scanner scanner = new Scanner(System.in);
        int a;
        float b;
        System.out.println("mơi ban nhap so a: ");
        a = scanner.nextInt();
        System.out.println("moi ban nap b: ");
        b = scanner.nextFloat();
        System.out.println("gia tri a: " + a);
        System.out.println("gia tri b: " + b);

    }
}
