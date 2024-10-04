//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // öğrenci notlarına göre başarılı ya da başarısız şeklinde bir switch case yapısı kuralım
        // Kodları düzensiz yazdıysan kod satırlarını düzeltmesi için ctrl+shift+alt+L kombinasyonu kullanılır
        char grade = 'K';

        switch (grade) {
            case 'A':
                System.out.println("Öğrenci üstün başarıyla geçmiştir");
                break;
            case 'B':
                System.out.println("Öğrenci başarıyla geçmiştir.");
                break;
            case 'C':
                System.out.println("Öğrenci ucu ucuna geçmiştir.");
                break;
            default:
                System.out.println("Geçersiz not girildi!");
        }

    }
}