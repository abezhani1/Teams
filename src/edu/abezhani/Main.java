package edu.abezhani;

import java.util.Scanner;

public class Main
{

    private static Scanner keyboard;

    public static void main(String[] args)
    {
        keyboard = new Scanner(System.in);

        System.out.println("Please enter your favorite team: ");

        String theTeam = keyboard.nextLine().toLowerCase(); //if they type lowercase it's still valid
        Teams t;
        switch (theTeam.substring(0,3))
        {
            case "chi": t=Teams.CHICAGO;break;
            case "gre": t=Teams.GREEN_BAY;break;
            case "det": t=Teams.DETROIT;break;
            case "min": t=Teams.MINNESOTA;break;
            default: t=Teams.OTHER;break;
        }
        printOff(t);
    }

    public static void printOff(Teams team)
    {
        switch(team)
        {
            case CHICAGO:
                System.out.println("Da Bears!!!");break;
            case DETROIT:
                System.out.println("Music City Lions!");break;
            case GREEN_BAY:
                System.out.println("Title Town Packers!");break;
            case MINNESOTA:
                System.out.println("The other team indoors.");break;
            default:
                System.out.println("Dallas, New England? eagles? Get out!!");
        }
    }
}