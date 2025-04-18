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
        HashSet<Integer> checker = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(checker.contains(nums[i])){
                return nums[i];
            }
            else{
                checker.add(nums[i]);
            }
        }
        return -1;
    }
}
