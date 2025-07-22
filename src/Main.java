import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
//        Animal dog =  new Dog();
//        Animal cat =  new Cat();
//
//        dog.walk();
//        dog.eat();
//        dog.speak();
//
//        cat.walk();
//        cat.eat();
//        cat.speak();

        Animal[] animals = new Animal[3];
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Tiger();

        for(Animal animal: animals) {
            animal.walk();
            animal.eat();
            animal.speak();
            System.out.println("= = = = = = = = = =");
        }

    }
}