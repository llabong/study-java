public class Zoo {
    public static void main(String[] args) {
        Animal[] animals = {
                new Duck("도널드"),
                new Penguin("펭수")
        };

        for (Animal animal : animals) {
            animal.introduce();
            animal.speak();
        }

        System.out.println("------------");
    }
}
