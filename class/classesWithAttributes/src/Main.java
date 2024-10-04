import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       Product p1 = new Product();
       p1.id= 2310;
       p1.name= "Bilgisayar";
       p1.description ="Hp Victus";
       p1.price = 40.000;
       p1.stockAmount = 3;

       ProductManager manager = new ProductManager();
       manager.Add(p1);
    }
}