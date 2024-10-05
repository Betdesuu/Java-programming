//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.price=15;
        product.stockAmount= 5;
        product.description ="koltuk";
        // Public olarak tanımlanmış değişkenleri çağırmada bir problem yaşamıyoruz.Şimdi bir de private tanımladığımız id ve name değişkenlerini çağıralım:
        product.id=2310;
        product.name = "Koltuk takımı";
        // Görüldüğü üzere id ve name i çağırmada problem yaşıyoruz.İmleci üstüne getirirsek bu değişkenlerin Product adlı class da private access e sahip olduğunu söylüyor.



    }
}