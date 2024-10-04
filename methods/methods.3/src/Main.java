//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Toplam hesaplayan bir method yazalım ama bu methoda parametre olarak ne kadar sayı gönderileceğini bilmiyoruz ya da çok fazla gönderilecek o zaman ne yaparız:
        System.out.println("Sayiların toplamı:" + sum(6,7,5,3,10,8,78));


    }
    public static int sum(int... numbers){
        int toplam=0;
        for(int sayi:numbers){
            toplam+= sayi;
        }
        return toplam;
    }
}