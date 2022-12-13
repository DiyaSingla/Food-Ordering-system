package Desserts;

public class Sweets {
    double price;

    public void display(){
        System.out.println("Rasgulla"+'\n'+"Rasmalai"+'\n'+"Jalebi");
    }
    public double Rasgulla(){
        price=350;
        return price;
    }
    public double Rasmalai(){
        price=40;
        return price;
    }
    public double Jalebi(){
        price=200;
        return price;
    }
}
