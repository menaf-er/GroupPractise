package GroupPractise30032022;

import java.util.Scanner;

public class C02Cozum2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir kelime giriniz");
        String str = scan.nextLine();

        int index = 0;
        do {
            if (index % 2 != 0) {
                System.out.print(str.charAt(index) + " " );
            }
            index++;

        } while (str.length() > index);
    }
}
