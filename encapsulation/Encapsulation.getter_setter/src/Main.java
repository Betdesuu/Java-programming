//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // getter bir değeri okumaya yönelik işlemdir
    // setter ise kurmaya bir değer atamaya yarar
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "bet";


        s1.gpa= 3.65;
        s1.major = "CS";

        studentManager stdmanager = new studentManager();
        stdmanager.addStudent(s1);
        stdmanager.printStudent(s1);

    }
}