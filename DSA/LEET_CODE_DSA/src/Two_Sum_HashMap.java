import java.util.*;

public class Two_Sum_HashMap {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            Integer index = map.get(complement);
            if (index != null) {
                return new int[] { index, i };
            }

            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two numbers add up to the target.");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n=sc.nextInt();
        int nums[] = new int[n];
        for (int m = 0; m < n; m++) {
            System.out.print("Enter the "+(m+1)+" number");
            nums[m]=sc.nextInt();
        }
        System.out.print("Enter the target that you want after adding: ");
        int target = sc.nextInt();

        int[] result = twoSum(nums, target);

        System.out.println("Indices: " + result[0] + ", " + result[1]);
        System.out.println("Values: " + nums[result[0]] + ", " + nums[result[1]]);
    }
}