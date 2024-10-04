public class ProductManager {
    void Add(Product a){
        // Normalde buraya parametre olarak girdiğimiz product'ı JDBC  kodları kullanarak veri tabanına kaydediyor olacağız.
        System.out.println("Ürün başarıyla eklendi: " + a.name);
    }


}
