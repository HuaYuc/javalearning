package homework.homework7.ques2;

import java.util.Arrays;

public class Student {
    private String name;
    private int age;
    private String classes[];
    private String interests[];

    public Student(String name, int age, String[] classes, String[] interests) {
        this.name = name;
        this.age = age;
        this.classes = classes;
        this.interests = interests;
    }
    public void getAllInfom(){
        System.out.println("姓名："+name+" 年龄"+age+" 参加的课程"+ Arrays.toString(classes) +" 兴趣"+ Arrays.toString(interests));
    }
}
