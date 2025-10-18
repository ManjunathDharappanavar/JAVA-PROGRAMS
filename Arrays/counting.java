public class counting{
    public static void main(String[] args) {
        // int [] arr = {7, -3, 12, -8, 0, 5, -1, 9, -6, 2, -4};
        int [] arr = {10, 20, 30};

        positiveNnegative(arr);
        sumNavg(arr);
        reverseArr(arr);
    }

    public static void positiveNnegative(int [] arr){
        int pCount = 0, nCount = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] >= 0){
                pCount++;
            }else if(arr[i] < 0){
                nCount++;
            }
        }

        System.out.println("positive numbers are: "+pCount);
        System.out.println("negative numbers are: "+nCount);

    }

    public static void sumNavg(int [] arr){
        int sum = 0, avg = 0;

        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
        }

        avg = sum/arr.length;

        System.out.println("SUM: "+sum);
        System.out.println("AVG: "+avg);
    }

    public static void reverseArr(int [] arr){
        int start = 0, end = arr.length-1;

        while(start < end){
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }

        System.out.println("Reversed Array: ");

        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    
}