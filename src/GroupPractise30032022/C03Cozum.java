package GroupPractise30032022;

import java.util.Scanner;

public class C03Cozum {
    /*   Kullanicidan 2 sayi alaliniz.
        1. sayi taban
        2. sayi Ust
        1 sayinin ussunu hesaplatan code create ediniz.
         3, 3  sonuc = 27
        2  3 = 2*2*2=8
       */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen 1. sayiyi giriniz");
        int sayi1 = scan.nextInt(); // taban sayisi
        System.out.println("Lütfen 2.sayiyi giriniz");
        int sayi2 = scan.nextInt(); // us sayisi

        int sonuc=1;


        for (int i =0; i < sayi2; i++) {
            sonuc = sonuc * sayi1;

        }
        System.out.println(sonuc);
    }
}