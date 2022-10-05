package homework.homework5;

import java.util.Scanner;

public class ques2 {
    public static void main(String[] args) {
        //输入字符ch
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要查找的字符");
        String inp1=sc.next();
        char ch=inp1.charAt(0);
        //输入字符串st
        System.out.println("请输入字符串");
        String st=sc.next();
        //寻找ch
        boolean doHave=false;
        for (int i = st.length()-1; i >-1 ; i--) {
            if (ch==st.charAt(i)){
                System.out.println("字符最后出现在第"+(i+1)+"位");
                doHave=true;
            }
        }
        if (!doHave){
            System.out.println("Not Found");
        }
    }
}
