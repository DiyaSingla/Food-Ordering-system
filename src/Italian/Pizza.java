package Italian;

public class Pizza {
    double price;
    String size;

    public void display(){
        System.out.println("Margherita"+'\n'+"Farm House Pizza"+'\n'+"Deluxe Veggie Pizza"+'\n'+"Indie Tandoori Paneer Pizza");
    }
    public double Margherita(String size){
        this.size= size;
        if(size.equalsIgnoreCase("regular")){
            price=80;
            return price;
        }
        else if(size.equalsIgnoreCase("medium")){
            price=130;
            return price;
        }
        else{
            price=180;
            return price;
        }
    }
    public double FarmHouse(String size){
        this.size= size;
        if(size.equalsIgnoreCase("regular")){
            price=150;
            return price;
        }
        else if(size.equalsIgnoreCase("medium")){
            price=200;
            return price;
        }
        else{
            price=250;
            return price;
        }
    }
    public double DeluxeVeggie(String size){
        this.size= size;
        if(size.equalsIgnoreCase("regular")){
            price=250;
            return price;
        }
        else if(size.equalsIgnoreCase("medium")){
            price=300;
            return price;
        }
        else{
            price=350;
            return price;
        }
    }
    public double IndiTandooriPaneer(String size){
        this.size= size;
        if(size.equalsIgnoreCase("regular")){
            price=300;
            return price;
        }
        else if(size.equalsIgnoreCase("medium")){
            price=350;
            return price;
        }
        else{
            price=400;
            return price;
        }
    }
}
