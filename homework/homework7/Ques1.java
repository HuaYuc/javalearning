package homework.homework7;



public class Ques1 {
    /**
     * 练习：创建java自定义类
     */
    //创建Person封闭类
    public static class Person{
        private int age=0;
        private String sex=null;
        private  String name=null;
        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public int getAge() {
            return age;
        }

        public String getSex() {
            return sex;
        }
    }

    //创建Animal封闭类
    public static class Animal{
        private int age=0;
        private String type=null;

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }



}
