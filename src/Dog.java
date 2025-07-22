public class Dog extends Animal implements Pet{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void walk() {
        System.out.println("강아지가 총총총총총~ 언니를 따라가요");
    }

    @Override
    public void eat() {
        System.out.println("강아지가 개껌과 언니가 부르는 소리를 씹습니다.");
    }

    @Override
    public void speak() {
        System.out.println("멍멍!");
    }

    @Override
    public void play() {
        System.out.println("공놀이를 합니다!");
    }

    @Override
    public void beFriendly() {
        System.out.println("꼬리를 흔들며 반깁니다.");
    }
}
