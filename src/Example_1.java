/*public class Example_1 {
    public boolean containsZero(int[] nums) {
        boolean hasZero = false;
        int len = nums.length;

        for (int i = 0; i < len; i++) {
            int number = nums[i];
            if (number == 0) {
                hasZero = true;
                break;
            }
        }

        return hasZero;
    }

}*/
public class Example_1 {
    public boolean containsZero(int[] nums) {
        for (int i = 0; i < nums.length; i++) {         //We didnt assign a hasZero,len and number variable here
            if (nums[i] == 0) {                         //instead,we directly returned the true or false value
                return true;                            //used nums.length
            }                                           //and directly checked nums[i] equals to 0 or not
        }
        return false;
    }
}

