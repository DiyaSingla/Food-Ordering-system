import Indian.SouthIndian;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
public class Payment {
    Scanner sc= new Scanner(System.in);
    int card_no;
    String card_name;
    String doe;
    int cvv;
    String type;

    void setInfo(){
        while(true){
            System.out.println("Select card type"+'\n'+"1. Credit Card"+'\n'+"2. Debit Card");
            int t= sc.nextInt();
            if(t==1){
                this.type="Credit";
                break;
            }
            else if(t==2){
                this.type="Debit";
                break;
            }
            else{
                System.out.println("Invalid choice");
                System.out.println("Enter again");
                System.out.println();
            }
        }
        while(true){
            System.out.print("Enter card no- ");
            this.card_no= sc.nextInt();
            if(Integer.toString(card_no).length()==12){
                break;
            }
            else{
                System.out.println("Invalid card number");
                System.out.println("Enter again");
            }
        }
        System.out.print("Enter name on card- ");
        this.card_name= sc.nextLine();
        sc.nextLine();

        while(true){
            System.out.print("Enter expiry date of card- ");
            this.doe= sc.next();
            if(doe.length()==5){
                if(doe.charAt(3) < '2' || doe.charAt(4) < '2'){
                    System.out.println("Invalid card");
                    System.out.println("Enter again");
                }
                else{
                    break;
                }
            }
            else{
                System.out.println("Invalid card");
                System.out.println("Enter again");
            }
        }
        while(true){
            System.out.print("Enter CVV (Your cvv will not be stored)- ");
            this.cvv= sc.nextInt();
            if(Integer.toString(cvv).length()==3){break;}
            else{
                System.out.println("Invalid CVV");
                System.out.println("Enter again");
            }
        }
    }

    void storeDetails() throws FileNotFoundException, IOException {
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Diya Singla\\Desktop\\card.txt", true);
        DataOutputStream dos= new DataOutputStream(fos);
        dos.writeChars(type);
        dos.writeChar('\n');
        dos.writeInt(card_no);
        dos.writeChar('\n');
        dos.writeChars(card_name);
        dos.writeChar('\n');
        dos.writeChars(doe);
        dos.writeChar('\n');

        dos.close();
        fos.close();
    }
}
