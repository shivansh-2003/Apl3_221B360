public class LakeDuck extends Duck implements Flyable, Quackable {
    @Override
    public void fly() {
        System.out.println("Lake Duck flies.");
    }

    @Override
    public void quack() {
        System.out.println("Lake Duck quacks.");
    }
}