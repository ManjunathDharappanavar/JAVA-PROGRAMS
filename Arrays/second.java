public class second {
    // to find max and second max 
    // also min and second min

    public static void main(String[] args) {
        int [] arr = { 1, -2, 3, 4, 6, 8, 11, 13, 16, 18, 26, 28, 36};
        secondLargeNsmall(arr);
    }

    public static void secondLargeNsmall(int [] arr){
         int max = Math.max(arr[0], arr[1]);
         int smax = Math.min(arr[0], arr[1]);                     
         int min = Math.min(arr[0], arr[1]);
         int smin = Math.max(arr[0], arr[1]);


        for(int num : arr){
            if(num > max){
                smax = max;
                max = num;
            }else if(num > smax && num != max){
                smax = num;
            } 
            if(num < min){
                smin = min;
                min = num;
            }else if(num < smin && min != num){
                smin = num;
            }    
        }

        System.out.println("Largest no :"+max);
        System.out.println("Second Largest no :"+smax);

        System.out.println("Smallest no :"+min);
        System.out.println("Second Smallest no :"+smin);

    }
}
