package Array;


public class LargestSumContiguousIncreasing {

    private static int largest(int[] arr){
        int max_here;
        int total_max = Integer.MIN_VALUE;
        int staring_index=0,sl=0;
        int ending_index=1;
        int n= arr.length;
        for(int i=0;i<n;i++){
                sl=i;
                max_here=arr[i];
                while(i+1<n &&(arr[i+1]>arr[i])){
                    max_here+=arr[i+1];
                    i++;
                }
                if(max_here>total_max){
                    total_max=max_here;
                    staring_index=sl;
                    ending_index=i+1;
                }

        }
        for(int i=staring_index;i<ending_index;i++)
            System.out.print(arr[i]+" ");
        return total_max;
    }

    public static void main(String[] args){
        int arr1[] = {2, 1, 4, 7, 3, 6};
        int arr[] = {38, 7, 8, 10, 12};
        System.out.println(largest(arr1));
        System.out.println(largest(arr));
    }
}
