package homework.homework7.ques3;

public class Student extends Person{
    protected String school="pku";
    public String getInfo(){
        return "Name"+name+"\nage:"+age+"\nschool:"+school;
    }
}
