package com.javadeveloper;

import com.javadeveloper.entities.Car;
import com.javadeveloper.utils.Commands;
import com.javadeveloper.utils.Data;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    private static String[] inputString = {"C100_1-100", "C200_1-120-1200", "C300_1-120-30", "C400_1-80-20", "C100_2-50", "C200_2-40-1000", "C300_2-200-45", "C400_2-10-20", "C100_3-10", "C200_3-170-1100", "C300_3-150-29", "C400_3-100-28", "C100_1-300", "C200_1-100-750", "C300_1-32-15"};

    public static void main(String[] args) {
        ArrayList<Car> cars = Data.parseInputString(inputString);

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        String command;

        while (true) {
            try {
                System.out.println("Введите команду");
                command = br.readLine();
                Commands.parseCommand(command, cars);
            } catch (Exception e) { }
        }
    }

}
