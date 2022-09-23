import java.awt.*;

public class Main {
    public static void main(String[] args) {

/*

        System.out.println("Merhaba Java!");
        System.out.println("Merhaba Java!");


        //Variables
        int ogrenciSayi = 12;
        String message = "Öğrenci sayısı :";
        System.out.println(message + ogrenciSayi);
        System.out.println(message + ogrenciSayi);
        System.out.println("Öğrenci sayım :" + ogrenciSayi);
        System.out.println("Öğrenci sayım :" + ogrenciSayi);
        System.out.println("Öğrenci sayım :" + ogrenciSayi);

        //data types

        double sayi = 12.5;
        sayi = -129;

        char karakter = 'A';
        boolean dogruMu = false;

        //  conditionals
        int sayi1 = 20;
        if (sayi1 < 20) {
            System.out.println("Sayi 20 den küçüktür");
        } else if (sayi1 == 20) {
            System.out.println("Sayı 20 ye eşittir ");
        } else {
            System.out.println("Sayı 20 den büyüktür");
        }


        //recapDemo
        int sayi2 = 20;
        int sayi3 = 25;
        int sayi4 = 27;

        if (sayi2 > sayi3 && sayi2 > sayi4) {
            System.out.println("En büyük sayı :" + sayi2);
        } else if (sayi3 > sayi2 && sayi3 > sayi4) {
            System.out.println("En büyük sayı :" + sayi3);
        } else {
            System.out.println("En büyük sayı :" + sayi4);
        }

        //switchDemo
        char grade = 'g';
        switch (grade) {
            case 'A':
                System.out.println("Mükemmel: Geçtiniz");
                break;
            case 'B':
                System.out.println("Çok Güzel : Geçtiniz");
                break;
            case 'C':
                System.out.println("İyi : Geçtiniz");
                break;
            case 'D':
                System.out.println("Fena Değil : Geçtiniz");
                break;
            case 'F':
                System.out.println("Maalesef kaldınız");
                break;
            default:
                System.out.println("Geçersiz not girdiniz");

        }

        //loopDemo


        //1. For
        for (int i = 2; i <= 10; i += 2) {
            System.out.println(i);
        }
        System.out.println("For Döngüsü bitti");


        int i = 1;
        //2. While
        while (i < 10) {
            System.out.println(i);

            i += 2;
        }
        System.out.println("While Döngüsü bitti");


        //Do while
        int j = 100;
        do {
            System.out.println(j);
            j += 2;
        } while (j < 10);
        System.out.println("Do-While Döngüsü bitti");


        //arraysDemo
        String ogrenci1 = "Engin";
        String ogrenci2 = "Derin";
        String ogrenci3 = "Salih";
        String ogrenci4 = "Ahmet";


        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("---------------------");

        String[] ogrenciler = new String[4];
        ogrenciler[0] = "Engin";
        ogrenciler[1] = "Derin";
        ogrenciler[2] = "Salih";
        ogrenciler[3] = "Ahmet";
        //ogrenciler[4]="Ali";

        for (int x = 0; x < ogrenciler.length; x++) {
            System.out.println(ogrenciler[x]);
        }
        System.out.println("---------------------");

        for (String ogrenci : ogrenciler) {
            System.out.println(ogrenci);
        }

        //recapDemo2
        double[] mylist = {1.2, 6.3, 4.3, 5.6};
        double total = 0;
        double max = mylist[0];
        for (double number : mylist) {
            if (max < number) {
                max = number;
            }
            total = total + number;
            System.out.println(number);
        }
        System.out.println("Toplam =" + total);
        System.out.println("En Büyük =" + max);


        //multiDimensionalArrayDemo

        String[][] sehirler = new String[3][3];
        sehirler[0][0] = "İstanbul";
        sehirler[0][1] = "Bursa";
        sehirler[0][2] = "Bilecik";
        sehirler[1][0] = "Ankara";
        sehirler[1][1] = "Konya";
        sehirler[1][2] = "Kayseri";
        sehirler[2][0] = "Diyarbakır";
        sehirler[2][1] = "Şanlıurfa";
        sehirler[2][2] = "Gaziantep";

        for (int a = 0; a <= 2; a++) {
            System.out.println("--------------");
            for (int b = 0; b <= 2; b++) {
                System.out.println(sehirler[a][b]);

            }
        }

        //stringsDemo
        String mesaj = "Bugün hava çok güzel.";
        System.out.println(mesaj);
*/

        /*System.out.println("Eleman Sayısı:" + mesaj.length());
        System.out.println("5. eleman :" + mesaj.charAt(4));
        System.out.println(mesaj.concat(" Yaşasın!"));
        System.out.println(mesaj);
        System.out.println(mesaj.startsWith("B"));
        System.out.println(mesaj.endsWith("."));
        char [] karakterler=new char[5];
        mesaj.getChars(0,5,karakterler,0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("av"));
        System.out.println(mesaj.lastIndexOf('a'));*/

       /* String yeniMesaj = mesaj.replace(' ', '-');
        System.out.println(yeniMesaj);

        System.out.println(mesaj.substring(2, 5));

        for (String kelime : mesaj.split(" ")) {
            System.out.println(kelime);
        }

        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
        System.out.println(mesaj.trim());
*/
        //miniProjeAsalsayi
        int number1 = -1;
        int remainder = number1 % 2;
        System.out.println(remainder);
        boolean isPrime = true;
        if (number1 == 1) {
            System.out.println("Sayı asal değildir");
            return;
        }
        if (number1 < 2) {
            System.out.println("Geçersiz sayı");
        }
        for (int i = 2; i < number1; i++) {
            if (number1 % 2 == 0) {
                isPrime = false;
            }

        }
        if (isPrime) {
            System.out.println("Sayı asaldır");
        } else {
            System.out.println("Sayı asal değildir");
        }


        //sesliHarfler
        char harf = 'A';

        switch (harf) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalın sesli harf");
                break;
            default:
                System.out.println("İnce sesli harf");


                System.out.println("");
        }

        //mükemmelSayı
        int number = 28;
        int total = 0;
        for (int j = 1; j < number; j++) {
            if (number % j == 0)
                total = total + j;
        }
        if (total == number) {
            System.out.println("Sayı mükemmel sayıdır");
        } else {
            System.out.println("Sayı mükemmel sayı değilfir");
        }

        //arkadaşSayılar
        int sayi1 = 220;
        int sayi2 = 284;
        int toplam1 = 0;
        int toplam2 = 0;

        for (int i = 1; i < sayi1; i++) {
            if (sayi1 % i == 0) {
                toplam1 = toplam1 + i;
            }
        }
        for (int i = 1; i < sayi2; i++) {
            if (sayi2 % i == 0) {
                toplam2 = toplam2 + i;
            }
        }
        if (sayi1 == toplam2 && sayi2 == toplam1) {
            System.out.println("Bu iki sayı arkadaştır.");
        } else {
            System.out.println("Bu iki sayı arkadaş değildri.");
        }

        //sayıBulma
        int[] sayılar = new int[]{1, 2, 3, 7, 9,0};
        int aranacak = 5;
        boolean isExist=false;
        for (int i = 0; i < sayılar.length; i++) {
            if (aranacak==sayılar[i]){
                isExist=true;
            }
        }
        if (isExist){
            System.out.println("Sayı bulunuyor");
        }
        else {
            System.out.println("Sayı bulunmuyor");
        }
    }
}
