package Desserts;

public class Cakes {
    double price;
    String size;
    public double RedVelvet(String size){
        this.size=size;
        if(size.equalsIgnoreCase("half")){
            price=550;
            return price;
        }
        else{
            price=1000;
            return price;
        }
    }
    public double BlackForest(String size){
        this.size=size;
        if(size.equalsIgnoreCase("half")){
            price=350;
            return price;
        }
        else{
            price=650;
            return price;
        }
    }

    public void display(){
        System.out.println("Black Forest Cake"+'\n'+"Choco Truffle Cake"+'\n'+"Pineapple Cake"+'\n'+"Red Velvet Cake");
    }
    public double ChocoTruffle(String size){
        this.size=size;
        if(size.equalsIgnoreCase("half")){
            price=450;
            return price;
        }
        else{
            price=900;
            return price;
        }
    }
    public double Pineapple(String size){
        this.size=size;
        if(size.equalsIgnoreCase("half")){
            price=300;
            return price;
        }
        else{
            price=550;
            return price;
        }
    }
}
