/*public class Example_3 {
    public static int[] separate(int[] array){
        int[] result = new int[array.length];
        int j = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                result[j] = array[i];
                j++;
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                result[j] = array[i];
                j++;
            }
        }

        return result;
    }
}*/
public class Example_3{
    public static int[] separate(int[] arr){        //We won't use two for loops for this,we assign leftindex and rightindex variables
        int[] result= new int[arr.length];          //leftindex will write negatives from left to right
        int leftindex=0;                            //rightindex will write positives and 0 from right to left
        int rightindex=arr.length-1;
        for(int i=0;i< arr.length;i++){
            if(arr[i]<0){
                result[leftindex++]=arr[i];         //after writing the value in result,we add 1 to our index variable
            }
            else{
                result[rightindex--]=arr[i];
            }
        }
        return result;                              //return the result
    }
}
