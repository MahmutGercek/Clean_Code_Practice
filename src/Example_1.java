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
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                return true;
            }
        }
        return false;
    }
}

