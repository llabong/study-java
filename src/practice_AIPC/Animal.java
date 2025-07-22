package practice_AIPC;

public abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void walk() {
        System.out.println("동물이 걷습니다.");
    }

    public void eat() {
        System.out.println("동물이 먹이를 먹습니다.");
    }

    public abstract void speak();

    public void introduce() {
        System.out.printf("나의 이름은 %s이야", name);
    }

}
