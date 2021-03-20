package cn.day6;
/*
* 问题描述：定义Person的年龄时，无法阻止不合理的数值被设置进来
* 解决方法：用private 关键字将需要保护的成员变量进行修饰。
* 一旦使用了private进行修饰，那么本类当中仍然可以随意访问。
* 但是超出了本类范围之外就不能直接访问了。
*访问private成员变量，定义一对Getter/Setter方法；
* 必须叫setXxx或者getXxx命名规则、
* 对于Getter来说，不能有参数，返回值类型和成员变量对应。
* 对于Setter来说，不能有返回值，参数类型和成员变量对应。
*
* 不合理的数据不能访问，提高代码安全性
* */
public class Person {
    String name;
    private int age;
    //int age;

    public void show(){
        System.out.println("I am "+name+", age: "+age);
    }
    //设置方法到手，private存在无法在另一个类中运行
    public void setAge(int num){//成员方法用于向age设置数据。
        if(num<100&&num>=9){
        age=num;
        }else{
            System.out.println("error不合理");
        }
    }
    public int getAge(){//成员方法，用于获取age数据。
        return age;
    }
}
