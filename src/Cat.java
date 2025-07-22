public class Cat extends Animal implements Pet {
    @Override
    public void walk() {
        System.out.println("꽁꽁 얼어붙은 한강 위로 고양이가 걸어다닙니다.");
    }

    @Override
    public void eat() {
        System.out.println("츄르냥~ 참치냥~");
    }

    @Override
    public void speak() {
        System.out.println("야옹~");
    }

    @Override
    public void play() {
        System.out.println("실타래를 가지고 놉니다!");
    }

    @Override
    public void beFriendly() {
        System.out.println("부비부비합니다.");
    }
}
