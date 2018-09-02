/*--------------5.10    static关键字--------------------*/

/*static声明全局变量的意义*/
package  learn.Static;

public class StaticDemo02 {
    public static void  main(String[] args){
        Person  per1    =   new Person("张三",14);
        Person  per2    =   new Person("李四",15);
        //per1.country    =   "B城";     //对象1调用类中的属性并改变，static是全局变量的话，就能改变下面所有对应的属性------意义
        Person.country  =   "C城";       //类属性调用：类名直接调用static属性
        per1.info();
        per2.info();
    }
}

class   Person{
    String  name;
    int age;
    //String country  =   "A城";       //定义country变量，no static
    static String   country =   "A城";       // 定义static的country

    public Person(String    name ,  int     age){   //构造方法：实例化对象并赋值
        this.name   =   name;
        this.age    =   age;
    }

    public  void   info(){          //main函数中调用此方法打印信息
        System.out.println("姓名："    +   this.name   +   "   年龄："   +   this.age    +   "    城市："   +   country);
    }
}




