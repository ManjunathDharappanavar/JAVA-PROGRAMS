public class rotation {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 1; // rotate by 2 positions
        Rotate(arr, k);
    }

    public static void Rotate(int [] arr, int k){
        int n = arr.length;
        int [] LRA = new int[n];
        int [] RRA = new int[n];

        for(int i = 0; i<n; i++){
            int newIndex = (i + (n-k))%n;
            LRA[newIndex] = arr[i];
        }

        for(int i = 0; i<n; i++){
            int newIndex = (i + k)%n;
            RRA[newIndex] = arr[i];
        }

        System.out.println("Normal array");
        for(int i : arr){
            System.out.print(i+" ");
        }

        System.out.println("\nLeft Rotated array");
        for(int i : LRA){
            System.out.print(i+" ");
        }

        System.out.println("\nRight Rotated array");
        for(int i : RRA){
            System.out.print(i+" ");
        }

    }

    
}
