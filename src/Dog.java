public class Dog extends Animal{

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
}
