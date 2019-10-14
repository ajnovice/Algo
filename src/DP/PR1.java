package DP;

import java.util.*;
import java.util.List;
import java.util.Stack;

public class PR1 {

    private static int check_log_history(List<String> events){
        Set<String> set = new HashSet<>();
        Stack<String> stack = new Stack<>();
        int i,n=events.size();
        for(i=0;i<n;i++) {
            String cmd[]=events.get(i).split(" ");
            if("ACQUIRE".equals(cmd[0])) {
                if(set.contains(cmd[1])) {
                    return i+1;
                }
                else {
                    stack.add(cmd[1]);
                    set.add(cmd[1]);
                }
            } else {
                if(stack.isEmpty() || !stack.pop().equals(cmd[1])) {
                    return i+1;
                }
                set.remove(cmd[1]);
            }
        }
        return (stack.size() > 0? n+1 : 0);

    }

    public static void main(String[] args){
        List<String> s1 = new ArrayList<>();
        s1.add("ACQUIRE 364");
        s1.add("ACQUIRE 84");
        s1.add("RELEASE 84");
        s1.add("RELEASE 364");
        System.out.println(check_log_history(s1));
        List<String> s2 = new ArrayList<>();
        s2.add("ACQUIRE 364");
        s2.add("ACQUIRE 84");
        s2.add("RELEASE 364");
        s2.add("RELEASE 84");
        System.out.println(check_log_history(s2));
        List<String> s3 = new ArrayList<>();
        s3.add("ACQUIRE 123");
        s3.add("ACQUIRE 364");
        s3.add("ACQUIRE 84");
        s3.add("RELEASE 84");
        s3.add("RELEASE 364");
        s3.add("ACQUIRE 436");
        System.out.println(check_log_history(s3));
        List<String> s4 = new ArrayList<>();
        s4.add("ACQUIRE 123");
        s4.add("ACQUIRE 364");
        s4.add("ACQUIRE 84");
        s4.add("RELEASE 84");
        s4.add("RELEASE 364");
        s4.add("ACQUIRE 789");
        s4.add("RELEASE 456");
        s4.add("RELEASE 123");
        System.out.println(check_log_history(s4));

        List<String> s5 = new ArrayList<>();
        s5.add("ACQUIRE 364");
        s5.add("ACQUIRE 84");
        s5.add("ACQUIRE 364");
        s5.add("RELEASE 364");
        System.out.println(check_log_history(s5));
    }
}
