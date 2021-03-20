package day09jicheng.Demo14;

import java.util.ArrayList;

//群主
public class Manager extends User{

    public Manager(){

        //super();
    }
    public Manager(String name, int money) {
        super(name, money);
    }
    public ArrayList<Integer> send(int totalmoney,int count){
        //需要集合，存储若干个红包的金额
        ArrayList<Integer> redList =new ArrayList<>();
        //看群主多少钱
        int leftmoney=super.getMoney();
        if (totalmoney>leftmoney){
            System.out.println("余额不足。。。");
            return redList;
        }
        //扣钱重新设置余额
        super.setMoney(leftmoney-totalmoney);
        //发红包需要平均拆分成为count份
        int avg=totalmoney/count;
        int mod=totalmoney%count;//余数，也就是剩下的零头
        //除不开的零头，包在最后一个红包当中。
        //下面红包一个一个放到集合当中
        for (int i = 0; i < count-1; i++) {
            redList.add(avg);
            
        }
        int last=avg+mod;
        redList.add(last);
        return redList;

        

    }
}
