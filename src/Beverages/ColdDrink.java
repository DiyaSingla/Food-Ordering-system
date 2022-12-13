package Beverages;

public class ColdDrink {
    double price;
    String size;

    public void display(){
        System.out.println("Coke"+'\n'+"Pepsi"+'\n'+"Sprite"+'\n'+"Thumbs Up");
    }
    public double Coke(String size){
        this.size= size;
        if(size.equalsIgnoreCase("regular")){
            price=75;
            return price;
        }
        else{
            price=100;
            return price;
        }
    }
    public double Pepsi(String size){
        this.size= size;
        if(size.equalsIgnoreCase("regular")){
            price=70;
            return price;
        }
        else{
            price=95;
            return price;
        }
    }
    public double Sprite(String size){
        this.size= size;
        if(size.equalsIgnoreCase("regular")){
            price=65;
            return price;
        }
        else{
            price=90;
            return price;
        }
    }
    public double ThumbsUp(String size){
        this.size= size;
        if(size.equalsIgnoreCase("regular")){
            price=65;
            return price;
        }
        else{
            price=90;
            return price;
        }
    }
}
