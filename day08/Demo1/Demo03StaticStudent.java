package day08.Demo1;

public class Demo03StaticStudent {
    public static void main(String[] args) {
        Student.room="102";
        Student one= new Student("zzz",6);
        System.out.println("姓名："+one.getName());
        System.out.println("年龄："+one.getAge());
        System.out.println("教室："+Student.room);

        System.out.println("====================");
        Student two =new Student("qqq",7);
        System.out.println("姓名："+two.getName());
        System.out.println("年龄："+two.getAge());
        System.out.println("教室："+Student.room);

    }
}
