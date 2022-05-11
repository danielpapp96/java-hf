package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class InverseFizzBuzz {
    public int index = 1;

    public List<Integer> exec(String input) {
        if(!validateInput(input)) {
            return Arrays.asList();
        };

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
            while (index < 100) {
                if(getSequence(splittedIn, results)) break;

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
        for (int i = this.index; i < 100; i++) {
            if (a.equals("Fizz")) {
                if (isFizz(i)) {
                    nums.add(i);
                    this.index = i + 1;
                    break;

                }
            } else if (a.equals("Buzz")) {
                if (isBuzz(i)) {
                    nums.add(i);
                    this.index += i + 1;
                    break;
                }
            } else if (a.equals(("FizzBuzz"))) {
                if (isFizzBuzz(i)) {
                    nums.add(i);
                    this.index = i + 1 ;
                    break;
                }
            }
        }

        for (int z = this.index; z < 100; z++) {
            if(a.equals("FizzBuzz") && index > 93) return true;

            if (b.equals("Fizz")) {
                if (isFizz(z)) {
                    nums.add(z);
                    this.index += 1;
                    results.add(nums);
                    break;
                } else {
                    if (isBuzz(z)) {
                        nums.clear();
                        this.index += 1;
                        break;
                    } else if (isFizzBuzz(z)) {
                        this.index += 1;
                        break;
                    } else {
                        nums.add(z);
                        this.index += 1;
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
                        break;
                    } else if(isFizzBuzz(z)){
                        nums.clear();
                        this.index += 1;
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
                        break;
                    } else if(isBuzz(z)){
                        nums.clear();
                        this.index += 1;
                        break;
                    } else {
                        nums.add(z);
                    }
                }
            }
        }
        return false;
    }

    private boolean isFizz(int i) {
        return i % 3 == 0;
    }

    private boolean isBuzz(int i) {
        return i % 5 == 0;
    }

    private boolean isFizzBuzz(int i) {
        return (i % 3 == 0) && (i % 5 == 0);
    }

    private boolean validateInput(String input) {
        var options = new ArrayList<String>(Arrays.asList("Fizz", "Buzz", "Fizz Buzz", "FizzBuzz", "Fizz Fizz", "Fizz FizzBuzz", "Buzz Fizz", "FizzBuzz Fizz", "FizzBuzz Buzz","FizzBuzz FizzBuzz"));
        for(String str: options) {
            if(str.trim().contains(input))
                return true;
        }
        return false;
    }
}
