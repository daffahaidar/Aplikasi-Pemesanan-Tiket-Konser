package com.concert.ticket;

public class Variables {
    // max per ticket
    final static int MAX_TICKET = 100;

    // jumlah ticket
    public static int goldTicket = 0;
    public static int diamondTicket = 0;

    // user gold
    static String[] gd_noKTP = new String[MAX_TICKET];
    static String[] gd_name = new String[MAX_TICKET];
    static String[] gd_phone = new String[MAX_TICKET];
    static String[] gd_category = new String[MAX_TICKET];
    static String[] gd_harga = new String[MAX_TICKET];

    // user diamond
    static String[] dm_noKTP = new String[MAX_TICKET];
    static String[] dm_name = new String[MAX_TICKET];
    static String[] dm_phone = new String[MAX_TICKET];
    static String[] dm_category = new String[MAX_TICKET];
    static String[] dm_harga = new String[MAX_TICKET];
}
