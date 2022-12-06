package homework.homework9;

public class Ques1 {

    public static void main(String[] args) {
        try {
            int a=100/0;
        }catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("运行完毕");
        }
    }
}
