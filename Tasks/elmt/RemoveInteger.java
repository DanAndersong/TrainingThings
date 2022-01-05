package elmt;

import java.util.Arrays;

public class RemoveInteger {
    public static void main(String[] args) {
        int [] arr = new int[]{6,1,1,1,22,1,45};

        System.out.println(Arrays.toString(removeElement(arr, 1)));

    }
    public static int[] removeElement(int[] nums, int val) {
        int offset = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                offset++;
            } else {
                nums[i - offset] = nums[i];
            }
        }
        return Arrays.copyOf(nums, nums.length - offset);

    }

}
