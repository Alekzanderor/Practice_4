import java.util.Scanner;

public class Practice_4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input binary number: ");
        String str = sc.nextLine();

        int[] a = new int[str.length()];
        int sum = 0;
        char c;

        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(str.length() - 1 - i);

            if (c == '1' || c == '0') {
                if (c == '1')
                    a[i] = 1;
                else a[i] = 0;
            } else {
                System.out.println("Error");
                break;
            }
            sum += (a[i] * Math.pow(2, i));
        }

        System.out.println("\"" + str + "\" = " + sum);
    }
}