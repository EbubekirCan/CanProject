package KEBAP;

import java.util.List;
import java.util.Scanner;

public class Seçim {


    public static void SeçimAlanı(List<String> kodu, List<String> adı, List<Integer> fiyat) {
        Scanner input =new Scanner(System.in);
        String ürünKodu="";
        int porsiyon=0;
        int toplamTutar=0;
        char devam;
        boolean hata=false;



        do {
            System.out.println("Seçmek istediğiniz Ürünün Kodunu Giriniz");
            ürünKodu=input.next();
            if (!kodu.contains(ürünKodu)){
                System.out.println("tekrar seçiniz");
                hata=true;
                continue;
            }

            for (int i = 0; i <kodu.size() ; i++) {
                if (ürünKodu.equals(kodu.get(i))){
                    System.out.println("Seçilen ürün  "+adı.get(i));
                    break;
                }
            }
            System.out.println("Kaç adet istiyorsunuz");
            porsiyon=input.nextInt();
            for (int i = 0; i < fiyat.size() ; i++) {
                if (ürünKodu.equals(kodu.get(i))){

                    toplamTutar=porsiyon* fiyat.get(i);
                    break;
                    }
            }
            System.out.println("İşlem başarılı");
            ToplamTutar.Kodlar.add(adı.get(kodu.indexOf(ürünKodu)));
            ToplamTutar.Adet.add(porsiyon);
            ToplamTutar.ToplamTutar.add(toplamTutar);

            System.out.println("Seçilen ürün Kodu="+  (adı.get(kodu.indexOf(ürünKodu)))+ " Adet Sayısı "+porsiyon+ " Tutar = " +toplamTutar );

            System.out.println("Devam Etmek için D"+'\n'+"Çıkmak için Ç "+'\n'+"Giriniz.."+'\n'+"" +
                    "Ödeme için her hangi bi harf giriniz");

            devam=input.next().toUpperCase().charAt(0);
            if (devam=='D'){
                hata=true;
            } else if (devam=='Ç') {
            Menü.MenüStart();
            break;
            }else {
                System.out.println("Ödeme Kısmına yönlendiriliyorsunuz");
                ÖdemeKısmı.ÖdemeAlanı();


            }



        }while (hata);










    }
}
