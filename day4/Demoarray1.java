package cn.day4;
/*
*  标准格式：
* 数据类型[] 数据名称 =new 数据类型[]{元素1，元素2...};
* 省略格式：
* 数据类型[] 数据名称 ={元素1，元素2...};
*
* 注意：
* 静态初始化没指定长度，会自动推算得到长度
* 静态初始化标准格式可以拆分成两个步骤
* 动态初始化也可以拆分成两个步骤
* 静态初始化一旦省略格式，就不能拆分成两个步骤
*
*
*
* */
public class Demoarray1 {
    public static void main(String[] args) {
        //省略格式：
        int[] arraya={10,20,30};
        //静态初始化标准格式拆分成两个步骤
        int[] arrayb;
        arrayb=new int[]{1,2,3};
        //动态初始化也可以拆分成两个步骤
        int[] arrayc;
        arrayc=new int[3];
        //省略不能拆成两个
    }
}
