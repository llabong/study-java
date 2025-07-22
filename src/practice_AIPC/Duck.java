package practice_AIPC;

public class Duck extends Animal implements Swimmable, Flyable {
    public Duck(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("꽥꽥!");
    }

    @Override
    public void fly() {
        System.out.println("오리 날다. 날아올라~ 저 하늘~");
    }

    @Override
    public void swim() {
        System.out.println("오리 헤엄치다. 헤~엄 헤~엄 나는 아쿠아맨~");
    }
}
