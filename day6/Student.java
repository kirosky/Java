package cn.day6;
/*
* 对于基本类型当中boolean中，Getter方法一定要写成isXxx的形式,而setXxx规则不变。
*
* */
public class Student {
    private String name;
    private int age;
    private  boolean male;
    public void setMale(boolean b){
        male=b;
    }
    public boolean isMale(){
        return male;
    }
    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }

    public void setAge(int num){
        age=num;
    }
    public int getAge(){
        return age;
    }
}
