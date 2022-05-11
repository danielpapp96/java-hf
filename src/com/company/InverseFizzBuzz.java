package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class InverseFizzBuzz {
    public int index = 1;

    public List<Integer> exec(String input) {
        String[] splittedIn = input.split(" ");
        List<Integer> nums = new ArrayList<>();
        List<List<Integer>>results = new ArrayList<>();

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
                if(getSequence(splittedIn, results) || index == 101) break;
            }

        }

        return getTheMinList(results);
    }

    private static List<Integer> getTheMinList(List<List<Integer>> lists){
        return lists.stream()
                .min(Comparator.comparingInt(List::size))
                .orElse(new ArrayList<>());
    }


    public boolean getSequence(String[] splittedIn,List<List<Integer>>results) {
        String a = splittedIn[0];
        String b = splittedIn[1];
        List<Integer> nums = new ArrayList<>();
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
                    results.add(nums);
                    break;
                } else {
                    if (isBuzz(z)) {
                        nums.clear();
                        this.index += 1;
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
                    this.index += 1;
                    results.add(nums);
                    break;
                } else {
                    if(isFizz(z)){
                        nums.clear();
                        this.index += 1;
                        nums = new ArrayList<>();
                        break;
                    } else if(isFizzBuzz(z)){
                        nums.clear();
                        this.index += 1;
                        nums = new ArrayList<>();
                        break;
                    } else {
                        nums.add(z);
                    }
                }
            } else if (b.equals(("FizzBuzz"))) {
                if (isFizzBuzz(z)) {
                    nums.add(z);
                    this.index += 1;
                    results.add(nums);
                    break;
                } else {
                    if(isFizz(z)){
                        nums.clear();
                        this.index += 1;
                        nums = new ArrayList<>();
                        break;
                    } else if(isBuzz(z)){
                        nums.clear();
                        this.index += 1;
                        nums = new ArrayList<>();
                        break;
                    } else {
                        nums.add(z);
                    }
                }
            }
        if(index == 100) return true;
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
