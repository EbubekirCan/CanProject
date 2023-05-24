package KEBAP;

import java.util.Arrays;
import java.util.List;

public class Mezeler {



    public static void MezelerBurada(){

        List<String> Kodu = Arrays.asList("01", "02", "03"  , "04", "05");
        List<String> Adı = Arrays.asList("Acılı Ezme" , "Haydari", "Yoğurt", "Tablacı Salatası", "İçli Köfte");
        List<Integer> Fiyat = Arrays.asList(20,20,15,15,25);
        System.out.println("Urun Kodu\tUrunler\t\t\tFiyat".toUpperCase());
        System.out.println("--------\t--------\t\t------");


        for (int i = 0; i < Kodu.size() ; i++) {

            System.out.println("\t"+Kodu.get(i)+"--"+Adı.get(i)+"--"+Fiyat.get(i));
        }
        Seçim.SeçimAlanı(Kodu,Adı,Fiyat);

    }
}
