package cn.day7;

public class Demo2student {
    public static void main(String[] args) {
        Student stu =new Student();//new对象就是在调用构造方法，无参构造
        Student stu2 =new Student("cc",22);//全参构造
        System.out.println("name "+stu2.getName()+", age: "+ stu2.getAge());
        //如果需要改变对象当中成员变量数据内容，仍然需要使用setXxx方法。
        stu2.setAge(45);//改变年龄
        System.out.println("name "+stu2.getName()+", age: "+ stu2.getAge());
    }
}
