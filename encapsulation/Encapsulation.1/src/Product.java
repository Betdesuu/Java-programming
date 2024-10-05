public class Product {
    // Bu bir public class olduğu için her yerden erişilebilir.Mesela bu Product'a başka classlardan erişebiliriz.
    // Bu public classın içindeki aşağıdaki özellikler de public olur.
    // Eğer private tanımlarsak sadece tanımlandığı blok içersinde geçerli olur öğneğin aşağıdaki id ve name i private tanımlarsak
    // product bloğu içerisinde tanımladığımız için bu blok içerisinde istediğimiz gibi erişip kullanabiliriz
    // fakat başka classlar içerisinden erişemeyiz.
    // Eğer bu id ve name i Product classının bloğu içinde değil de bir if bloğu içerisinde tanımlamış olsaydık o zaman sadece o if bloğu içerisinden erişilebilir olurdu.
    private int id;
    private String name;
    String description;
    double price;
    int stockAmount;

    void display(){
        System.out.println(id);
        System.out.println(name);
        // görüldüğü üzere burada hiçbir problem çıkmadı şimdi bir de main class içerisinden çağırmayı deneyelim
    }
}
