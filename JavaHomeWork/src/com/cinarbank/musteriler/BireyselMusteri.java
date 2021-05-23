package com.cinarbank.musteriler;

import com.cinarbank.islemler.ParaCekmeIslemleri;

public class BireyselMusteri extends Musteri implements ParaCekmeIslemleri {

    private String evAdresi;

    public BireyselMusteri() {

    }

    @Override
    public void gosterMusteriBilgileri() {
        super.gosterMusteriBilgileri();
        System.out.println("Ev Adresi : " + this.evAdresi);
    }

    public BireyselMusteri(String tcKimlikNo, String adSoyad, int hesapBakiyesi, String evAdresi) {
        super(tcKimlikNo, adSoyad, hesapBakiyesi);
        this.evAdresi = evAdresi;
    }

    public String getEvAdresi() {
        return evAdresi;
    }

    public void setEvAdresi(String evAdresi) {
        this.evAdresi = evAdresi;
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
