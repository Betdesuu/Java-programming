//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // java case sensetive bir dil yani büyük küçük harf kullanımına hassas
        // int veri tipi
        int ogrenciSayisi = 23,i;
        System.out.println("Ogrenci Sayisi:" + ogrenciSayisi);
        ogrenciSayisi += 3;
        System.out.println("Guncel ogrenci sayisi:" + ogrenciSayisi);

        // String veri tipi S yi büyük yazman lazım yoksa kabul etmiyor
        String mesaj = "Ogrenci Sayisi:";

        for(i=0;i<3;i++){
            if(ogrenciSayisi%2==0){
                ogrenciSayisi--;
                System.out.println(mesaj + ogrenciSayisi );
            }
            else {
                ogrenciSayisi += 10;
                System.out.println(mesaj + ogrenciSayisi );
            }
        }

    }
}