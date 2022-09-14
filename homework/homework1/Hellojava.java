package homework.homework1;

public class Hellojava {
    /*第一部分：命名规范*/
    /*
    变量和函数命名采用小驼峰命名法length getLength
    常量命名采用全字母大写命名LEN
    包名全部小写，io，awt。
    类名第一个字母要大写，HelloWorldApp

    controller层主要用于存放接口，负责处理前端发送的请求,
    方法上面需要添加Swagger注解，方便阅读

    所有的业务逻辑代码都写在Service层。
    所有的方法也请注释上作者，方法描述和参数

    DAO层
    */

    /*第二部分：idea快捷键*/

    /*ctrl+/,ctrl+shift+/ 注释
    ctrl+f 查找
    ctrl+r 替换
    alt+enter 自动修补
    + .var 自动分配变量名
    main
    sout
    fori
    */

//    Hellojava程序
public static void main(String[] args) {
    
    //    Hellojava程序
    System.out.println("Hellojava!");
    System.out.println("姓名：时啟轩");
    System.out.println("性别：男");
    System.out.println("籍贯：河南");
    System.out.println("住址：武汉大学");
}
}
