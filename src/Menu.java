import Beverages.*;
import Chinese.*;
import Desserts.*;
import Indian.*;
import Italian.*;
import java.util.*;

public class Menu{
    double amt=0;
    int qty=0;
    double total=0;
    String size;
    Scanner sc= new Scanner(System.in);
    NorthIndian ni = new NorthIndian();
    SouthIndian si= new SouthIndian();
    Pizza pi= new Pizza();
    Pasta pa= new Pasta();
    Momos mo = new Momos();
    Noodles no= new Noodles();
    Manchurian ma = new Manchurian();
    ColdDrink cd= new ColdDrink();
    MilkShake ms= new MilkShake();
    Sweets sw= new Sweets();
    Cakes ca= new Cakes();
    IceCream ic= new IceCream();

    void Indian(){
        System.out.println("                            INDIAN");
        System.out.println("    North Indian                            South Indian");
        System.out.println("1. Chole Bhature       "+ ni.CholeBhature()+"             6. Plain Dosa       "+ si.PlainDosa());
        System.out.println("2. Pav Bhaji           "+ ni.PavBhaji()+"             7. Masala Dosa      "+ si.MasalaDosa());
        System.out.println("3. Dal Makhani Naan    "+ ni.DalMakhaniNaan()+"             8. Rawa Dosa        "+ si.RawaDosa());
        System.out.println("4. Dal Bati Churma     "+ ni.DalBatiChurma()+"             9. Idli (4 pcs)      "+ si.Idli());
        System.out.println("5. Biriyani            "+ ni.Biriyani()+"            10. Vada (2 pcs)     "+ si.Vada());
        System.out.println();
    }

    void Italian(){
        System.out.println("                            ITALIAN");
        System.out.println();
        System.out.println("                     PIZZA");
        System.out.println("                             Regular      Medium       Large");
        System.out.println("1. Margherita                   "+pi.Margherita("regular")+"       "+pi.Margherita("medium")+"       "+pi.Margherita("large"));
        System.out.println("2. Farm House                  "+pi.FarmHouse("regular")+"       "+pi.FarmHouse("medium")+"       "+pi.FarmHouse("large"));
        System.out.println("3. Deluxe Veggie               "+pi.DeluxeVeggie("regular")+"       "+pi.DeluxeVeggie("medium")+"       "+pi.DeluxeVeggie("large"));
        System.out.println("4. Indie Tandoori Paneer       "+pi.IndiTandooriPaneer("regular")+"       "+pi.IndiTandooriPaneer("medium")+"       "+pi.IndiTandooriPaneer("large"));
        System.out.println();
        System.out.println("                    PASTA");
        System.out.println("5. White Sauce Pasta         "+pa.WhiteSauce());
        System.out.println("6. Red Sauce Pasta           "+pa.RedSauce());
        System.out.println("7. Pink Sauce Pasta          "+pa.PinkSauce());
        System.out.println();
    }

    void Chinese(){
        System.out.println("                        CHINESE");
        System.out.println();
        System.out.println("               MOMOS");
        System.out.println("                       Half Plate      Full Plate");
        System.out.println("                        (5 Pcs)         (9 Pcs)");
        System.out.println("1. Steamed Momos          "+mo.Steamed("half plate")+"             "+mo.Steamed("full"));
        System.out.println("2. Fried Momos            "+mo.Fried("half plate")+"            "+mo.Fried("full"));
        System.out.println("3. Tandoori Momos         "+mo.Tandoori("half plate")+"            "+mo.Tandoori("full"));
        System.out.println();
        System.out.println("              NOODLES");
        System.out.println("                       Half Plate        Full Plate");
        System.out.println("4. Chow Mein               "+no.ChowMein("half plate")+"             "+no.ChowMein("full"));
        System.out.println("5. Hakka Noodles          "+no.Hakka("half plate")+"             "+no.Hakka("full"));
        System.out.println("6. Ramen Noodles          "+no.Ramen("half plate")+"             "+no.Ramen("full"));
        System.out.println();
        System.out.println("              MANCHURIAN");
        System.out.println("7. Paneer Manchurian               "+ma.Paneer());
        System.out.println("8. Veg Gravy Manchurian            "+ma.VegGravy());
        System.out.println("9. Chicken Gravy Manchurian        "+ma.ChickenGravy());
        System.out.println();
    }

