package homework.homework6;

public class Ques1 {
    //返回maxNum内有多少个质数priNum
    public static int getPriNum(int maxNum){
        int priNum;
        //2以内没有质数
      if (maxNum<=2){
          priNum=0;
      }
      //用i遍历maxNum，若i符合质数条件则priNum+1
      else{
          priNum=0;
          for (int i = 2; i < maxNum; i++) {
              boolean isPri=true;
              for (int j = 2; j <i ; j++) {
                  if (i%j==0){
                      isPri=false;
                  }
              }
              if (isPri){
                  priNum+=1;
              }
          }
      }
      //返回priNum值
      return priNum;
    }

    //返回maxNum内所有质数的数组
    public static int[] getPriArr(int maxNum,int priNum){
        //创建储存质数的数组priArr
        int priArr[];
        if (maxNum<=2){
            priArr=new int[priNum];
        }
        //把每个符合质数条件的i储存进priArr
        else{
            priArr=new int[priNum];
            int th=0;
            for (int i = 2; i < maxNum; i++) {
                boolean isPri=true;
                for (int j = 2; j <i ; j++) {
                    if (i%j==0){
                        isPri=false;
                    }
                }
                if (isPri){
                    priArr[th]=i;
                    th+=1;
                }
            }
        }
        //返回priArr
       return priArr;
    }

    //主函数
    public static void main(String[] args) {
        int priNum=getPriNum(75);
        System.out.println(priNum);
        int[] arr1=getPriArr(75,priNum);
        for (int i = 0; i < priNum; i++) {
            System.out.print(" "+arr1[i]);
        }
    }
}
