import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Bu ders parametreli metodları anlayacağız
        // Mesela kullanıcıdan alınacak olan üç sayıyı topayıp geri döndüren metodu yazalım
        // kullanıcıdan alınan üç sayı arasından en büyüğü bulup geri döndüren metodu yazalım

        Scanner number1 = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = number1.nextInt();

        Scanner number2 = new Scanner(System.in);
        System.out.println("Enter the second number:");
        int num2 = number2.nextInt();

        Scanner number3 = new Scanner(System.in);
        System.out.println("Enter the third number:");
        int num3 = number3.nextInt();

        int sum = findSum(num1,num2,num3);
        System.out.println("Sum is:" + sum);

        int largest = findLargest(num1,num2,num3);
        System.out.println("Largest number is :" + largest);

    }
    public static int findSum(int a,int b, int c){
        return a+b+c;
    }
    public static int findLargest(int a, int b,int c){
        int max = a;
        if(b>a){
            max = b;
        }
        else if(c>a){
            max = c;
        }
        return max;
    }
}