    void Beverages(){
        System.out.println("                        BEVERAGES");
        System.out.println();
        System.out.println("               COLD DRINKS");
        System.out.println("                Regular      Large");
        System.out.println("1. Coke          "+cd.Coke("regular")+"        "+cd.Coke("large"));
        System.out.println("2. Pepsi         "+cd.Pepsi("regular")+"         "+cd.Pepsi("large"));
        System.out.println("3. Sprite        "+cd.Sprite("regular")+"         "+cd.Sprite("large"));
        System.out.println("4. Thumbs Up     "+cd.ThumbsUp("regular")+"         "+cd.ThumbsUp("large"));
        System.out.println();
        System.out.println("               MILK SHAKES");
        System.out.println("                      Regular       Large");
        System.out.println("5. Chocolate Shake      "+ms.Chocolate("regular")+"        "+ms.Chocolate("large"));
        System.out.println("6. Mango Shake          "+ms.Mango("regular")+"        "+ms.Mango("large"));
        System.out.println("7. Strawberry Shake     "+ms.Strawberry("regular")+"        "+ms.Strawberry("large"));
        System.out.println("8. Vanilla Shake        "+ms.Vanilla("regular")+"         "+ms.Vanilla("large"));
        System.out.println();
    }

    void Desserts(){
        System.out.println("                        DESSERTS");
        System.out.println();
        System.out.println("                  SWEETS");
        System.out.println("1. Rasgulla (per kg)         "+sw.Rasgulla());
        System.out.println("2. Jalebi   (per kg)         "+sw.Jalebi());
        System.out.println("3. Rasmalai (per piece)      "+sw.Rasmalai());
        System.out.println();
        System.out.println("               CAKES");
        System.out.println("                        Half kg      Full kg");
        System.out.println("4. Pineapple Cake         "+ca.Pineapple("half")+"       "+ca.Pineapple("full"));
        System.out.println("5. Black Forest Cake      "+ca.BlackForest("half")+"       "+ca.BlackForest("full"));
        System.out.println("6. Choco Truffle Cake     "+ca.ChocoTruffle("half")+"       "+ca.ChocoTruffle("full"));
        System.out.println("7. Red Velvet Cake        "+ca.RedVelvet("half")+"       "+ca.RedVelvet("full"));
        System.out.println();
        System.out.println("          ICE CREAMS");
        System.out.println("8. Chocobar            "+ic.Chocobar());
        System.out.println("9. Butterscotch        "+ic.Butterscotch());
        System.out.println("10. Choco Dip           "+ic.ChocoDip());
        System.out.println("11. Kulfi               "+ic.Kulfi());
        System.out.println();
    }

