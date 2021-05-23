package com.cinarbank.islemler;

import com.cinarbank.musteriler.BireyselMusteri;
import com.cinarbank.musteriler.KurumsalMusteri;
import com.cinarbank.musteriler.Musteri;

import java.util.HashMap;

public class IslemYap {


    private HashMap<String, Musteri> hesapBilgileri = new HashMap<String, Musteri>();

    public IslemYap () {
        hesapBilgileri.put("11111",new BireyselMusteri("28844412309","Abuzer Abuzer", 500,"Lale Sokak No : 23"));
        hesapBilgileri.put("24444",new BireyselMusteri("22347832167","Mahmut tuncer",1500,"Çiçek Sokak No : 21"));
        hesapBilgileri.put("34442",new KurumsalMusteri("28892156710","Abbas Yolcu",80000,"YolcularTurizm"));
        hesapBilgileri.put("53443",new BireyselMusteri("24489100042","Demet Akalın",20000,"Çıkmaz Sokak No : 1"));
        hesapBilgileri.put("66622",new KurumsalMusteri("25589941256","Acun Ilıcalı",500000,"AcunMedya"));
    }

    public HashMap<String, Musteri> getHesapBilgileri() {
        return hesapBilgileri;
    }

    public void setHesapBilgileri(HashMap<String, Musteri> hesapBilgileri) {
        this.hesapBilgileri = hesapBilgileri;
    }

}
