package Implementation;

public class RotateArray {

    public static void rotateByOne(int a[]){
        int prev = a[0];
        int n=a.length;
        for(int i=0;i<n-1;i++){
            a[i]=a[i+1];
        }
        a[n-1]=prev;
    }

    public static void rotateByD(int a[],int d){
        for(int i=0;i<d;i++){
            rotateByOne(a);
        }
    }

    public static void main(String[] args){
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        rotateByD(arr,3);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
