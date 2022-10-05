package homework.homework3;

public class Ques6 {public static void main(String[] args) {
    int sum=0;
    int num=0;
    for (int i = 0; i < 100; i++) {
        if ((i+1)%7==0){
num+=1;sum+=i+1;
        }

    }
    System.out.println("个数为："+num+"总和为："+sum);
}
}
