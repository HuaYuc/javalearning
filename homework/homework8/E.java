package homework.homework8;

/**
 * 1.接口可以定义变量，但静态创建
 * 2.接口不能定义非抽象方法
 * 3.接口回调：把某一接口的类创建的对象的引用赋给该接口声明的接口变量，该变量决定调用被类实现的接口的方法
 * 4.15
 *   8
 * 5.18
 *   15
 */
//接口，定义add方法
interface Com{
    int add(int a, int b);
}
//抽象类，定义add虚方法
    abstract class A{
        abstract int add(int a, int b);
    }

    //B继承A抽象类并连接com接口
class B extends A  implements Com{
    //实现com接口中的方法
    public int add(int a, int b){
        return a+b;
    }
}

public class E {
    public static void main(String args[]) {
        B b = new B();
        Com com = b;
        System.out.println(com.add(12, 6));
        A a = b;
        System.out.println(a.add(10, 5));
    }
}