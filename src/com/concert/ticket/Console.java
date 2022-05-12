package com.concert.ticket;

import java.util.Scanner;

public class Console {

    static Scanner pause = new Scanner(System.in);

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void pause() {
        System.out.println("\nPress Enter to continue...");
        pause.nextLine();
    }
}