    void display(int choice){
        int ch;
        switch(choice){
            case 1:
                Indian();
                ch=order();
                qty=getQty();
                switch(ch){
                    case 1:
                      amt=ni.CholeBhature()*qty;
                        break;
                    case 2:
                      amt=ni.PavBhaji()*qty;
                        break;
                    case 3:
                        amt=ni.DalMakhaniNaan()*qty;
                        break;
                    case 4:
                        amt=ni.DalBatiChurma()*qty;
                        break;
                    case 5:
                        amt=ni.Biriyani()*qty;
                        break;
                    case 6:
                        amt=si.PlainDosa()*qty;
                        break;
                    case 7:
                        amt=si.MasalaDosa()*qty;
                        break;
                    case 8:
                        amt=si.RawaDosa()*qty;
                        break;
                    case 9:
                        amt=si.Idli()*qty;
                        break;
                    case 10:
                        amt=si.Vada()*qty;
                        break;
                    default:
                        System.out.println("Invalid Choice");
                        break;
                }
                bill(amt);
                break;

            case 2:
                Italian();
                ch=order();
                switch(ch){
                    case 1:
                        size= getSize(2);
                        qty=getQty();
                        amt=pi.Margherita(size)*qty;
                        break;
                    case 2:
                        size= getSize(2);
                        qty=getQty();
                        amt=pi.FarmHouse(size)*qty;
                        break;
                    case 3:
                        size= getSize(2);
                        qty=getQty();
                        amt=pi.DeluxeVeggie(size)*qty;
                        break;
                    case 4:
                        size= getSize(2);
                        qty=getQty();
                        amt=pi.IndiTandooriPaneer(size)*qty;
                        break;
                    case 5:
                        qty=getQty();
                        amt=pa.WhiteSauce()*qty;
                        break;
                    case 6:
                        qty=getQty();
                        amt=pa.RedSauce()*qty;
                        break;
                    case 7:
                        qty=getQty();
                        amt=pa.PinkSauce()*qty;
                        break;
                    default:
                        System.out.println("Invalid Choice");
                }
                bill(amt);
                break;
            case 3:
                Chinese();
                ch=order();
                switch(ch){
                    case 1:
                        size= getSize(3);
                        qty= getQty();
                        amt= mo.Steamed(size)*qty;
                        break;
                    case 2:
                        size= getSize(3);
                        qty= getQty();
                        amt= mo.Fried(size)*qty;
                        break;
                    case 3:
                        size= getSize(3);
                        qty= getQty();
                        amt= mo.Tandoori(size)*qty;
                        break;
                    case 4:
                        size= getSize(3);
                        qty= getQty();
                        amt= no.ChowMein(size)*qty;
                        break;
                    case 5:
                        size= getSize(3);
                        qty= getQty();
                        amt= no.Hakka(size)*qty;
                        break;
                    case 6:
                        size= getSize(3);
                        qty= getQty();
                        amt= no.Ramen(size)*qty;
                        break;
                    case 7:
                        qty= getQty();
                        amt= ma.Paneer()*qty;
                        break;
                    case 8:
                        qty= getQty();
                        amt= ma.VegGravy()*qty;
                        break;
                    case 9:
                        qty= getQty();
                        amt= ma.ChickenGravy()*qty;
                        break;
                    default:
                        System.out.println("Invalid Choice");
                }
                bill(amt);
                break;
            case 4:
                Beverages();
                ch=order();
                size=getSize(4);
                qty=getQty();
                switch(ch){
                    case 1:
                        amt= cd.Coke(size)*qty;
                        break;
                    case 2:
                        amt= cd.Pepsi(size)*qty;
                        break;
                    case 3:
                        amt= cd.Sprite(size)*qty;
                        break;
                    case 4:
                        amt= cd.ThumbsUp(size)*qty;
                        break;
                    case 5:
                        amt= ms.Chocolate(size)*qty;
                        break;
                    case 6:
                        amt= ms.Mango(size)*qty;
                        break;
                    case 7:
                        amt= ms.Strawberry(size)*qty;
                        break;
                    case 8:
                        amt= ms.Vanilla(size)*qty;
                        break;
                    default:
                        System.out.println("Invalid Choice");
                        break;
                }
                bill(amt);
                break;
            case 5:
                Desserts();
                ch=order();
                switch(ch){
                    case 1:
                        qty=getQty();
                        amt= sw.Rasgulla()*qty;
                        break;
                    case 2:
                        qty=getQty();
                        amt= sw.Jalebi()*qty;
                        break;
                    case 3:
                        qty=getQty();
                        amt= sw.Rasmalai()*qty;
                        break;
                    case 4:
                        size=getSize(5);
                        qty=getQty();
                        amt= ca.Pineapple(size)*qty;
                        break;
                    case 5:
                        size=getSize(5);
                        qty=getQty();
                        amt= ca.BlackForest(size)*qty;
                        break;
                    case 6:
                        size=getSize(5);
                        qty=getQty();
                        amt= ca.ChocoTruffle(size)*qty;
                        break;
                    case 7:
                        size=getSize(5);
                        qty=getQty();
                        amt= ca.RedVelvet(size)*qty;
                        break;
                    default:
                        System.out.println("Invalid Choice");
                }
                bill(amt);
                break;
        }
    }

    public int order(){
        System.out.print("Enter the dish number which you want to enter: ");
        int ch= sc.nextInt();
        return ch;
    }

    public void bill(double amt){
        total+=amt;
    }

    public int getQty(){
        System.out.print("Enter how many you want to order:");
        qty=sc.nextInt();
        return qty;
    }

    public String getSize(int choice){
        int s;
        if (choice==2){
            System.out.println("Which size of pizza do you want to order?");
            System.out.println("1. Regular"+'\n'+"2. Medium"+'\n'+"3. Large");
            s= sc.nextInt();
            switch(s){
                case 1:
                    size= "regular";
                    break;
                case 2:
                    size= "medium";
                    break;
                case 3:
                    size= "large";
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }
        else if (choice==3) {
            System.out.println("Do you want to order"+'\n'+"1. Half Plate"+'\n'+"2. Full Plate");
            s= sc.nextInt();
            switch(s){
                case 1:
                    size= "half plate";
                    break;
                case 2:
                    size= "full plate";
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }
        else if(choice==4){
            System.out.println("Which size of beverage do you want to order?"+'\n'+"1. Regular"+'\n'+"2. Large");
            s= sc.nextInt();
            switch(s){
                case 1:
                    size= "regular";
                    break;
                case 2:
                    size= "large";
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }
        else if(choice==5){
            System.out.println("Which size of cake do you want to order?"+'\n'+"1. Half kg"+'\n'+"2. Full kg");
            s= sc.nextInt();
            switch(s){
                case 1:
                    size= "half";
                    break;
                case 2:
                    size= "full";
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }
        return size;
    }

}
