package Implementation;

import java.util.ArrayList;
import java.util.Scanner;

public class KefaFirstSteps {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> input = new ArrayList<Integer>(n);
        for(int i=0;i<n;i++){
            input.add(scanner.nextInt());

        }

        int result[] = new int[n];
        for(int i=0;i<n;i++){
            result[i]=1;
        }
        int max=1;
        for(int i=1;i<n;i++){
            if(input.get(i)>=input.get(i-1)){
                result[i]=result[i-1]+1;
                if(result[i]>max){
                    max = result[i];
                }
            }
        }
        System.out.println(max);
        scanner.close();

    }
}
