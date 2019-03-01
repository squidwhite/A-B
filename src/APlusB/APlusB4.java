package APlusB;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.regex.Pattern;

public class APlusB4{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String string1 = scan.nextLine();
        String string2 = string1.replaceAll(" ","");//去除所有空格
        String[] array1 = string2.split("[+-]");//提出所有数字的字符串
        String[] array2 = string2.split("[0123456789]");//提出所有运算符的字符串
        int j=0;
        String[] num = new String[10000];
        j = wipeSpace(array1,num,j,array1.length);

//        for (int i = 0;i<array1.length;i++){
//            if (!array1[i].isEmpty()){
//                num[j] = array1[i];
//                j++;
//            } else {
//
//            }
//        }//去除array1里的空串，得到所有数字

        int k =0;
        String[] op = new String[10000];
        int length2 =array2.length;
        k = wipeSpace(array2,op,k,array2.length);

//        for (int i = 0;i<array2.length;i++){
//            if (!array2[i].isEmpty()){
//                op[k] = array2[i];
//                k++;
//            } else {
//
//            }
//        }//去除array2里的空串，得到所有运算符

        BigInteger[] big = new BigInteger[10000];
        for (int i = 0;i<j;i++){
            if(num[i]!=null)
                big[i] = new BigInteger(num[i]);
        }//将所有数字字符串转为大数
        BigInteger sum = new BigInteger("0");
        if (j == k){//第一个数字前有符号
            if (op[0].equals("+")){
                sum=sum.add(big[0]);
            } else {
                sum=sum.subtract(big[0]);
            }
            for (int i=1;i<j;i++){
                if (op[i].equals("++")||op[i].equals("+")||op[i].equals("--")){
                    sum=sum.add(big[i]);
                } else {
                    sum=sum.subtract(big[i]);
                }
            }
        } else {//无符号
            sum=sum.add(big[0]);
            for (int i=0;i<k;i++){
                if (op[i].equals("++")||op[i].equals("+")||op[i].equals("--")){
                    sum=sum.add(big[i+1]);
                } else {
                    sum=sum.subtract(big[i+1]);
                }
            }
        }
        System.out.println(sum.toString(10));


    }

    public static int wipeSpace(String[] s1,String[] s2,int j,int length){
        for (int i = 0;i<length;i++){
            if (!s1[i].isEmpty()){
                s2[j] = s1[i];
                j++;
            } else {

            }
        }
        return j;
    }
}





