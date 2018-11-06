package Implementation;

import java.util.ArrayList;

public class PoliceTheif {

    public static  void maximum_capture(char arr[],int k){
        ArrayList<Integer> pol = new ArrayList<Integer>();
        ArrayList<Integer> thi = new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 'P'){
                pol.add(i);
            }
            else{
                thi.add(i);
            }
        }
        int p=0;
        int t=0;
        int cnt=0;
        while(p<pol.size() && t<thi.size()){
            if(Math.abs(pol.get(p)-thi.get(t))<=k){
                cnt++;
                p++;
                t++;
            }
            else if(pol.get(p)>thi.get(t)){
                t++;
            }
            else{
                p++;
            }
        }
        System.out.println(cnt);
    }

    public static void main(String[] args){
        char arr1[] = new char[]{'P','T','T','P','T'};
        char arr2[] = new char[]{'T','T','P','P','T','P'};
        char arr3[] = new char[]{'P','T','P','T','T','P'};
        maximum_capture(arr1,2);
        maximum_capture(arr2,2);
        maximum_capture(arr3,3);
    }
}
