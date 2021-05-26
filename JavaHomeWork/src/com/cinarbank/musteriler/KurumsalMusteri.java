package com.cinarbank.musteriler;

import com.cinarbank.islemler.Paraİslemleri;

public class KurumsalMusteri extends Musteri implements Paraİslemleri {

    private String sirketAdi;

    public KurumsalMusteri() {

    }

    @Override
    public void gosterMusteriBilgileri() {
        super.gosterMusteriBilgileri();
        System.out.println("Sirket Adi : " + this.sirketAdi);
    }

    public KurumsalMusteri(String tcKimlikNo, String adSoyad, int hesapBakiyesi, String sirketAdi) {
        super(tcKimlikNo, adSoyad, hesapBakiyesi);
        this.sirketAdi = sirketAdi;
    }

    public String getSirketAdi() {
        return sirketAdi;
    }

    public void setSirketAdi(String sirketAdi) {
        this.sirketAdi = sirketAdi;
    }

    @Override
    public void paraCek(int cekilecekMiktar) {
        if (this.hesapBakiyesi > cekilecekMiktar && cekilecekMiktar > 0) {
            this.hesapBakiyesi -= cekilecekMiktar;
        } else {
            System.out.println("!!!!!HESABINIZDA YETERLİ BAKİYE BULUNMAMAKTADIR VEYA ÇEKMEK İSTEDİĞİNİZ MİKTAR SIFIRDAN BÜYÜK OLMALIDIR!!!!!");
        }
    }

    @Override
    public void paraYatir(int eklenecekMiktar) {
        if (eklenecekMiktar > 0) {
            this.hesapBakiyesi +=eklenecekMiktar;
        } else {
            System.out.println("!!!!!HESABA YATACAK MİKTAR SIFIRDAN BÜYÜK OLMALIDIR!!!!!");
        }
    }
}
