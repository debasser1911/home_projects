import java.util.Scanner;

public class Exp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Какое количество чисел собираетесь вводить?: ");
        int count = in.nextInt();
        int[] nums = new int[count];


        for (int i = 0; i < nums.length; i++) {
            System.out.print("Введите Ваше число?: ");
            int number = in.nextInt();
            nums[i] = number;

        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}