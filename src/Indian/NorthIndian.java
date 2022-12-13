package Indian;

public class NorthIndian {
    double price;

    public void display(){
        System.out.println("Chole Bhature"+'\n'+"Pav Bhaji"+'\n'+"Dal Makhani Naan"+'\n'+"Dal Bati Churma"+'\n'+"Biriyani");
    }
    public double CholeBhature(){
        price=200;
        return price;
    }
    public double PavBhaji(){
        price=150;
        return price;
    }
    public double DalMakhaniNaan(){
        price=170;
        return price;
    }
    public double DalBatiChurma(){
        price=200;
        return price;
    }
    public double Biriyani(){
        price=250;
        return price;
    }
}
