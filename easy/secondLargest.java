package easy;

public class secondLargest{

    public static boolean validation(int[] arr){
        if(arr == null){
            return false;
        }
        if(arr.length < 2){
            return false;
        }
        return true;
    }

    public static int output(int[] arr){

        if(!validation(arr)){
            System.out.println("Array error");
            return Integer.MIN_VALUE;
        }

        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        for(int number : arr){

            if(number > largest){
                secondLargest = largest;
                largest = number;
            }
            else if(number > secondLargest && number != largest){
                secondLargest = number;
            }
        }

        return secondLargest;
    }
}