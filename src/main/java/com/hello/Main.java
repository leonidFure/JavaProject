package com.hello;

import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello. Please enter your name:");
        Scanner in = new Scanner(System.in);
        System.out.printf("Hello, %s",in.nextLine());
    }
}
