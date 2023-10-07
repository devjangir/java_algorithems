package org.example.algorithems.twopointers;

public class FindDuplicate {
    static int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];
        while(true) {
            slow = nums[slow];
            fast = nums[nums[fast]];
            if(slow == fast) {
                break;
            }
        }

        slow = nums[0];
        while(slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return fast;
    }
    public static void main(String[] args) {
        int [][] nums = {
                {1,3,2,5,4,5},
                {2,4,5,4,1,3}
        };
        for (int[] num : nums) {
            System.out.println(findDuplicate(num));
        }
    }
}
