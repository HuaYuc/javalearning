package homework.homework7;

public class Ques4 {
    public static void main(String args[]){
        String st1 = new String("Hello");
        String st2 = new String("Hello");
        if( st1 == st2)
            System.out.println("st1==st2  ?" + true);
        else
            System.out.println("st1==st2  ?" + false);

        if(st1.equals(st2))
            System.out.println("st1==st2  ?" + true);
        else
            System.out.println("st1==st2  ?" + false);
    }

}

