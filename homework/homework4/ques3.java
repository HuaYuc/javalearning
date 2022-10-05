package homework.homework4;

public class ques3 {
    public static void add(int arr1[][],int arr2[][],int arr3[][]){
        for (int i = 0; i < arr1.length; i++) {
           for (int j = 0; j < arr1.length; j++) {
                arr3[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
    }

    public static int[][] mul(int arr1[][],int arr2[][]){
        int arr3[][]=new int[arr1.length][arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                arr3[i][j]=arr1[i][0]*arr2[0][j]+arr1[i][1]*arr2[1][j]+arr1[i][2]*arr2[2][j];

            }
        }
        return arr3;
    }
    public static void main(String[] args) {
int a1[][]={{1,2,3},{4,5,6},{7,8,9}};
int a2[][]={{2,2,2},{1,1,1},{3,3,3}};
int a3[][]=new int[3][3];
int a4[][]=new int[3][3];
add(a1,a2,a3);
        System.out.println("c+d=");
        for (int i = 0; i <3 ; i++) {
            System.out.println(" ");
            for (int j = 0; j < 3; j++) {
                System.out.print(a3[i][j]+" ");
            }
        }
        System.out.println(" ");
        System.out.println("c*d=");
      int a44[][]=  mul(a1,a2);
        for (int i = 0; i <3 ; i++) {
            System.out.println(" ");
            for (int j = 0; j < 3; j++) {
                System.out.print(a44[i][j]+" ");
            }
        }
    }
}
