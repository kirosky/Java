package day09jicheng.Demo14;

import java.util.ArrayList;
import java.util.Random;
//普通成员
public class Member extends User{
    public Member(){

    }

    public Member(String name, int money) {
        super(name, money);
    }

    public void receive(ArrayList<Integer> list){
        //从红包中随便抽取一个给我自己；
        //随机获取一个集合当中的索引
        int index=new Random().nextInt(list.size());
        int delta = list.remove(index);
        //当前成员自己本类有多少钱。
        int money =super.getMoney();
        //加法，并且重新设置回去
        setMoney(money+delta);
    }
}
