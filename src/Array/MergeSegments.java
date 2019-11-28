package Array;

import java.util.Arrays;
import java.util.Comparator;

public class MergeSegments {

    public static void main(String[] args){
        int[][] segments= {
            {2,3},{-5,-3},{-1,-2},{4,5}
        };

        Arrays.sort(segments, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        for(int i=0;i<segments.length;i++){
            System.out.println(segments[i][0]+" "+segments[i][1]);
        }
        int index=0;
        for(int i=1;i<segments.length;i++){
            if(segments[index][1]>=segments[i][0]){
                segments[index][1]=Math.min(segments[index][1],segments[i][1]);
                segments[index][0]=Math.max(segments[index][0],segments[i][0]);
            }else{

                segments[index]=segments[i];
                index++;

            }
        }
        System.out.println(index+1);
    }
}
