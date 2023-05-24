package KEBAP;

import java.util.Scanner;

public class Menü {
    public static void slowPrint(String text, int delay) {
        for (char c : text.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }



        public static void MenüStart(){

        slowPrint("----------CAN KEBAP SALONUNA HOŞ GELDİNİZ----------\n\n",30);
            System.out.println("ET ÜRÜNLERİ İÇİN 1"+'\n'+"HAMUR İŞLERİ İÇİN 2"+'\n'+"İÇECEKLER İÇİN 3"+'\n'+
                    "MEZELER İÇİN 4"+'\n'+"TAVUK ÜRÜNLERİ İÇİN 5'İ"
                    +'\n'+"ÖDEME İÇİN 6'Yİ"+'\n'+"ÇIKMAK İÇİN 7'Yİ KODLAYINIZ");
            AsılSeçim();
        }
        public static void AsılSeçim(){

        Scanner inp=new Scanner(System.in);
        int seçim=inp.nextInt();

        switch (seçim){

            case 1:
                EtÜrünleri.EtBölümü();
                break;
            case 2:
                Hamurİşleri.Hamur();
                break;
            case 3:
                İçecekler.Drinking();
                break;
            case 4:
                Mezeler.MezelerBurada();
                break;
            case 5:
                TavukÜrünleri.chicken();
                break;
            case 6:
                ÖdemeKısmı.ÖdemeAlanı();
                break;
            case 7:
                slowPrint("GÖRÜŞMEK ÜZERE TEKRAR BEKLERİZ...",30);
                break;
            default:
                System.out.println("YANLIŞ SEÇİM");
                MenüStart();
        }



        }


}
