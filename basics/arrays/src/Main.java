//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // dizi oluşturma ve dizinin elemanlarını görüntüleme
        String[] students= new String[3];

        students[0] = "Bet";
        students[1]= "Sena";
        students[2]= "Sıla";
         for(int i=0;i< students.length; i++){
             System.out.println(students[i]);
         }

         System.out.println("------------------ İkinci yol --------------------");
         for(String student: students){
             // string türündeki öğrenciler dizisindeki her bir elemanı tek tek dolaş demek
             System.out.println(student);
         }

    }
}