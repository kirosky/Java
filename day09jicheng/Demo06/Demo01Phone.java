package day09jicheng.Demo06;

public class Demo01Phone {
    public static void main(String[] args) {
        Phone phone=new Phone();
        phone.call();
        phone.send();
        phone.show();
        System.out.println("===============");
        NewPhone np=new NewPhone();
        np.call();
        np.send();
        np.show();
    }
}
