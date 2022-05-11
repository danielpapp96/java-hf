package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InverseFizzBuzz fizzBuzz = new InverseFizzBuzz();
        System.out.println(fizzBuzz.exec(sc.nextLine()));
    }


}
