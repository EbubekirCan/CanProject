package KEBAP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class İçecekler {


    public static void Drinking(){
        List<String>kodu= Arrays.asList("01", "02", "03"  , "04", "05");
        List<String>Adı=Arrays.asList("Ayran","Cola","Şalgam","Fanta","Sprite");
        List<Integer>Fiyat=Arrays.asList(8,15,8,15,15);

        System.out.println("Urun Kodu\tUrunler\t\t\tFiyat".toUpperCase());
        System.out.println("--------\t--------\t\t------");

        for (int i = 0; i <kodu.size() ; i++) {
            System.out.println(kodu.get(i)+"--"+Adı.get(i)+"--"+Fiyat.get(i));
        }
        Seçim.SeçimAlanı(kodu,Adı,Fiyat);
    }
}
