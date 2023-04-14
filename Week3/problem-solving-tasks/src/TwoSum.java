import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class TwoSum {
    public static void main(String[] args) {

        print(twoSum(new int[]{2, 7, 11, 15},9));
        print(twoSum(new int[]{3, 2, 4},6));
        print(twoSum(new int[]{3,3},6));
    }
    public static void print(int[] nums){
        for (int i=0;i<nums.length;i++)
            System.out.print(nums[i] + " ");
        System.out.println();
    }
    public static int[] twoSum(int[] nums, int target) {
        // Create Array To Save indexes
        int ans[] = new int[2];
        // Create HashMap to work as table and sure diffrence exist
        Map<Integer,Integer> m = new HashMap<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(m.containsKey(target-nums[i])){
                ans[0] = m.get(target-nums[i]);
                ans[1] = i;
                return ans;
            }else{
                m.put(nums[i],i);
            }
        }
        return ans;
    }
}