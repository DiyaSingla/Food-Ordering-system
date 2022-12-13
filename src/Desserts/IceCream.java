package Desserts;

public class IceCream {
    double price;

    public void display(){
        System.out.println("Butterscotch"+'\n'+"Chocobar"+'\n'+"Choco Dip"+'\n'+"Kulfi");
    }
    public double Butterscotch(){
        price=40;
        return price;
    }
    public double ChocoDip(){
        price=50;
        return price;
    }
    public double Chocobar(){
        price=30;
        return price;
    }
    public double Kulfi(){
        price=50;
        return price;
    }
}
