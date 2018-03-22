package Sorting;

import java.util.Arrays;

/**
 * Created by istomina on 07.06.2017.
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {4, 5, 9, 22, 45, 676, -56, -3, -678, 3, 5, 88, 9};
        int temp;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 100);

        }

        System.out.print("original array is ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(" " + nums[i]);
        }
        System.out.println();

        Arrays.sort(nums);

/*        for (int i = 1; i < nums.length; i++) {
            for (int j = nums.length - 1; j >= i; j--) {
                if (nums[j - 1] > nums[j]) {
                    temp = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }*/
        System.out.print("sorted array is ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(" " + nums[i]);
        }
    }
}
