package com.company.Java;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        //Creating Scanner object
        Scanner s = new Scanner(System.in);
        //Taking Name From User
        System.out.println("Enter Your Name");
        String name = s.nextLine();
        System.out.println("We Welcome You "+name);
        //Printing Instructions
        System.out.println("""
                Instructions :\s
                 1.Press 1 for Rock.\s
                 2.Press 2 for Paper\s
                 3.Press 3 for Scissor\s
                 If Tie Both will get One Point""");
        int n=0;
        while(n<5) {

            int var = s.nextInt();
            System.out.println(name + " Selected : ");
            switch (var) {
                case 1 -> System.out.println("Rock");
                case 2 -> System.out.println("Paper");
                case 3 -> System.out.println("Scissor");
                default -> System.out.println("Invalid Option");
            }

            // Creating Random Choice For Computer
            Random r = new Random();
            int upperbound = 3;
            int random = r.nextInt(upperbound);
            System.out.println("Computer Selected");
            if (random == 0) {
                System.out.println("Rock");
            } else if (random == 1) {
                System.out.println("Paper");
            } else {
                System.out.println("Scissor");
            }

            if (random == 0 && var == 1 || random == 1 && var == 2 || random == 2 && var == 3) {
                System.out.println("Tie");
            } else if (random == 0 && var == 2) {
                System.out.println(name + " Wins");
            } else if (random == 0 && var == 3) {
                System.out.println("Computer Wins");
            } else if (random == 1 && var == 1) {
                System.out.println("Computer Wins");
            } else if (random == 1 && var == 3) {
                System.out.println(name + " Wins");
            } else if (random == 2 && var == 2) {
                System.out.println("Computer Wins");
            } else if (random == 2 && var == 1) {
                System.out.println(name + " Wins");
            }
            else{
                System.out.println("Computer Wins");
            }

            if(n<4){
                System.out.println("Make your Choice Again");
            }
            n++;
        }


    }
}
