//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
        Bir classı nasıl çağırırız?
        Class'ın adını int gibi float gibi bir tür olarak düşün Yani classın adını yazar daha sonra bu türde bir değişken oluştururuz
        örneğin classın adı musteri ise bunu çağırmak için musteri m1; gibi bir obje olusturmamız lazım
         */
        CustomerManager c1= new CustomerManager(); // CustomerManager türünde ve c1 isminde bir nesne olusturmus olduk
        c1.Add(); // class içerisindeki metodları bu şekilde kullanıyoruz.
        c1.Remove();
        c1.Update();


    }
}