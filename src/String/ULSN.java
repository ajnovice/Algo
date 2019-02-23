package String;

public class ULSN {
    private static void counts(String str) {
        int upper = 0, lower = 0, special = 0, number = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                if (Character.isUpperCase(str.charAt(i))) {
                    upper++;
                } else {
                    lower++;
                }
            } else if (Character.isDigit(str.charAt(i))) {
                number++;
            } else {
                special++;
            }
        }
        System.out.println("Upper : " + String.valueOf(upper) + " Lower : " + String.valueOf(lower) + " Number : " + String.valueOf(number) + " Special : " + String.valueOf(special));
    }

    public static void main(String[] args) {
        String str = "#GeeKs01fOr@gEEks07";
        counts(str);
    }
}
