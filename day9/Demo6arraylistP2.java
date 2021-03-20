package cn.day9;
/*自定义4个学生对象，添加到集合，并遍历
1.自定义学生类。四个部分
2.创建一个集合，用来储存学生对象，泛型；<Student>
3.根据类，创建4个学生对象。
4.将4个学生对象添加到集合当中add
5.遍历集合：for size get

* */
import java.util.ArrayList;

public class Demo6arraylistP2 {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        Student stu1=new Student("景甜",23);
        Student stu2=new Student("唐嫣",25);
        Student stu3=new Student("柳岩",28);
        Student stu4=new Student("高圆圆",27);
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);
        for (int i = 0; i < list.size(); i++) {
            Student s=list.get(i);
            System.out.println("第"+(i+1)+"个学生："+s.getNmae()+". 年龄："+s.getAge());

        }

    }
}
