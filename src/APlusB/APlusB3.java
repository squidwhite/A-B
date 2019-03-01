package APlusB;

import java.math.BigInteger;
import java.util.Scanner;

public class APlusB3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int radixA = scan.nextInt();
        String stringA1 = scan.next();
        int radixB = scan.nextInt();
        String stringB1 = scan.next();
        int radixC = scan.nextInt();

        String bigA = new BigInteger(stringA1,radixA).toString(10);
        String bigB = new BigInteger(stringB1,radixB).toString(10);
        BigInteger bigA1 = new BigInteger(bigA);
        BigInteger bigB1 = new BigInteger(bigB);

        BigInteger bigAdd = bigA1.add(bigB1);

        String bigAdd1 = bigAdd.toString();
        String bigAdd2 = new BigInteger(bigAdd1,10).toString(radixC);

        System.out.println(bigAdd2);
    }
}
