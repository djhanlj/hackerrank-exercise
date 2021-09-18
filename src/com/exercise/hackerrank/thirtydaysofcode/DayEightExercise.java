package com.exercise.hackerrank.thirtydaysofcode;

import java.util.*;
import java.io.*;

public class DayEightExercise {

    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        Map<String,Integer> phoneBook = new HashMap<String,Integer>();

        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            phoneBook.put(name, phone);

        }
        while(in.hasNext()){
            String query = in.next();
            if(phoneBook.containsKey(query)) {
                System.out.println(query +"="+ phoneBook.get(query));
            }else{
                System.out.println("Not found");
            }

        }
        in.close();
    }
}
