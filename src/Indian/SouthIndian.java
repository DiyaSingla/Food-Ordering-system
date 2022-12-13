package Indian;

public class SouthIndian {
    double price;

    public void display(){
        System.out.println("Plain Dosa"+'\n'+"Masala Dosa"+'\n'+"Rawa Dosa"+'\n'+"Idli"+'\n'+"Vada");
    }

    public double PlainDosa(){
        price=120;
        return price;
    }
    public double MasalaDosa(){
        price=150;
        return price;
    }
    public double RawaDosa(){
        price=150;
        return price;
    }
    public double Idli(){
        price=80;
        return price;
    }
    public double Vada(){
        price=100;
        return price;
    }
}
