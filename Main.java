package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Dizinin kaç elemanlı olmasını istersiniz?");
        int diziBoyutu=input.nextInt();

        int dizi[] = new int[diziBoyutu];

        for (int i =0;i <diziBoyutu;i++) {
            System.out.println("Dizinin " + (i+1) + ". elemanını giriniz:");
            dizi[i] = input.nextInt();
        }

        Arrays.sort(dizi);

        System.out.println(Arrays.toString(dizi));


    }
}

