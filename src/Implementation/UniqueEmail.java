package Implementation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UniqueEmail {
    public  static void  main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<String> emails = new ArrayList<String>(n);
        for(int i=0;i<n;i++){
            emails.add(scan.nextLine());
        }
        HashMap<String,Integer> unique_emails= new HashMap<String,Integer>();

        for(String email:emails){
            String[] split_emails = email.split("@");
            split_emails[0]=split_emails[0].replaceAll("([.])","");
            System.out.println(split_emails[0]);
            int index = split_emails[0].indexOf("+");
            if(index>=0){
                split_emails[0]=split_emails[0].substring(0,index);
            }
            unique_emails.put(split_emails[1]+"@"+split_emails[1],1);
        }
        int cnt=0;
        for(Map.Entry<String,Integer> cnt_emails:unique_emails.entrySet()){
            if(cnt_emails.getValue()>0){
                cnt++;
            }
        }
        System.out.println(cnt);

    }
}
