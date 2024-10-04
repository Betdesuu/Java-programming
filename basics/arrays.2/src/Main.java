//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // dizileri oluştururken veri tipi[] dizinin adı = new vwri tipi[dizinin boyutu] şeklinde yazmayı öğrenmiştik
        // bunu göstermenin başka bir yolu daha var
        double[] gpa= {3.2,2.8,4.0,3.65,3.25};
        // bu şekilde direkt değerleri girerek de oluşturulabilir
        // şimdi bu değerleri ekrana yazdıralım
         for (int i=0;i<gpa.length;i++){
             System.out.println(gpa[i]);
         }
         // bir de ikinci yöntemle yapalım
        System.out.println("-------------------------------------------");
         // yani şu şekilde for( veri tipi number: dizinin adı)
        for(double number:gpa){
            System.out.println(number);
        }
        System.out.println("--------------------------------------------");

        // eğer bu dizideki elemanların toplamını görmek istiyorsak şöyle bir şey yaparız:
        double total =0;
        for(double number:gpa){
            total = total + number;
        }
        System.out.println("Dizinin elemanları toplamı:" + total);
        System.out.println("---------------------------------------------");
        // Asıl yolla da şu şekilde yapılır:
        double toplam=0;
        for(int j =0; j<gpa.length;j++){
            toplam = toplam + gpa[j];
            System.out.println(j+1 + ". toplam sonucu:" + toplam);
        }

        // şimdi de bu dizideki en büyük sayıyı bulup ekrana yazdıran kodu yazalım:
        double max = gpa[0];
        for(int i=0;i<gpa.length;i++){
            if(gpa[i]>=max){
                max = gpa[i];
            }
        }
        System.out.println("En büyük sayı:" + max);

    }
}