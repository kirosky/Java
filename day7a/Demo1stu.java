package cn.day7a;



public class Demo1stu {
    public static void main(String[] args) {
        Student stu1=new Student();
        stu1.setAge(12);
        stu1.setName("dili");
        System.out.println("name: "+stu1.getName()+",age:"+stu1.getAge());

        Student stu2=new Student("ss",34);

        System.out.println("name: "+stu2.getName()+",age:"+stu2.getAge());

    }
}
