package day08.Demo1;
/*一旦用了static关键字，那么这样的内容不再属于对象自己，而是属于类的，所以凡是本类的对象，都共享同一份。*/
public class Demo01Static {
    public static void main(String[] args) {
        Student one =new Student("aaa",18);
        one.room="101";
        Student two=new Student("cccc",22);

        System.out.println("姓名："+one.getName()
                +"年龄："+one.getAge()+" 教室："+one.room
                +"学号："+one.getId());
        System.out.println("姓名："+two.getName()
                +"年龄："+two.getAge()+" 教室："+two.room
                +"学号："+two.getId());

    }
}
