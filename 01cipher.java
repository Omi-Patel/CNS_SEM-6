import java.util.Scanner;

class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Plain Text : ");
        String pt = sc.next();

        pt = pt.toUpperCase();

        String ans = "";

        for (int i = 0; i < pt.length(); i++) {
            char ch = pt.charAt(i);
            int av = (int) ch - 65;
            // System.out.println(av);

            int ct = (av + 1) % 26 + 65;

            char ec = (char) ct;

            // System.out.println(ec);
            ans = ans + ec + " ";

        }
        System.out.println(ans);

        sc.close();

    }
}
