package homework.homework3;

import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入月份");
        String inp=sc.next();
        int mon=Integer.parseInt(inp);
        switch (mon){
            case 3,4,5:
                System.out.println("春季");
            case 6,7,8:
                System.out.println("夏季");
            case 9,10,11:
                System.out.println("秋季");
            case 12,1,2:
                System.out.println("冬季");
        }
    }


}
