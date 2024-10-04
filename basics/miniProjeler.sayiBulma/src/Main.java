//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Elimizde bir sayılar dizisi olacak bir de aranan sayı bu aranan sayı sayı dizisinde var mı varsa kaçıncı eleman onu bulan bir algoritma yazdıralım.
        int[] numbers = {12, 87, 5, 49, 37, 53, 20};
        int find = 85;
        for (int i = 0; i < numbers.length; i++) {
            if (find == numbers[i]) {
                System.out.println(find + " is the " + (i + 1) + "th element of this array");
                break;
            }
        }
        // Aranan sayı dizide var mı kontrol etmek için hocanın kullandığı yöntem:
        boolean flag = false;
        for (int number : numbers) {
            if (find == number) {
                flag = true;
            }
        }
        if (flag) {
            System.out.println("This number is in the array");
        } else System.out.println("The number is not in the array");
    }
}