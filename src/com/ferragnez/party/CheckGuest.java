package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] guestList = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti",
                "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
        System.out.println("Inserisci il tuo nome ");
        String userName = scan.nextLine();


        boolean match = false;
        /*
        for (int i = 0; i < guestList.length; i++) {
            if (userName.equals(guestList[i])) {
                match = true;
                break;
            }
        } */

        int i = 0;
        while(i < guestList.length){
            if (userName.equals(guestList[i])) {
                match = true;
                break;
            }
            i++;

        }

        if (match) {
            System.out.println("Puoi entrare!");
        } else {
            System.out.println("Non puoi entrare!");
        }

        scan.close();
    }
}



