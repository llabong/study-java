public class Penguin extends Animal implements Swimmable{
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("펭~ 펭하!");
    }
    
    @Override
    public void swim() {
        System.out.println("황제 펭귄의 수영ㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇ");
    }
}
