package com.jetbrains;

public class Main {
        public static void main(String[] args) {
            Dog ares = new Dog();
            ares.setName("ares");
            ares.setAge(1);
            ares.setColor("white");
            ares.setRace("akita");
            ares.setWeight(12);
            ares.setHappinessLevel(10);
            ares.setHealthLevel(10);
            ares.setHungerLevel(10);

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



            System.out.println(ares.getName());
            System.out.println(ares.getAge());
            System.out.println(ares.getColor());
            System.out.println(ares.getRace());
            System.out.println(ares.getWeight());
            System.out.println(ares.getHappinessLevel());
            System.out.println(ares.getHealthLevel());
            System.out.println(ares.getHungerLevel());

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

