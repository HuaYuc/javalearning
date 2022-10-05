package homework.homework5;

import java.util.Scanner;

public class ques1 {
    public static void main(String[] args) {
        System.out.println("请输入一段字符串");
        Scanner sc=new Scanner(System.in);
        String inp1=sc.next();
        //使字符串倒序
       StringBuffer buffer=new StringBuffer(inp1);
       String upsetInp=buffer.reverse().toString();
       //输出结果
        System.out.println("字符串倒序为");
        System.out.println(upsetInp);
    }
}
