package com.cinarbank.islemler;

import com.cinarbank.musteriler.BireyselMusteri;
import com.cinarbank.musteriler.KurumsalMusteri;

import java.util.Scanner;

public class Atm {

    public static void main(String[] args) {

        short seciliIslem;
        int yatacakMiktar,cekilecekMiktar;
        Scanner scanner = new Scanner(System.in);
        IslemYap islemYap = new IslemYap();
        try {
            System.out.println("---------Hoşgeldiniz---------");
            System.out.println("Lütfen Müşteri Numaranızı Giriniz : ");
            String musteriNo = scanner.next();
            System.out.println("Sayın " + islemYap.getHesapBilgileri().get(musteriNo).getAdSoyad() + " Hesap bilgileriniz : ");
            if (islemYap.getHesapBilgileri().get(musteriNo) instanceof KurumsalMusteri) {
                ((KurumsalMusteri) islemYap.getHesapBilgileri().get(musteriNo)).gosterMusteriBilgileri();
                System.out.println("----------------------------------------");
                System.out.print("1)" + Islemler.PARAYATIRMA + "\n" + "2)" + Islemler.PARACEKME + "\n");
                System.out.println("Lütfen Yapmak İstediğiniz İşlemi Seçiniz : ");
                seciliIslem = scanner.nextShort();
                switch (seciliIslem) {
                    case 1:
                        System.out.println("Yatırılacak miktarı giriniz : ");
                        yatacakMiktar = scanner.nextInt();
                        ((KurumsalMusteri) islemYap.getHesapBilgileri().get(musteriNo)).paraYatir(yatacakMiktar);
                        System.out.println("----YAPILAN İSLEM SONRASI BAKİYE----");
                        System.out.println("Sayın " + ((KurumsalMusteri) islemYap.getHesapBilgileri().get(musteriNo)).getAdSoyad()
                            + " Toplam Hesap Bakiyeniz : " + islemYap.getHesapBilgileri().get(musteriNo).getHesapBakiyesi());
                        break;
                    case 2:
                        System.out.println("Cekilecek miktarı giriniz : ");
                        cekilecekMiktar= scanner.nextInt();
                        ((KurumsalMusteri) islemYap.getHesapBilgileri().get(musteriNo)).paraCek(cekilecekMiktar);
                        System.out.println("----YAPILAN İSLEM SONRASI BAKİYE----");
                        System.out.println("Sayın " + ((KurumsalMusteri) islemYap.getHesapBilgileri().get(musteriNo)).getAdSoyad()
                                + " Kalan Hesap Bakiyeniz : " + islemYap.getHesapBilgileri().get(musteriNo).getHesapBakiyesi());
                        break;
                    default:
                        System.out.println("!!!!!HATALI İŞLEM SEÇİMİ!!!!!");
                        break;
                }
            } else {
                ((BireyselMusteri) islemYap.getHesapBilgileri().get(musteriNo)).gosterMusteriBilgileri();
                System.out.println("----------------------------------------");
                System.out.print("1)" + Islemler.PARAYATIRMA + "\n" + "2)" + Islemler.PARACEKME + "\n");
                System.out.println("Lütfen Yapmak İstediğiniz İşlemi Seçiniz : ");
                seciliIslem = scanner.nextShort();
                switch (seciliIslem) {
                    case 1:
                        System.out.println("Yatırılacak miktarı giriniz : ");
                        yatacakMiktar = scanner.nextInt();
                        ((BireyselMusteri) islemYap.getHesapBilgileri().get(musteriNo)).paraYatir(yatacakMiktar);
                        System.out.println("----YAPILAN İSLEM SONRASI BAKİYE----");
                        System.out.println("Sayın " + ((BireyselMusteri) islemYap.getHesapBilgileri().get(musteriNo)).getAdSoyad()
                                + " Toplam Hesap Bakiyeniz : " + islemYap.getHesapBilgileri().get(musteriNo).getHesapBakiyesi());
                        break;
                    case 2:
                        System.out.println("Cekilecek miktarı giriniz : ");
                        cekilecekMiktar= scanner.nextInt();
                        ((BireyselMusteri) islemYap.getHesapBilgileri().get(musteriNo)).paraCek(cekilecekMiktar);
                        System.out.println("----YAPILAN İSLEM SONRASI BAKİYE----");
                        System.out.println("Sayın " + ((BireyselMusteri) islemYap.getHesapBilgileri().get(musteriNo)).getAdSoyad()
                                + " Kalan Hesap Bakiyeniz : " + islemYap.getHesapBilgileri().get(musteriNo).getHesapBakiyesi());
                        break;
                    default:
                        System.out.println("!!!!!HATALI İŞLEM SEÇİMİ!!!!!");
                        break;
                }
            }
        } catch (NullPointerException e) {
            System.out.println("!!!!!BÖYLE BİR MÜŞTERİ BULUNMAMAKTADIR!!!!!");
        } catch (Exception e) {
            System.out.println("!!!!!YANLIŞ BİR İŞLEM SEÇİLDİ!!!!!");
        }


    }

}
