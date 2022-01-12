package çekiliş;

import java.util.Random;

import java.util.Scanner;

public class Çekiliş {

    public static void main(String[] args) {

        Random sayi = new Random();

        Scanner input = new Scanner(System.in);

        System.out.println("YORUM SAYISINI GİRİNİZ:");
        int yorumsayısı = input.nextInt();
        
        System.out.println("ÇEKİLİŞİ BAŞLATMAK İÇİN ENTER TUŞUNA BASINIZ:");
        String start = input.nextLine();

        if (start.equals("")) {

            for (int i = 0; i < 1; i++) {
                System.out.println("1.Kazanan: ");
                int k1 = sayi.nextInt(yorumsayısı); // ÖRNEĞİN 1.KAZANAN DEĞERİ 9 İSE 9. YORUM SAHİBİ KAZANMIŞ OLACAK.
                
                  if (k1 == 0) {
                    continue;
                }
                System.out.println(k1);

                System.out.println("2.Kazanan: ");
                int k2 = sayi.nextInt(yorumsayısı);
                if (k1 == k2 || k2 == 0) {
                    continue;
                }
                System.out.println(k2);

                System.out.println("Yedek kazanan: ");
                int k3 = sayi.nextInt(yorumsayısı);
                if (k2 == k3 || k3 == 0) {
                    continue;
                }
                System.out.println(k3);

            }
        }
    }

}
