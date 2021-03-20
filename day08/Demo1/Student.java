package day08.Demo1;
public class Student {
    private int id;
    private String name;
    private int age;
    static String room;
    private static  int idcounte=0;//学号计数器，每当new一个新对象，计数器++
    public Student(){
        this.id=++idcounte;//先加加后赋值
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id=++idcounte;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
