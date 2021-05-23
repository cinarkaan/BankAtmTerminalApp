package com.cinarbank.musteriler;

public class Musteri {

    protected String tcKimlikNo;
    protected String adSoyad;
    protected int hesapBakiyesi;

    public Musteri() {

    }

    public Musteri(String tcKimlikNo, String adSoyad, int hesapBakiyesi) {
        this.tcKimlikNo = tcKimlikNo;
        this.adSoyad = adSoyad;
        this.hesapBakiyesi = hesapBakiyesi;
    }

    public void gosterMusteriBilgileri () {
        System.out.println("Tc Kimlik No : " + this.tcKimlikNo);
        System.out.println("Ad Soyad : " + this.adSoyad);
        System.out.println("Hesap Bakiyesi : " + this.hesapBakiyesi);
    }

    public String getTcKimlikNo() {
        return tcKimlikNo;
    }

    public void setTcKimlikNo(String tcKimlikNo) {
        this.tcKimlikNo = tcKimlikNo;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public int getHesapBakiyesi() {
        return hesapBakiyesi;
    }

    public void setHesapBakiyesi(int hesapBakiyesi) {
        this.hesapBakiyesi = hesapBakiyesi;
    }
}
