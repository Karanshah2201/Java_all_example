package java_prac_6;
import java.util.*;
public class Java_prac_6 {
    public static void main(String[] args) {

System.out.println("ID :D23DCE148");
System.out.println("NAME:HARSH");
 Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int count = count9(nums);

        System.out.println("Number of 9's in the array: " + count);

        scanner.close();
    }

    public static int count9(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num == 9) {
                count++;
            }
        }
        return count;
    }
}
