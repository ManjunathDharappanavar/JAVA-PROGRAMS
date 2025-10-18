public class day5 {
    // Array palindrome check
    // second largest element
    public static void main(String[] args) {
        int [] arr = { 1, 2, 3, 4, 6, 8, 11, 13, 16, 18, 26, 28, 36};
        int [] a = {1, 2, 3, 2, 1};
        int n = arr.length;
        // boolean response;
        System.out.println("Array length: "+n);
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        // response = arrayPalindrome(arr, n);


        // if(response){
        //     System.out.println("Given Array is Palindrome.");
        // }else{
        //     System.out.println("Not Palindrome.");
        // }


        System.out.println("The second largest no."+ secondLargest(a, a.length));

    }

    public static boolean arrayPalindrome(int [] arr, int n){
        // we use flag to keep track of the truth of the array
        // if we directly send the return it will return for each element which is a problem and very messy.
        for(int i = 0; i<n; i++){
            if(arr[i] != arr[n-i-1]){
                return false;
            }
        }
        return true;
    }

    public static int secondLargest(int [] arr, int n){
        int max = arr[0], smax = Integer.MIN_VALUE;

        for(int i = 0; i<n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        for(int i = 0; i<n; i++){
            if(arr[i]>smax && arr[i]<max){
                smax = arr[i];
            }
        }
        
        return smax;
    }
}
