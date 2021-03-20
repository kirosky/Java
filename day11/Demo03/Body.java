package day11.Demo03;

public class Body {//外部类
    public class Heart{
        public void beat(){
            System.out.println("心脏跳动：咚咚");
            System.out.println("I'am:"+name);
        }
    }
    //外部类的成员变量
    private String name;
    //外部类方法
    public void methodBody(){
        System.out.println("外部类方法");
        Heart heart=new Heart();
        heart.beat();
        //new Heart().beat();匿名对象

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
