package Chinese;

public class Momos {
    double price;
    String size;

    public void display(){
        System.out.println("Steamed Momos"+'\n'+"Fried Momos"+'\n'+"Tandoori Momos");
    }
    public double Steamed(String size){
        this.size=size;
        if(size.equalsIgnoreCase("Half Plate")){
            price=50;
            return price;
        }
        else{
            price=80;
            return price;
        }
    }
    public double Fried(String size){
        this.size=size;
        if(size.equalsIgnoreCase("Half Plate")){
            price=60;
            return price;
        }
        else{
            price=100;
            return price;
        }
    }
    public double Tandoori(String size){
        this.size=size;
        if(size.equalsIgnoreCase("Half Plate")){
            price=70;
            return price;
        }
        else{
            price=130;
            return price;
        }
    }
}
