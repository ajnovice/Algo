package Implementation;

import java.util.ArrayList;
import java.util.Collections;

public class LexicographicallyMinimum {

    private static void minimum(String str) {

        int len = str.length();

        ArrayList<String> rotations = new ArrayList<String>(len);
        String concatedstr = str.concat(str);


        for (int i = 0; i < len; i++) {
            rotations.add(concatedstr.substring(i, i + len));
        }

        printrotations(rotations);


        Collections.sort(rotations);
        System.out.println(rotations.get(0));

    }

    private static void printrotations(ArrayList<String> rotations) {
        for (int i = 0; i < rotations.size(); i++) {
            System.out.println(rotations.get(i));
        }
    }

    public static void main(String[] args) {

        String str = "CDFTGHAGH";
        minimum(str);

    }
}
