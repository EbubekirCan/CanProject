package KEBAP;

import java.util.Arrays;
import java.util.List;

public class TavukÜrünleri {


    public static void chicken(){

        List<String> Kodu = Arrays.asList("01", "02", "03"  , "04");
        List<String> Adı = Arrays.asList("Tavuk Şiş" , "Tavuk Kanat", "Tavuk Bonfile", "Tavuk Döner");
        List<Integer> Fiyat = Arrays.asList(70,75,65,55);


        System.out.println("Urun Kodu\tUrunler\t\t\tFiyat".toUpperCase());
        System.out.println("--------\t--------\t\t------");
        for (int i = 0; i <Kodu.size() ; i++) {
            System.out.println("\t"+Kodu+"--"+Adı+"--"+Fiyat);
        }
        Seçim.SeçimAlanı(Kodu,Adı,Fiyat);
    }
}
