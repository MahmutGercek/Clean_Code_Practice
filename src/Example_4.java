/*public class Example_4{
    public int findFirstDuplicate(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return nums[i];
                }
            }
        }
        return -1;
    }
}*/
import java.util.HashSet;
public class Example_4{
    public int findFirstDuplicate(int[] nums){
        HashSet<Integer> checker = new HashSet<>();      //We use HashSet this time instead of using nested for loops,this will make our time complexity O(n) instead of O(n^2)
        for(int i=0;i<nums.length;i++){
            if(checker.contains(nums[i])){               //When we find the first duplicate we directly return that nums[i] value
                return nums[i];
            }
            else{
                checker.add(nums[i]);
            }
        }
        return -1;
    }
}
