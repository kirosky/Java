package day09jicheng.Demo14;

import java.util.ArrayList;

public class DemoMain {
    public static void main(String[] args) {
        Manager manager = new Manager("群主",100);
        Member one=new Member("成员A",0);
        Member two=new Member("成员B",0);
        Member three=new Member("成员C",0);
        manager.display();//100
        one.display();//0
        two.display();//0
        three.display();//0
        System.out.println("====================");
        //群主总共发20块钱，分成3个红包。
        ArrayList<Integer> redList=manager.send(50,3);
        //三个普通成员收红包
        one.receive(redList);
        two.receive(redList);
        three.receive(redList);

        manager.display();//100-20
        //6,6,8
        one.display();//6
        two.display();//6
        three.display();//8

    }
}
