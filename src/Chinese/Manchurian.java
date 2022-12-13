package Chinese;

public class Manchurian {
    double price;

    public void display(){
        System.out.println("Paneer Manchurian"+'\n'+"Veg Gravy Mnchurian"+'\n'+"Chicken Gravy Manchurian");
    }
    public double Paneer(){
        price=190;
        return price;
    }
    public double VegGravy(){
        price=150;
        return price;
    }
    public double ChickenGravy(){
        price=200;
        return price;
    }
}
