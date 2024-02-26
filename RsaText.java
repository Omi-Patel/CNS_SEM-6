import java.util.Scanner;

public class RsaText {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter only PRIME number p & q : ");
        int p = sc.nextInt();
        int q = sc.nextInt();

        int n = p * q;

        int fn = (p-1)*(q-1);

        // for e = gcd(fn, n) = 1 must be in range of [1, fn]

        System.out.printf("Enter the Number 'e' must be in range of [1, %d] and gcd(e, %d) = 1 : ", fn, fn);
        int e = sc.nextInt();

        // calculate d
        int d = 1;

        for(int i=1; i<fn; i++){
            if((i * e) % fn == 1){
                d = i;
            }
        }

        // System.out.println(d);

        // public key = {e, n} = {7, 33} 
        System.out.printf("Public Key : {%d %d} ", e, n);
        System.out.println();

        // private key = {d, n} = {3, 33}
        System.out.printf("Private Key : {%d %d} ", d, n);
        System.out.println();



        // Now Take Plain Text
        System.out.print("Enter Plain Text : ");
        int M = sc.nextInt();
        System.out.printf("Your Plain Text : %d ", M);

        System.out.println();

        // convert into cipher text
        int c = (int)Math.pow(M, e) % n;
        System.out.printf("Your Cipher Text : %d ", c);

        System.out.println();

        // Decryption
        int dM = (int)Math.pow(c, d) % n;
        System.out.printf("Your Plain Text After Decryption : %d ", dM);
    }
}
