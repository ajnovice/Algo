package Implementation;

import java.util.Arrays;

public class SortedRotatedArray {

    public static int pivotIndex(int a[],int l,int r){

        if(l>r){
            return -1;
        }
        if(l==r){
            return l;
        }
        int mid = (l+r)/2;
        if(mid>l &&(a[mid]<a[mid-1])){
            return mid-1;
        }
        if(mid<r && a[mid]>a[mid+1]){
            return mid;
        }
        if(a[mid]>a[l]){
            return pivotIndex(a,mid+1,r);
        }
        else{
            return pivotIndex(a,l,mid-1);
        }
    }

    public static int search(int a[],int n,int k){
        int pivot = pivotIndex(a,0,n-1);
        if(pivot == -1){
            return Arrays.binarySearch(a,k);
        }
        if(a[pivot]==k){
            return pivot;
        }
        if(k>=a[0]){
            return Arrays.binarySearch(a,0,pivot,k);
        }
        else{
            return Arrays.binarySearch(a,pivot+1,n-1,k);
        }
    }

    public static void main(String[] args){
        int a[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int index = search(a,a.length,8);
        if(index>=0) {
            System.out.println(a[index]);
        }
        else{
            System.out.println("NOT FOUND");
        }
    }
}
