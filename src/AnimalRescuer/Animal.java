package AnimalRescuer;

public class Animal {
    private String name ;
    private int age ;
    private String color;
    private String race ;
    private double weight ;
    private int healthLevel ;
    private int hungerLevel ;
    private int happinessLevel ;
    public void eat(){System.out.print("Eating");}
    public void sleep (){
        System.out.print("Sleeping");
    }
    public void run(){
        System.out.print("Running");
    }
    public void sit(){
        System.out.print("Sitting");
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name= name ;
    }

    public int  getAge(){
        return age;
    }
    public void setAge(int  age){
        this.age= age ;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color= color ;
    }
    public String  getRace(){
        return  race;
    }
    public void setRace(String  race){
        this. race=  race ;
    }

    public double getWeight(){
        return weight;
    }

    public void setWeight(double weight){
        this.weight=weight;
    }
    public int  getHealthLevel(){
        return healthLevel;
    }
    public void setHealthLevel(int  healthLevel){
        this.healthLevel= healthLevel ;
    }
    public int  getHungerLevel(){
        return hungerLevel;
    }
    public void setHungerLevel(int  hungerLevel){
        this.hungerLevel= hungerLevel ;
    }
    public int  getHappinessLevel(){ return happinessLevel; }
    public void setHappinessLevel(int  happinessLevel){
        this.happinessLevel= happinessLevel ;
    }




}
