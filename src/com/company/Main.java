package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

public class Main {

    private static ArrayList<Integer> raffleNumbers = new ArrayList<>();
    private static ArrayList<String> raffleNames = new ArrayList<>();

    private static void buy(){
        Random random = new Random();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What is your name?");
        String name = "";
        try {
            name = bufferedReader.readLine();
        }catch (Exception e){
            System.out.println("error "+e);
        }
        raffleNames.add(name);

        raffleNumbers.add(random.nextInt(501));
        System.out.println("your raffle number is "+raffleNumbers.get(raffleNumbers.size()-1));
    }

    private static void check(){
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("what is your raffle number?");
        //ask for name
        String raffleNumber = "";
        if (raffleNumbers.size() < 1){
            System.out.println("no tickets have been bought");
        }else{
            for (int i = 0; i < raffleNumbers.size(); i++) {
                //check numbers then check name with number
            }
        }
    }

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("do you want to check your ticket or buy your ticket: buy/check");
        String option = "";
        try {
            option = bufferedReader.readLine();
        }catch (Exception e){
            System.out.println("error "+e);
        }

        if (option.equals("buy")){
            buy();
        }else if (option.equals("check")){
            check();
        }

    }
}
