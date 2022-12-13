package Italian;

public class Pasta {
    double price;

    public void display(){
        System.out.println("White sauce Pasta"+'\n'+"Red Sauce Pasta"+'\n'+"Pink Sauce Pasta");
    }
    public double WhiteSauce(){
        price=150;
        return price;
    }
    public double RedSauce(){
        price=150;
        return price;
    }
    public double PinkSauce(){
        price=180;
        return price;
    }
}