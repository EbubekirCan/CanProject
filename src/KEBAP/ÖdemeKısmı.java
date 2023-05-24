package KEBAP;

public class ÖdemeKısmı {public static void slowPrint(String text, int delay) {
    for (char c : text.toCharArray()) {
        System.out.print(c);
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

    public static void ÖdemeAlanı(){

        slowPrint("----Ödeme Kısmına Hoşgeldiniz----",30);
        System.out.println("----FİŞİNİZ----");
        System.out.println("Urun Kodu\tUrunler\t\t\tFiyat".toUpperCase());
        System.out.println("--------\t--------\t\t------");

        for (int i = 0; i <ToplamTutar.Kodlar.size(); i++) {
            System.out.println("\t"+"Ürün Adı "+ToplamTutar.Kodlar.get(i)+"\t\t"+" Ürün Adedi "+ ToplamTutar.Adet.get(i)+"\t\t"+
                    "Toplam Tutar"+ToplamTutar.ToplamTutar.get(i));

        }
        System.out.println();
            int toplam=0;
       slowPrint("----TOPLAM TUTARINIZ----",30);
        for (int i = 0; i < ToplamTutar.ToplamTutar.size(); i++) {
            toplam+=ToplamTutar.ToplamTutar.get(i);
        }
        System.out.println();
        System.out.println("BORCUNUZ  "+toplam+" Tl'dir Efendim");

        if (toplam>=500){
            toplam*=0.9;
            System.out.println("500 TL VE ÜZERİ ALIŞVERİŞ YAPTIĞINI İÇİN ");
            System.out.println("BİZDEN İNDİRİM KAZANDINIZ YENİ TUTAR = "+toplam+" TL'DİR EFENDİM");
        }


    }

}
