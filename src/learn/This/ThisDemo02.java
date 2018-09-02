/*--------------5.9 this关键字-----------------*/

/*定义name和age；通过构造方法赋值，取得信息(getter方法)；调用方法取得实例化的数据*/
package learn.This;

public class ThisDemo02 {
    public  static void main(String []  args)   {
        Person per = new Person("张三",   20);    //调用构造方法赋值
        System.out.println(per.getInfo());      //取得信息
    }
}

class   Person{
    private String  name;
    private int age;

    public Person(String   name,   int age){       //构造方法--赋值
       this.name = name;   //this的应用-调用类中的属性
       this.age = age;    //this的应用
    }

    public  String getInfo(){
        return  "姓名："   +   name    +   "，年龄："  +   age;    //Java的装箱机制：int自动转为String
    }
}


