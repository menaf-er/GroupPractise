package GroupPractise30032022;

import java.util.Scanner;

public class C01Cozum {
    /* TASK :
       verilen bir sayinin Armstrong sayi olup olmadigini kontrol eden code create ediniz
       Armstrong sayi rakamlarinin kuplerinin toplamina esit olan sayidir
       153 = (1*1*1) + (5*5*5) + (3*3*3) gibi
       */
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Armstrong oldugunu kontrol edeceginiz tamsayiyi yaziniz");
        int sayi = scan.nextInt();

        //12345
        // once gerekli degiskenleri olusturalim
        int kuplerToplami = 0;
        int ilkDeger = sayi;
        int rakam = 0;

        while (sayi != 0) {
            rakam = sayi % 10; // sayinin son rakamını verir.
            kuplerToplami += rakam * rakam * rakam;
            sayi = sayi/10;

        }
        if(kuplerToplami == ilkDeger) {
            System.out.println("Girdiginiz sayi Armstrong sayi");
        } else System.out.println("Girdiginiz sayi Armstrong sayi degil");
    }
}

