package APlusB;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.regex.Pattern;

public class APlusB2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s =scan.nextLine();
        String[] block=s.split("\\s+");

        int i=block.length;
        boolean rightpattern;
        if (i == 2){
            rightpattern= true;
        } else{
            rightpattern = false;
        }
        if (rightpattern == true){
            String pattern ="[+-]?[0123456789]+";
            boolean isMatch1 = Pattern.matches(pattern,block[0]);
            boolean isMatch2 = Pattern.matches(pattern,block[1]);
            if (isMatch1 == true && isMatch2 == true){
            } else {
                rightpattern = false;
            }
        } else {

        }
        if (rightpattern == false){
            System.out.println("WRONG FORMAT!");
        } else {
            BigInteger big1 = new BigInteger(block[0]);
            BigInteger big2 = new BigInteger(block[1]);
            BigInteger bigAdd = big1.add(big2);
            System.out.println(bigAdd.toString());
        }

    }
}
