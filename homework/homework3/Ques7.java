package homework.homework3;

public class Ques7 {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            //f，s，t分别为i的百位，十位，个位
            int f=i/100;
            int s=(i%100)/10;
            int t=i%10;

            if (Math.pow(f,3)+Math.pow(s,3)+Math.pow(t,3)==i){
                System.out.println(i);
            }
        }
    }
}
