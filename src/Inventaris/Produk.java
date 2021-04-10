package Inventaris;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Produk {
    Scanner a = new Scanner(System.in);
    int data;

    int[] nomor = new int[100];
    String[] nama = new String[100];
    int[] harga = new int[100];
    int[] stok = new int[100];
    int[] nilai = new int[100];

    public Produk() {

    }

    private void inputData() {
        try {
            for (int i = 0; i < data; i++) {
                System.out.println("Nomor Produk -" + (i + 1));
                System.out.print("Nama Produk, tekan 0 untuk cancel : ");

                a.nextLine();
                nomor[i] = i + 1;
                nama[i] = a.nextLine();

                if (nama[i].equals("0")) {
                    break;
                }

                System.out.print("Harga Produk\t : ");
                harga[i] = a.nextInt();
                System.out.print("Stok Produk\t : ");
                stok[i] = a.nextInt();
                nilai[i] = stok[i] * harga[i];
            }
        } catch (InputMismatchException e) {
            System.out.println("Input anda harus angka");
            a.nextLine();
            menu();
        }
    }

    public void menu() {
        do {
            System.out.print("input Nomer Produk\t : ");
            data = a.nextInt();

            if (data <= 0) {
                System.out.println("Input lebih dari 0");
            } else {
                inputData();
            }
        } while (data <= 0);
    }

    public void getDataValue() {
        for (int i = 0; i < data; i++) {
            System.out.println("item number\t : " + nomor[i]);
            System.out.println("product names\t : " + nama[i]);
            System.out.println("product price\t : " + harga[i]);
            System.out.println("product stock\t : " + stok[i]);
            System.out.println("product value\t : " + nilai[i]);
        }
    }

}