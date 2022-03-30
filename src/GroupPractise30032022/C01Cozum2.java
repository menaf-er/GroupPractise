package GroupPractise30032022;

import java.util.Scanner;

public class C01Cozum2 {
    public static void main(String[] args) {


    /* TASK :
       verilen bir sayinin Armstrong sayi olup olmadigini kontrol eden code create ediniz
       Armstrong sayi rakamlarinin kuplerinin toplamina esit olan sayidir
       153 = (1*1*1) + (5*5*5) + (3*3*3) gibi
       */

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir sayi giriniz");
        int sayi = scan.nextInt();


        int IlkDeger = sayi;
        int kuplerToplami=0;
        int rakam;

        while (sayi != 0) {

            rakam = sayi % 10;
            kuplerToplami += rakam * rakam * rakam;
            sayi = sayi / 10;


        }
        if (kuplerToplami>0) {
            System.out.println(kuplerToplami);

            }else{
            System.out.println("girdiğiniz sayi Armstrong sayi değildir");
        }
    }
}