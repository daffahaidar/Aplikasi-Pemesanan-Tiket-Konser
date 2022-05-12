package com.concert.ticket;

import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);

    public void showMenu() {
        int pilihan = 0;

        do {
            Console.clearScreen();
            // menu
            System.out.print("1. Add Penjualan\n2. Data Penjualan\n3. Exit\nYour choice: ");
            try {
                pilihan = sc.nextInt();
                if (pilihan < 1 || pilihan > 4) {
                    throw new Exception();
                }
                Proses(pilihan);
            } catch (Exception ex) {
                System.out.println("Mohon masukan 1-3.");
                Console.pause();
            }
        } while (pilihan != 3);
    }

    public void Proses(int pilihan) {
        switch (pilihan) {
            case 1:

                // Input Data
                new DataProcessing();

                break;
            case 2:

                // Show Data
                DataProcessing.showData();

                break;
        }
    }
}
