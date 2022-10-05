package homework.homework6;

import java.util.ArrayList;

public class Ques3 {
    //得到maxNum以内的质数数组
    public ArrayList getPriArr(int maxNum){
        ArrayList arr=new ArrayList<>();
        if (maxNum<=2){

        }
        else {
            arr.add(2);
            //对2到maxNum内的所有数字进行检查
            for (int i = 2; i < maxNum+1; i++) {
                boolean isFri=true;
                //对每个i除余数组中每个质数
                for (int j = 0; j <arr.size() ; j++) {
                    int pri=(int)arr.get(j);
                    if (i%pri==0){
                        isFri=false;
                    }
                }
                //如果判定i为质数，则加入数组
                if (isFri){
                    arr.add(i);
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Ques3 ques=new Ques3();
        ArrayList arr=ques.getPriArr(75);
        //返回质数个数
        System.out.println(arr.size());
        //输出所有质数
        for (int i = 0; i <arr.size() ; i++) {
            System.out.print(" "+arr.get(i));
        }

    }
}
