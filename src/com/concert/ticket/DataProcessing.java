package com.concert.ticket;

import java.util.Scanner;

public class DataProcessing {

    Scanner sc = new Scanner(System.in);
    Scanner inputTicket = new Scanner(System.in);
    Scanner inputdata = new Scanner(System.in);

    // Constructor
    DataProcessing() {
        if (Variables.goldTicket == Variables.MAX_TICKET || Variables.diamondTicket == Variables.MAX_TICKET) {
            System.out.println("Tiket sudah penuh.");
            Console.pause();
            return;
        }

        inputData();
    }

    // Input Data
    public void inputData() {
        Console.clearScreen();
        System.out.println("Pilih Kategori");
        System.out.println("1. Gold");
        System.out.println("2. Diamond");
        System.out.print("Pilihan: ");

        int choices = inputTicket.nextInt();
        switch (choices) {
            case 1:
                Console.clearScreen();
                System.out.print("Masukan banyak tiket gold yang ingin dipesan: ");
                int goldTicket = inputdata.nextInt();

                if (goldTicket > Variables.MAX_TICKET) {
                    System.out.println("Tiket melebihi batas maksimal.");
                    Console.pause();
                    return;
                }

                for (int i = 1; i <= goldTicket; i++) {
                    Console.clearScreen();
                    System.out.println("Masukan tiket gold ke " + i);
                    System.out.print("No KTP: ");
                    Variables.gd_noKTP[Variables.goldTicket] = sc.nextLine();
                    System.out.print("Nama: ");
                    Variables.gd_name[Variables.goldTicket] = sc.nextLine();
                    System.out.print("No Telp: ");
                    Variables.gd_phone[Variables.goldTicket] = sc.nextLine();
                    Variables.gd_category[Variables.goldTicket] = "Gold";
                    Variables.gd_harga[Variables.goldTicket] = "2500000";
                    Variables.goldTicket++;
                }

                System.out.println("\nGold tiket berhasil ditambahkan.");
                Console.pause();
                break;
            case 2:
                Console.clearScreen();
                System.out.print("Masukan banyak tiket gold yang ingin dipesan: ");
                int dmTicket = inputdata.nextInt();
                if (dmTicket > Variables.MAX_TICKET) {
                    System.out.println("Tiket melebihi batas maksimal.");
                    Console.pause();
                    return;
                }
                for (int i = 1; i <= dmTicket; i++) {
                    Console.clearScreen();
                    System.out.println("Masukan tiket diamond ke " + i);
                    System.out.print("No KTP: ");
                    Variables.dm_noKTP[Variables.diamondTicket] = sc.nextLine();
                    System.out.print("Nama: ");
                    Variables.dm_name[Variables.diamondTicket] = sc.nextLine();
                    System.out.print("No Telp: ");
                    Variables.dm_phone[Variables.diamondTicket] = sc.nextLine();

                    Variables.dm_category[Variables.diamondTicket] = "Diamond";
                    Variables.dm_harga[Variables.diamondTicket] = "3000000";
                    Variables.diamondTicket++;
                }

                System.out.println("\nDiamond tiket berhasil ditambahkan.");
                Console.pause();
                break;

            default:
                break;
        }

    }

    // Show Data
    public static void showData() {
        Console.clearScreen();

        // Show Gold Ticket
        System.out.println("Gold Ticket: ");
        Decoration.Garis();
        System.out.printf("|No |%10s|%10s|%10s|%10s|%10s\n", "No KTP", "Name", "Phone", "Category", "Harga");
        Decoration.Garis();

        // jika data kosong
        if (Variables.goldTicket == 0) {
            System.out.println("Tiket Gold kosong");
        }

        // jika data tidak kosong tampilkan semua yang ada dalam array list
        for (int i = 0; i < Variables.goldTicket; i++) {
            System.out.printf("|%3d|%10s|%10s|%10s|%10s|%10s\n", i + 1, Variables.gd_noKTP[i], Variables.gd_name[i],
                    Variables.gd_phone[i], Variables.gd_category[i], Variables.gd_harga[i]);
            Decoration.Garis();
        }

        // tampilkan data penjualan
        int hargagold = Variables.goldTicket * 2500000;
        System.out.println("Jumlah ticket gold yang terjual: " + Variables.goldTicket + ", Sebesar Rp. " + hargagold);

        // show diamond ticket
        System.out.println("\nDiamond Ticket: ");
        Decoration.Garis();
        System.out.printf("|No |%10s|%10s|%10s|%10s|%10s\n", "No KTP", "Name", "Phone", "Category", "Harga");
        Decoration.Garis();

        // jika data kosong
        if (Variables.diamondTicket == 0) {
            System.out.println("Tiket Diamond kosong");
        }

        // jika data tidak kosong tampilkan semua yang ada dalam array list
        for (int i = 0; i < Variables.diamondTicket; i++) {
            System.out.printf("|%3d|%10s|%10s|%10s|%10s|%10s\n", i + 1, Variables.dm_noKTP[i], Variables.dm_name[i],
                    Variables.dm_phone[i], Variables.dm_category[i], Variables.dm_harga[i]);
            Decoration.Garis();
        }

        // tampilkan data penjualan
        int hargadm = Variables.diamondTicket * 3000000;
        System.out
                .println("Jumlah ticket diamond yang terjual: " + Variables.diamondTicket + ", Sebesar Rp. " + hargadm);

        // tampilkan total penjualan
        int length = Variables.goldTicket + Variables.diamondTicket;
        System.out.println();
        Decoration.Garis();
        int totalPenjualan = hargagold + hargadm;
        System.out.println("Total penjualan: " + length + " tiket" + ", Sebesar Rp. " + totalPenjualan);
        Decoration.Garis();

        Console.pause();

    }
}
