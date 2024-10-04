//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*Scanner harf = new Scanner(System.in);
        char letter;
        System.out.println("Enter a letter:");
        letter = harf.next().charAt(0);
        if(letter == a || letter ==ı || letter ==o ||  letter ==u){

        }
        Yukarıda kullanıcıdan aldığım bir ünlü harfin kalın ünlü mü yoksa ince ünlü mü olduğunu kontrol etmeye çalıştım ama yapamadım.
         */
        char vowel= 'O';
        if(vowel == 'A' || vowel == 'a' || vowel == 'O' || vowel == 'o' || vowel == 'I' || vowel == 'ı' || vowel == 'U' || vowel == 'u'){
            System.out.println("Girilen harf kalın ünlüdür.");
        }
        else if(vowel == 'E' || vowel == 'e' || vowel == 'Ö' || vowel == 'ö' || vowel == 'İ' || vowel == 'i' || vowel == 'Ü' || vowel == 'ü'){
            System.out.println("Girilen harf ince ünlüdür.");
        }
        else System.out.println("Ünlü bir harf girilmedi! Tekrar deneyiniz");

        // Yukarıdaki çözüm benim.Aşağıdaki çözüm de hocanın çözümü:

        switch(vowel){
            case 'A':
            case 'a':
            case'O':
            case'o':
            case'U':
            case'u':
            case'I':
            case'ı':
                System.out.println("Girilen harf kalın ünlüdür.");
                break;
            case'E':
            case'e':
            case'İ':
            case'i':
            case'Ü':
            case'ü':
            case'Ö':
            case'ö':
                System.out.println("Girilen harf ince ünlüdür");
                break;
            default:
                System.out.println("Girilen harf ünlü değildir! Lütfen tekrar giriniz.");
        }

    }
}