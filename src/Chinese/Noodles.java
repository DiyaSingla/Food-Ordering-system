package Chinese;

public class Noodles {
    double price;
    String size;

    public void display(){
        System.out.println("Hakka Noodles"+'\n'+"Ramen Noodles"+'\n'+"Chow Mein");
    }
    public double Hakka(String size){
        this.size=size;
        if(size.equalsIgnoreCase("Half Plate")){
            price=140;
            return price;
        }
        else{
            price=200;
            return price;
        }
    }
    public double Ramen(String size){
        this.size=size;
        if(size.equalsIgnoreCase("Half Plate")){
            price=250;
            return price;
        }
        else{
            price=350;
            return price;
        }
    }
    public double ChowMein(String size){
        this.size=size;
        if(size.equalsIgnoreCase("Half Plate")){
            price=70;
            return price;
        }
        else{
            price=120;
            return price;
        }
    }

}
