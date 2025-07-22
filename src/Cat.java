public class Cat extends Animal {
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
}
