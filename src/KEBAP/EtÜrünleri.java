package KEBAP;


import java.util.Arrays;
import java.util.List;

public class EtÜrünleri {

    public static void EtBölümü(){
        List<String> Kodu = Arrays.asList("01", "02", "03"  , "04", "05", "06");
        List<String> Adı = Arrays.asList("Adana Kebap" , "Urfa Kebap", "Can Spesiyal", "Et Döner", "Köfte", "Bonfile");
        List<Integer> Fiyat = Arrays.asList( 65, 65,120,100,100,120);

        System.out.println("Urun Kodu\tUrunler\t\t\tFiyat".toUpperCase());
        System.out.println("--------\t--------\t\t------");

        for (int i = 0; i <Kodu.size() ; i++) {
            System.out.println("\t"+Kodu.get(i)+"\t\t"+Adı.get(i)+"\t\t"+Fiyat.get(i));

        }
        Seçim.SeçimAlanı(Kodu, Adı,Fiyat);

}

}
