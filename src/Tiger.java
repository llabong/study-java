public class Tiger extends Animal {
    public Tiger(String name) {
        super(name);
    }

    @Override
    public void walk() {
        System.out.println("호랑이랑 호랑호랑하게 걸어다닙니다.");
    }

    @Override
    public void eat() {
        System.out.println("저거.. 너가 키우는 순록 아니냐??");
    }

    @Override
    public void speak() {
        System.out.println("으르롱");
    }
}
