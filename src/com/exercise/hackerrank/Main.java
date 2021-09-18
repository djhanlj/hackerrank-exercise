package com.exercise.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        System.out.println("oi tudo bem");

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
