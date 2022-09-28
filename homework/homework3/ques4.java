package homework.homework3;

import javax.annotation.processing.SupportedAnnotationTypes;
import java.util.Scanner;

public class ques4 {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("输入月份");
        String inp1=SC.next();
        System.out.println("输入天数");
        String inp2=SC.next();
        int mon=Integer.parseInt(inp1);
        int day=Integer.parseInt(inp2);
        //maxNum表示每月按三十天算时总天数
        int maxNum=(mon-1)*30+day;
        //addNum表示考虑每月天数不同需要加上的天数
        int addNum=0;
        switch(mon){
            case 2,6,7:addNum=1;
            break;
            case 3:addNum=-1;
            break;
            case 1,4,5:addNum=0;
            break;
            case 8:addNum=2;
            break;
            case 9,10:addNum=3;
            break;
            case 11,12:addNum=4;
            break;
        }
        int Num=maxNum+addNum;
        System.out.println("这是2014年的第"+Num+"天");
    }
}
