import java.util.Scanner;

public class GeronTriangle {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double pp = (a + b + c) / 2.0;
        double sqrt = Math.sqrt(pp * (pp - a) * (pp - b) * (pp - c));
        System.out.println(sqrt);
    }
}