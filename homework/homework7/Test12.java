package homework.homework7;

import homework.homework7.ques2.Student;
import homework.homework7.ques2.Teacher;

public class Test12 {
    public static void main(String[] args) {
        /*
    作业一：创建java自定义类
     */
        //创建小明，小美，狗并打印其属性
        Ques1.Person XiaoMing=new Ques1.Person();
        XiaoMing.setSex("male");
        XiaoMing.setName("小明");
        XiaoMing.setAge(18);

        Ques1.Person XiaoMei=new Ques1.Person();
        XiaoMei.setName("小美");
        XiaoMei.setAge(19);
        XiaoMei.setSex("female");

        Ques1.Animal dog=new Ques1.Animal();
        dog.setAge(3);
        dog.setType("dog");

        System.out.println(XiaoMing.getName()+" "+XiaoMing.getSex()+" "+XiaoMing.getAge());
        System.out.println(XiaoMei.getName()+" "+XiaoMei.getSex()+" "+XiaoMei.getAge());
        System.out.println(dog.getType()+" "+dog.getAge());

        /*
        作业2：教师类和学生类
         */
        Student XiaoLi=new Student("小李",18, new String[]{"数学", "英语"},new String[]{"绘画","音乐"});
        Teacher DeHua=new Teacher("德华","数学",new String[]{"高等数学","离散数学"},9);
        XiaoLi.getAllInfom();
        DeHua.getAllInform();
    }
}
