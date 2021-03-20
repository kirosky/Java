package day10.Demo07;

public class DemoMain {
    public static void main(String[] args) {
        //创建一个笔记本电脑
        Computer computer=new Computer();
        computer.powerOn();
       // Mouse mouse =new Mouse();
        //首先进行向上转型
        USB usbmouse=new Mouse();//多态写法USB usb=new Mouse();//
        //参数是USB类型，我正好传递进去的USB鼠标
        computer.useDevice(usbmouse);

        //创建一个USB键盘
        Keyboard keyboard=new Keyboard();//没有使用多态
        //方法参数是USB类型，传递进去的是实现类对象
        //使用子类对象，匿名对象也可以
        computer.useDevice(keyboard);//正确写法！也发生了向上转型
       // computer.useDevice(new Keyboard());//正确写法！
        computer.powerOff();
        System.out.println("++++++++++++++");
        method(10.0);
        method(10);
    }
    public static void method(double num){
        System.out.println(num);

    }
}
