//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // For döngüsü
        for(int i=0;i<=10;i+=2){
            System.out.println(i);
        }
        // While döngüsü
        int i=10;
        while(i<20){
            System.out.println(i);
            i++;
        }
        // Do-while
        int j=20;
        System.out.println("20 den 40 a kadar olan tek sayılar:");
        do{
            if(j%2!=0){
               System.out.println(j);
            }
            j++;
        }
        while(j<=40);
    }
}