package homework.homework4;

import java.util.Random;
import java.util.Scanner;

public class ques1 {
    public static void main(String[] args) {
        Random rand=new Random();
        int ar[]=new int[11];
        for (int i = 0; i <10 ; i++) {
            ar[i]=rand.nextInt(90)+10;
        }

        System.out.println("请输入一个两位整数");
        Scanner sc=new Scanner(System.in);
        String inp=sc.next();
        ar[10]=Integer.parseInt(inp);
        //排序
        int temp=0;
        for (int i = 0; i <ar.length-1 ; i++) {
            for (int j = 0; j < ar.length-1-i; j++) {
                if (ar[j] > ar[j + 1]) {
                    temp = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < 11; i++) {
            System.out.println(ar[i]);
        }
    }
}
