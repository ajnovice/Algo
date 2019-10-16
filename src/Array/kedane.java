package Array;

public class kedane {

    private static int sum(int[] arr){
        int local_max=0,total_max=0;
        int starting_index=0,ending_index=0,starting_index_l=0;

        int n=arr.length;
        for(int i=0;i<n;i++){
            local_max+=arr[i];
            if(local_max<=0) {
                local_max = 0;
                starting_index_l=i+1;
            }
            if(local_max>total_max) {
                total_max = local_max;
                starting_index=starting_index_l;
                ending_index=i;
            }

        }
        for(int i=starting_index;i<=ending_index;i++)
            System.out.println(arr[i]);
        return total_max;
    }

    public static void main(String[] args){
        int a[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println(sum(a));
    }
}
