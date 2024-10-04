//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[][] notlar = new int[2][2];
        notlar[0][0] = 35;
        notlar[0][1] = 79;
        notlar[1][0] = 60;
        notlar[1][1] = 45;

        for (int i = 0; i < 2; i++) {
            System.out.println("--------------------------");
            for (int j = 0; j < 2; j++) {
                System.out.println(notlar[i][j]);
            }
        }

    }
}