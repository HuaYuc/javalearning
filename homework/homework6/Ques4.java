package homework.homework6;

import java.util.ArrayList;

public class Ques4 {
    //构造质因数分解函数，分解出的质因数用返回的数组储存
    public ArrayList getFacArr(int num){
        ArrayList arr=new ArrayList<>();
        //寻找可除的质数i
        int num1;
        for (int i = 2; i < num+1; i++) {
            boolean isFri=true;
            for (int j = 2; j <i ; j++) {
                if (i%j==0){
                    isFri=false;
                }
            }
            //将符合条件的i加入数组，更新num
            if (isFri&&num%i==0){
                arr.add(i);
                num1=num/i;
                num=num1;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Ques4 ques=new Ques4();
        ArrayList arr=ques.getFacArr(86);
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
}
