
public class promblem1 {
    // find max and min element
    // find even and odd numbers 
    // reverse the array

    public static void main(String[] args) {
        int [] arr = {10,20,30};

        maxNmin(arr);
        evenNodd(arr);
        arrRev(arr);
    }

    public static void maxNmin(int [] arr){
        int max = arr[0], min = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("max element: "+max);
        System.out.println("min element: "+min);

    }

    public static void evenNodd(int [] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+",");
        }
        
        for(int i = 0; i<arr.length; i++){
            if(arr[i]%2 == 0){
                System.out.println("even");
            }
            else{
                System.out.println("odd");
            }
        }
    } 

    public static void arrRev(int [] arr){
        for(int i = arr.length-1; i>=0; i--){
            System.out.print(arr[i]);
        }
    }
}
