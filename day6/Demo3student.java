package cn.day6;

public class Demo3student {
    public static void main(String[] args) {
        Student stu=new Student();
        stu.setName("cc");
        stu.setAge(20);
        stu.setMale(true);
        System.out.println("name: "+stu.getName());
        System.out.println("age: "+stu.getAge());
        System.out.println("male: "+stu.isMale());
    }
}
