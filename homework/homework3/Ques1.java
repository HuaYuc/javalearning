package homework.homework3;

import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个小写字母");
        String s=sc.next();
        char c=s.charAt(0);
        switch (c){
            case 'a': c='A';
            break;
            case 'b':c='B';
                break;
            case 'c':c='C';
                break;
            case 'd':c='D';
                break;
            case'e':c='E';
                break;
            default:
                System.out.println("other");
        }
        System.out.println(c);


    }
}
