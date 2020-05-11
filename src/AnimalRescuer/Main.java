package AnimalRescuer;

public class Main {public static void main(String[] args) {
   Dog dog = new Dog();
    dog.setName("dog");
    dog.setAge(1);
    dog.setColor("white");
    dog.setRace("akita");
    dog.setWeight(12);
    dog.setHappinessLevel(10);
    dog.setHealthLevel(10);
    dog.setHungerLevel(10);

    Cat pisica= new Cat();
    pisica.setName("miau");
    pisica.setAge(2);

    Food purina= new CatFood();
    purina.setName("purina");

    Food pedigree= new DogFood();
    pedigree.setName("pedigree");


    Girl girl=new Girl();
    girl.setName("ana");
    girl.setMoney(100);

    Food food=new Food();
    food.setName("pedigree");
    food.setPrice(10);
    food.setAvailability(100);
    food.setQuantity(100);

    Recreation recreation= new Recreation();
    recreation.setName("running");

    Vet vet= new Vet();
    vet.setName("ioan");
    vet.setSpecialty("dogtor");



    System.out.println(dog.getName());
    System.out.println(dog.getAge());
    System.out.println(dog.getColor());
    System.out.println(dog.getRace());
    System.out.println(dog.getWeight());
    System.out.println(dog.getHappinessLevel());
    System.out.println(dog.getHealthLevel());
    System.out.println(dog.getHungerLevel());

    System.out.println(girl.getName());
    System.out.println(girl.getMoney());

    System.out.println(food.getName());
    System.out.println(food.getPrice());
    System.out.println(food.getAvailability());
    System.out.println(food.getQuantity());

    System.out.println(recreation.getName());

    System.out.println(vet.getName());
    System.out.println(vet.getSpecialty());




}
}
