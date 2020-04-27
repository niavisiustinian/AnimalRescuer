package com.jetbrains;

public class Food {
    private   String name ;
    private int price;
    private int quantity;
    private int availability;


    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name= name ;
    }
    public int  getPrice(){
        return price;
    }
    public void setPrice(int  price){
        this.price= price ;
    }
    public int  getQuantity(){
        return quantity;
    }
    public void setQuantity(int  quantity){
        this.quantity= quantity ;
    }
    public int  getAvailability(){
        return availability;
    }
    public void setAvailability(int  availability){
        this.availability= availability ;
    }
}
