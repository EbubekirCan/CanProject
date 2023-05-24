package KEBAP;

import java.util.Arrays;
import java.util.List;

public class Hamurİşleri {



    public static void Hamur(){
        List<String> Kodu = Arrays.asList("01", "02", "03"  , "04", "05");
        List<String> Adı = Arrays.asList("Tombik Ekmek", "Lahmacun", "Kaşarlı Pide"  , "Kıymalı Pide", "Kuşbaşılı pide");
        List<Integer> Fiyat = Arrays.asList( 5,20,70,100,120);

        System.out.println("Urun Kodu\tUrunler\t\t\tFiyat".toUpperCase());
        System.out.println("--------\t--------\t\t------");

        for (int i = 0; i <Kodu.size() ; i++) {
            System.out.println(Kodu.get(i)+"--" +Adı.get(i)+"--"+Fiyat.get(i));
        }

        Seçim.SeçimAlanı(Kodu,Adı,Fiyat);



    }
}
