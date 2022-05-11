package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InverseFizzBuzz {
    public int index = 1;

    public List<Integer> exec(String input) {
        String[] splittedIn = input.split(" ");
        List<Integer> nums = new ArrayList<>();


        if (splittedIn.length == 1) {
            String a = splittedIn[0];
            for (int i = 1; i < 101; i++) {
                if (a.equals("Fizz")){
                    nums.add(3);
                    return nums;
                }
                if (a.equals("Buzz")){
                    nums.add(5);
                    return nums;
                }
                if (a.equals("FizzBuzz")){
                    nums.add(15);
                    return nums;
                }
            }
        } else if (splittedIn.length == 2) {
            while (true) {
                if(getSequence(splittedIn, nums)) break;
            }

        }
        return nums;
    }


    public boolean getSequence(String[] splittedIn, List<Integer> nums) {
        String a = splittedIn[0];
        String b = splittedIn[1];

        //looking for the first number
        for (int i = this.index; i < 101; i++) {
            if (a.equals("Fizz")) {
                if (isFizz(i)) {
                    nums.add(i);
                    this.index = i + 1;
                    break;

                }
            } else if (a.equals("Buzz")) {
                if (isBuzz(i)) {
                    nums.add(i);
                    this.index += 1;
                    break;
                }
            } else if (a.equals(("FizzBuzz"))) {
                if (isFizzBuzz(i)) {
                    nums.add(i);
                    this.index += i + 1;
                    break;
                }
            }
        }

        for (int z = this.index; z < 101; z++) {
            if (b.equals("Fizz")) {
                if (isFizz(z)) {
                    nums.add(z);
                    this.index = z + 1;
                    return true;
                } else {
                    if (isBuzz(z)) {
                        nums.clear();
                        this.index = z;
                        nums = new ArrayList<>();
                        break;
                    } else if (isFizzBuzz(z)) {
                        nums = new ArrayList<>();
                        this.index = z;
                        break;
                    } else {
                        nums.add(z);
                    }
                }
            } else if (b.equals("Buzz")) {
                if (isBuzz(z)) {
                    nums.add(z);
                    this.index += z + 1;
                    return true;
                } else {
                    if(isFizz(z)){
                        nums.clear();
                        this.index = z;
                        nums = new ArrayList<>();
                        break;
                    } else if(isFizzBuzz(z)){
                        nums.clear();
                        this.index = z;
                        nums = new ArrayList<>();
                        break;
                    } else {
                        nums.add(z);
                    }
                }
            } else if (b.equals(("FizzBuzz"))) {
                if (isFizzBuzz(z)) {
                    nums.add(z);
                    index += z + 1;
                    return true;
                } else {
                    if(isFizz(z)){
                        nums.clear();
                        this.index = z;
                        nums = new ArrayList<>();
                        break;
                    } else if(isBuzz(z)){
                        nums.clear();
                        this.index = z;
                        nums = new ArrayList<>();
                        break;
                    } else {
                        nums.add(z);
                    }
                }
            }
        }
        return false;
    }

    public boolean isFizz(int i) {
        return i % 3 == 0;
    }

    public boolean isBuzz(int i) {
        return i % 5 == 0;
    }

    public boolean isFizzBuzz(int i) {
        return (i % 3 == 0) && (i % 5 == 0);
    }
}
