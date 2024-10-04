//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Sayı asal mı onu bulan bir program yaz
        int sayi = 3;
        boolean isPrime = true;
        if (sayi==0 || sayi==1){
            System.out.println(("Sayı asal değildir."));
        }
        else if(sayi<0){
            System.out.println("Negatif sayi girdiniz! Lütfen bir doğal sayı giriniz.");
        }
        else {
            for (int i = 2; i < sayi; i++) {
                if(sayi%i==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime == false){
                System.out.println("Sayi asal değildir");
            }
            else System.out.println("Sayi asaldır.");
        }
        /*
        if(isPrime){ // if(isPrime==true) yazmak yerine bu şekilde yazabiliriz parantzin içine eşittir bir şey yazmazsak bu eşittir true anlamına gelir.
            System.out.println("Sayı asaldır");
        }
        else
            System.out.println(("Sayı asal değildir."));

         */


    }
}