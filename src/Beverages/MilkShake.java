package Beverages;

public class MilkShake {
    double price;
    String size;

    public void display(){
        System.out.println("Chocolate Milkshake"+'\n'+"Mango Milkshake"+'\n'+"Strawberry Milkshake"+'\n'+"Vanilla Milkshake");
    }
    public double Chocolate(String size){
        this.size=size;
        if(size.equalsIgnoreCase("regular")){
            price=80;
            return price;
        }
        else{
            price=120;
            return price;
        }
    }
    public double Mango(String size){
        this.size=size;
        if(size.equalsIgnoreCase("regular")){
            price=70;
            return price;
        }
        else{
            price=110;
            return price;
        }
    }
    public double Strawberry(String size){
        this.size=size;
        if(size.equalsIgnoreCase("regular")){
            price=60;
            return price;
        }
        else{
            price=100;
            return price;
        }
    }
    public double Vanilla(String size){
        this.size=size;
        if(size.equalsIgnoreCase("regular")){
            price=50;
            return price;
        }
        else{
            price=90;
            return price;
        }
    }
}
