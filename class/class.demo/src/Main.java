import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // Bir hesap makinesi demosu yapalım
    public static void main(String[] args) {
        DortIslem islem = new DortIslem();
        Scanner scan = new Scanner(System.in);
        char islemIsareti;
        int num1, num2, result;
        System.out.println("Yapmak istediginiz islemi giriniz (+,-,x,/) Çıkış yapmak istiyorsanız 0'a basınız:");
        islemIsareti = scan.next().charAt(0);
        System.out.println("Birinci sayıyı giriniz:");
        num1 = scan.nextInt();
        System.out.println("İkinci sayıyı giriniz:");
        num2 = scan.nextInt();
        switch (islemIsareti) {
            case '+':
                result = islem.Topla(num1, num2);
                System.out.println(num1 + " + " + num2 + "= " + result);
                break;
            case '-':
                result = islem.Cikarma(num1, num2);
                System.out.println(num1 + " - " + num2 + "= " + result);
                break;
            case 'x':
                result = islem.Carpma(num1, num2);
                System.out.println(num1 + " x " + num2 + "= " + result);
                break;
            case '/':
                result = islem.Bolme(num1, num2);
                System.out.println(num1 + " / " + num2 + "= " + result);
                break;
            default:
                System.out.println("Geçersiz işlem talebi lütfen tekrar deneyiniz.");
        }
    }

}
