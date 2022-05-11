package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InverseFizzBuzz fizzBuzz = new InverseFizzBuzz();
        String input = sc.nextLine();

        if(input.length() > 17){
            System.out.println("Input is invalid: length " + input.length());
        }else {
            System.out.println(fizzBuzz.exec(input));
        }

    }


}
