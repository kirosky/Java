package day11.Demo06;

public class DemoMain {
    public static void main(String[] args) {
        Hero hero =new Hero();
        hero.setName("盖伦");
        hero.setAge(12);
        Weapon weapon=new Weapon("霜之哀伤");
        hero.setWeapon(weapon);
        hero.attack();
    }
}
