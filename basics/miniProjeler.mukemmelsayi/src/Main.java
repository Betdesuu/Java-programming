//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Verilen sayının mükemmel sayı olup olmadığını bulunuz.Mükemmel sayı kendisi hariç bölenlerinin toplamı kendisine eşit olan sayıdır.
        int sum=0, num= 28;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        if(num==sum){
            System.out.println("This number is a great number.");
        }
        else
            System.out.println("This number is not a great number");
    }
}