package com.jetbrains;

public class Main {
        public static void main(String[] args) {
            Dog dog = new Dog();
            Girl girl=new Girl();
            Food food=new Food();
            Recreation recreation= new Recreation();
            Vet vet= new Vet();
            System.out.println(dog.name);
            System.out.println(dog.age);
            System.out.println(dog.healthLevel);
            System.out.println(dog.happinessLevel);
            System.out.println(dog.hungerLevel);
            System.out.println(dog.color);
            System.out.println(dog.race);
            System.out.println(dog.weight);
            System.out.println(girl.name);
            System.out.println(girl.money);
            System.out.println(food.availability);
            System.out.println(food.name);
            System.out.println(food.price);
            System.out.println(food.quantity);
            System.out.println(recreation.name);
            System.out.println(vet.name);
            System.out.println(vet.specialty);
        }


}

