import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Bir dizide aranan sayı var mı bunu bulan metodu yaz
        Scanner scan = new Scanner(System.in); // input almak için
        System.out.print("Enter the number that you want to find: ");
        int num= scan.nextInt();
        sayiBulmaca(num);

    }
    public static void sayiBulmaca(int num){
        int[] numbers = new int[]{23,65,74,34,29,37,63,51};
        boolean isThere = false;
        for(int i=0;i<numbers.length;i++){
            if(num== numbers[i]){
                isThere=true;
                break;
            }
        }
        if(isThere) System.out.println("The number that you are looking for is in the array.");
        else System.out.println("The number that you are looking for is not in the array.");
    }
}