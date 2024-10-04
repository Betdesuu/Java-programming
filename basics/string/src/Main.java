//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // ctrl+alt+shift+L ile satırları düzenleyebilirsin.
        String mesaj = "İki hafta sonra ankaraya gitsem mi gitmesem mi?";

        // Eğer bir stringin uzunluğunu bulamk istiyorsak:
        System.out.println("Eleman sayısı: " + mesaj.length());

        // Eğer stringdeki belirli bir elemanı bulmak istiyorsan mesela beşinci elemanı bulalım
        System.out.println("5.eleman:" + mesaj.charAt(4));

        // Eğer iki metni birleştirmek istiyorsak:
        System.out.println(mesaj.concat(" Gideyim bari."));
        // yazıları birleştirdi ama mesajı değiştirmedi.Yani
        System.out.println("Mesaj:" + mesaj);
        // eğer mesajın yani halinin iki metnin birleştirilmiş hali olmasını istiyorsak:
        String mesaj2 = mesaj.concat(("Gideyim baree."));
        System.out.println("Yeni masaj:" + mesaj2);


        // Stringin belli bir harfle başleyıp başlamadığını kontrol etmek istiyorsan
        System.out.println(mesaj.startsWith("A")); // tip olarak boolean bir değer döndürür
        // mesela yukarıdaki işlemin sonucunun false dönmesi lazım
        // çünkü mesaj adlı stringimiz A harfi ile başlamıyor.
        System.out.println(mesaj.startsWith("İ"));
        // Bunun sonucu true döner ama eğer büyük İ yerine küçük İ yapsaydık o zaman false dönerdi.

        //Stringin ne ile bittiğini kontrol etmek istiyorsak
        System.out.println(mesaj.endsWith("?"));
        // mesela burada stringimiz soru işaretiyle bittiği için true dönmesi lazım

        // Bir stringin ilk n karakterini ekrana yazdırmak istiyorsam önce o kadar karakterlik bir char dizisi oluşturmam gerekiyor
        char[] karakter = new char[5];
        mesaj.getChars(0,5,karakter,0);
        System.out.println(karakter);



    }
}