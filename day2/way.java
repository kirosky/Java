package cn.day2;
/*
定义格式
public static void 方法名称（）{
方法体
}
调用格式：
方法名称（）；
 */
//
//方法定义的先后顺序无所谓
//方法定义在类中，方法定义必须紧挨，不能在一个方法内部定义另一个方法
//方法定义后，自己不会执行，执行要调用方法，单独，赋值，打印调用
//有返回值 必须写上“return +值返回值；”
//返回值类型，必须和方法的返回值类型，对应起来
//对于void没有返回值的方法，不能写return后面的返回值，只能写return自己。return;结束方法执行
//有多个return，但是必须保证同时只有一个会被执行到
public class way {
    public static void main(String[] args) {
        printstars();
    }
    public static void printstars() {

        for (int j= 0; j < 5; j++) {//5.fori  快速写
            for (int i = 0; i < 20; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

