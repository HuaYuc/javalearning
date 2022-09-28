package homework.homework3;

import java.util.Scanner;

public class ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入成绩");
        String in = sc.next();
        int score = Integer.parseInt(in);
        if (score >= 0 && score <= 100) {
            if (score >= 60) {
                System.out.println("合格");
            }
            if (score < 60) {
                System.out.println("不合格");
            }
        } else System.out.println("输入成绩有误");
    }
}
