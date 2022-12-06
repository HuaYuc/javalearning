package homework.homework10;

import homework.homework9.Ques1;

import java.time.Year;
import java.util.Date;

public class Trying {
    public static void main(String[] args) throws ClassNotFoundException {
        StringBuffer buffer=new StringBuffer("abcdef");
        buffer.append("as");
        System.out.println(buffer);
        buffer.append(12);
        System.out.println(buffer);

       Class a= Class.forName("homework.homework9.Ques1");
        System.out.println(a.getClass());

        Date time=new Date();
        System.out.println(time.getTime());
        System.out.println(time.toInstant() );
       time.setTime(1000);
        System.out.println(time);
        System.out.println(time.toInstant());
    }
}
