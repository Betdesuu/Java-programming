public class Product {
    // Bir ürünün neleri vardır özellikleri yani attributes.Bir class aynı zamanda attribute barındırır.örneğin bir ürünün neyi vardır id,tanım,fiyat,miktar gibi özellikleri
    int id;
    String name;
    String description;
    double price;
    int stockAmount;
    // Bazı yazılımcılar ürün ekle çıkar güncelle işlemlerini de product classımızın içinde yapar ama bu uygun değildir çünkü Solid adı verilen ilkelere ters düşer
    // The SOLID Principles are five principles of Object-Oriented class design. They are a set of rules and best practices to follow while designing a class structure.
    // S stands for single responsibility principle.Single Responsibility prensibindeki asıl amaç:
    // bir class veya function’a sadece ve sadece tek bir sorumluluğu yerine getirmesine dayanmaktadır.
    //Birden fazla sorumluluklar bir class veya function’a yüklendiğinde kod aşırı büyüyor ve karmaşık bir hale geliyor.
    // Karmaşık ve aşırı büyük bir kodun yönetimi zordur ve bu seviyede kırılganlığı (Fragility) ortaya çıkar. Aynı zamanda esnekliği (Extendability) bi okadar da azdır.

    // Bu product classında ürüne ait özellikler, productManager da ürünle ilgili operasyonlar olmalıdır.
}
