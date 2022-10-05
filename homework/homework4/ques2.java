package homework.homework4;

public class ques2 {
    public static void main(String[] args) {
        //n为三角形行数
        int n=10;
        int [][] ar;
        ar=new int[n][n];
        for (int i = 0; i < n; i++) {
            ar[i][i]=1;
            ar[i][0]=1;
        }

        for (int i = 2; i < n; i++) {
            for (int j = 1; j < i; j++) {
                ar[i][j]=ar[i-1][j-1]+ar[i-1][j];
            }
        }

        //打印杨辉三角
        for (int i = 0; i < n; i++) {
            System.out.println(" ");
            for (int j = 0; j < i+1; j++) {
                System.out.print(ar[i][j]+" ");
            }

        }
    }
}
