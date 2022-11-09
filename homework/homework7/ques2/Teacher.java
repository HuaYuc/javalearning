package homework.homework7.ques2;

import java.util.Arrays;

public class Teacher {
    private String name;
    private String major;
    private String classes[];
    private int teachAge;

    public Teacher(String name, String major, String[] classes, int teachAge) {
        this.name = name;
        this.major = major;
        this.classes = classes;
        this.teachAge = teachAge;
    }

    public void getAllInform(){
        System.out.println("姓名"+name+" 专业"+major+" 课程"+ Arrays.toString(classes) +" 教龄"+teachAge);
    }
}
