package homework.homework7.ques3;

public class TestInstance {
    public static void method1(Person e){
        System.out.println(e.getInfo());
        if (e instanceof Graduate){
            System.out.println("a graduated student");
        }
        if (e instanceof Student){
            System.out.println("a student");
        }
        if (e instanceof Person){
            System.out.println("a person");
        }
    }

    public static void main(String[] args) {
        Person XiaoMing=new Person();
        Person XiaoLi=new Student() ;
        Person XiaoLiu=new Graduate();
        method1(XiaoMing);
        System.out.println();
        method1(XiaoLi);
        System.out.println();
        method1(XiaoLiu);
    }
}
