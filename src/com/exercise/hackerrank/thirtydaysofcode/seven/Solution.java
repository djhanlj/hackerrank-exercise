package com.exercise.hackerrank.thirtydaysofcode.seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int sizeArray = Integer.parseInt(bufferedReader.readLine().trim());
        List<Integer> listNumber = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        bufferedReader.close();
        Collections.reverse(listNumber);
        for (int i = 0; i < sizeArray; i++) {
            System.out.print(listNumber.get(i) + " ");
        }
    }
}
