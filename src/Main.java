import practice_AIPC.*;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
//        practice_AIPC.Animal dog =  new practice_AIPC.Dog();
//        practice_AIPC.Animal cat =  new practice_AIPC.Cat();
//
//        dog.walk();
//        dog.eat();
//        dog.speak();
//
//        cat.walk();
//        cat.eat();
//        cat.speak();

        Pet dog = new Dog("백구");
        Pet cat = new Cat("나비");

        Animal[] animals = new Animal[3];
        animals[0] = new Dog("천구");
        animals[1] = new Cat("나방");
        animals[2] = new Tiger("돌");

        for(Animal animal: animals) {
            animal.walk();
            animal.eat();
            animal.speak();
            System.out.println("= = = = = = = = = =");
        }

        dog.play();
        dog.beFriendly();
        cat.play();
        cat.beFriendly();

        Flyable[] flyingThings = { new Bird(), new Airplane()};

        for (Flyable thing: flyingThings) {
            thing.fly();
        }

        Walkable[] walkableThings = { new Human(), new Robot()};

        for (Walkable thing:  walkableThings) {
            thing.walk();
        }

    }
}