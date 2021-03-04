package com.example.Library;

import java.util.ArrayList;
import java.util.Scanner;

public class Array {
    public String getValue(ArrayList<Integer> arr, int index) {
        String s;
        if (index < 0)
            s = "Negative Index dont exist";
        else if (index >= arr.size())
            s = "Array index out of bound";
        else
            s = "Value at index " + index + " is " + arr.get(index);
        return s;
    }
}
