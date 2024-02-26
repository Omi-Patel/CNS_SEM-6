import java.util.Scanner;

public class Transposition {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Key : ");
        int key = sc.nextInt();

        System.out.print("Enter a Plain Text : ");
        String pt = sc.next();

        // System.out.println(key);
        // System.out.println(pt);

        String nl = "" + key;
        int numLen = nl.length();
        int ptLen = pt.length();
        // System.out.println(pt.charAt(5));

        // System.out.println(numLen);
        // System.out.println(ptLen);

        int size = ptLen / numLen;
        if (size * numLen != ptLen) {
            size++;
        }
        // System.out.println(size);

        char matrix[][] = new char[size][numLen];

        int cur = 0;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < numLen; j++) {
                if (cur >= ptLen) {
                    matrix[i][j] = 'x';
                } else {
                    matrix[i][j] = pt.charAt(cur);
                    cur++;
                }
            }
        }

        for (int i = 0; i < nl.length(); i++) {
            System.out.print(nl.charAt(i) + " ");
        }
        System.out.println();

        for (int i = 0; i < size; i++) {
            for (int k = 0; k < numLen; k++) {
                System.out.print(matrix[i][k] + " ");
            }

            System.out.println();
        }


        System.out.print("Cipher Text : ");
        // cipher text
        for(int i=0; i<numLen; i++){
            for(int j=0; j<size; j++){
                System.out.print(matrix[j][i]);
            }
        }

        sc.close();
    }
}
