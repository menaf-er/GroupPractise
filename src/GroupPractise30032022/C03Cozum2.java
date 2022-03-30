package GroupPractise30032022;

import java.util.Scanner;

public class C03Cozum2 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen taban ve uss giriniz");

        int taban = scan.nextInt();
        int uss = scan.nextInt();
        long sonuc = 1;

        while (uss != 0) {
            sonuc *= taban;


            uss--;
        }

        System.out.println("Cevap: " + sonuc);

        scan.close();
    }


}


