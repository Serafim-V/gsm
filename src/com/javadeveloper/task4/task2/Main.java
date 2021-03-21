package com.javadeveloper.task4.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("Введите стройку:");
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        String str = br.readLine();

        HashMap<Character, Integer> dict = new HashMap();

        for (int i = 0, n = str.length(); i < n; i++) {
            char c = Character.toLowerCase(str.charAt(i));

            byte b = (byte)c;

            if ((b >= 97 && b <= 122)) {
                if (dict.get(c) == null) {
                    dict.put(c, 1);
                } else {
                    dict.put(c, dict.get(c) + 1);
                }
            }

        }

        System.out.println(dict);

    }
}
