package com.company;

import java.util.Scanner;

public class Rumus {

    Scanner scanner = new Scanner(System.in);
    int max = 0;
    int first = 1;
    int next = 1;
    public void fibonacci(){
        System.out.print("Jumlah Bilangan Fibonacci : ");
        max = scanner.nextInt();
        System.out.print("Hasil " + max +" Bilangan Fibonacci : ");

        for (int i = 1; i <= max; ++i)
        {
            System.out.print(first + " ");
            int hasil = first + next;
            first = next;
            next = hasil;
        }

    }

    public void modifiedFibonacci(){
        System.out.print("Jumlah Bilangan Fibonacci : ");
        max = scanner.nextInt();
        System.out.print("Hasil " + max +" Bilangan Fibonacci : ");
        int total = 0;
        for (int i = 1; i <= max; ++i)
        {
//            System.out.print(first + " ");
            total = total+first;
            int hasil = first + next;
            first = next;
            next = hasil;

        }
        System.out.println(total);
    }

    public void reserveFibonacci(){
        System.out.print("Jumlah Bilangan Fibonacci : ");
        max = scanner.nextInt();
        System.out.print("Hasil " + max +" Bilangan Fibonacci : ");
        int tot[] = new int[max];
        for (int i = 1; i <= max; ++i)
        {
//            System.out.print(first + " ");
            tot[i-1] = first;
            int hasil = first + next;
            first = next;
            next = hasil;
        }
        for (int i = tot.length-1; i >= 0 ; i--) {
            System.out.print(tot[i] + " ");
        }
    }

    public void ketupat(){

        System.out.print("Masukkan Angka : ");

        int n = scanner.nextInt();
        for(int x=n; x>=1; x--)
        {
            for(int y=x-1; y>=1; y--){
                System.out.print(" ");
            }
            for(int z=1; z<=((n+1)-x)*2; z++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=n; i>=1; i--)
        {
            for(int k=1; k<=n-i; k++){
                System.out.print(" ");
            }
            for(int j=i*2; j>=1; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void updateKetupat(){
        System.out.print("Masukkan Angka : ");

        int n = scanner.nextInt();
        for(int x=n; x>=1; x--)
        {
            for(int y=x-1; y>=1; y--){
                System.out.print("0");
            }
            for(int z=1; z<=((n+1)-x)*2; z++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=n; i>=1; i--)
        {
            for(int k=1; k<=n-i; k++){
                System.out.print("0");
            }
            for(int j=i*2; j>=1; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
