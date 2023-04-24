package com.semdejong.week6;

import java.util.ArrayList;
import java.util.HashMap;

public class Fibonacci {

    private static HashMap<Integer, Integer> fibValue = new HashMap<>();

    public static void main(String[] args) {
        System.out.println(fibonacci(50));
    }

    public static int fibonacci(int n)  {
        if(n<2)
            return n;
        else {
            if(fibValue.containsKey(n)){
                return fibValue.get(n);
            }

            int val = fibonacci(n - 1) + fibonacci(n - 2);
            if (!fibValue.containsKey(n)) {
                fibValue.put(n, val);
            }
            return val;
        }
    }
}
