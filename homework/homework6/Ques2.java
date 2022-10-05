package homework.homework6;

import java.util.ArrayList;

public class Ques2 {
    //返回maxNum内的所有质数数组
    public ArrayList getPriArr(int maxNum){
        ArrayList arr=new ArrayList<>();
        if (maxNum<=2)
        {
        }
        else{
            arr.add(2);
            //对i进行检查
            for (int i = 2; i <maxNum+1 ; i++) {
                boolean isPri=true;
                for (int j = 2; j <Math.sqrt(i)+1 ; j++) {
                    if (i%j==0){
                        isPri=false;
                        break;
                    }
                }
                //是质数则加入数组arr
                if (isPri){
                    arr.add(i);
                }
            }
        }
return arr;
    }

    //主函数
    public static void main(String[] args) {
        Ques2 qu=new Ques2();
      ArrayList arr=  qu.getPriArr(75);
      //数组有多大
        System.out.println(arr.size());
       // 打印数组
        for (int i = 0; i <arr.size() ; i++) {
            System.out.print(" "+arr.get(i));
        }
    }
}
