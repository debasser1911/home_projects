import java.util.Scanner;

public class SummProgram {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println(summ(a, b, c));

        }
    }
    public static int summ (int a, int b, int c){
        return ((a + b + c) / 3);
    }

}

