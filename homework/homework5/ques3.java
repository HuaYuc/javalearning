package homework.homework5;

import java.util.Scanner;

public class ques3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个十六进制数");
        String inp1=sc.next();
        int[]arr1=new int[inp1.length()];
        //提取每个数位
        for (int i = 0; i < inp1.length(); i++) {
           switch (inp1.charAt(i)){
               case 'a':arr1[i]=10;break;
               case'b':arr1[i]=11;break;
               case'c':arr1[i]=12;break;
               case'd':arr1[i]=13;break;
               case'e':arr1[i]=14;break;
               case'f':arr1[i]=15;break;
               default:arr1[i]=inp1.charAt(i)-'0';break;
           }
        }
           //转化为十进制
        long res=0;
        for (int i = 0; i <inp1.length() ; i++) {
            res+=arr1[i]*Math.pow(16,inp1.length()-1-i);
        }
        System.out.println("十进制为"+res);
    }
}
