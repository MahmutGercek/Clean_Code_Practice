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
    public static int[] separate(int[] arr){
        int[] result= new int[arr.length];
        int leftindex=0;
        int rightindex=arr.length-1;
        for(int i=0;i< arr.length;i++){
            if(arr[i]<0){
                result[leftindex++]=arr[i];
            }
            else{
                result[rightindex--]=arr[i];
            }
        }
        return result;
    }
}
