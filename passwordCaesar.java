import java.util.Scanner;

public class passwordCaesar {
    public static String encrypt(String str , int k ) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                char ch = (char) (((int) str.charAt(i) + k - 65) % 26 + 65);
                result += ch;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        String str = input.nextLine();

        int k = input.nextInt();

        System.out.print(encrypt(str,k));

    }
}