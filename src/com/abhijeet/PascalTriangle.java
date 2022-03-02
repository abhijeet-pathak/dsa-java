package com.abhijeet;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        System.out.println(generate(5));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for (int row=1; row <= numRows; row++) {
            List<Integer> levelArray = new ArrayList<>();

            if (row <= 2) {
                for (int i=1; i<=row; i++) {
                    levelArray.add(1);
                }
            } else {
                levelArray.add(1);

                int columns = row;

                List<Integer> prevLevel = result.get(row-2);
                for (int i=1; i<columns-1; i++) {
                    levelArray.add(prevLevel.get(i-1) + prevLevel.get(i));
                }

                levelArray.add(1);
            }

            result.add(levelArray);
        }

        return result;
    }
}
