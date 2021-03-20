package cn.day9;
//定义一个数组，用来储存3个Person对象
//数组有一个缺点，一旦创建，程序运行期间长度不可以发生改变
public class Demo1arraylist {
    public static void main(String[] args) {
        //首先创建一个长度为3的数组，里面存放Person类型的对象
        Person[] array=new Person[3];
        Person one=new Person("迪丽热巴",18);
        Person two =new Person ("西施",34);
        Person three=new Person("貂蝉",22);
        //将one当中的地址值赋值到数组的0号元素位置
        array[0]=one;
        array[1]=two;
        array[2]=three;
        System.out.println(array[0]);//地址值
        System.out.println(array[1]);//地址值
        System.out.println(array[2]);//地址值
        Person person=array[1];
        System.out.println(person.getName());

    }
}
