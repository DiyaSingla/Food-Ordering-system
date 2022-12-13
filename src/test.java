import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
public class test {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner sc= new Scanner(System.in);
        System.out.println();
        System.out.println("        WELCOME TO D's KITCHEN!");
        System.out.println();

        //order
        Menu m= new Menu();
        int ans=1;
        do{
            System.out.println("CATEGORIES");
            System.out.println("1. Indian"+'\n'+"2. Italian"+'\n'+"3. Chinese"+'\n'+"4. Beverages"+'\n'+"5. Desserts"+'\n'+"6. Exit");
            System.out.print("From which category would you like to order?");
            int choice= sc.nextInt();
            if(choice==6){
                System.exit(0);
            }
            else if (choice>6) {
                System.out.println("Invalid choice");
                System.out.println("Choose again");
                System.out.println();
            }
            else{
                System.out.println("            MENU");
                m.display(choice);
                System.out.println("Dish Added to list");
                System.out.println();
                System.out.println("Do you want to order anything else?"+'\n'+"1. YES"+'\n'+"2. NO");
                ans= sc.nextInt();
            }
        }
        while(ans==1);

        //bill
        System.out.println("Your Total Bill Amount is: "+ m.total);
        System.out.println();

        //details
        Details de= new Details();
        de.getDetails();
        de.storeDetails();

        //payment
        System.out.println("Enter your mode of payment:"+'\n'+"1. By cash"+'\n'+"2. By card");
        int mop=sc.nextInt();
        if(mop==1){
            System.out.println("Please keep Rs. "+m.total+" handy at the time of delivery");
            System.out.println("Order place successfully for "+de.name);
            System.out.println("Thank you for placing this order!");
            System.out.println("Enjoy your meal!");
        }
        else if(mop==2){
            Payment pay= new Payment();
            pay.setInfo();
            System.out.println("Click enter to pay");
            String enter=sc.nextLine();
            sc.nextLine();
            pay.storeDetails();
            System.out.println("Payment Successful!");
        }
        System.out.println();
        System.out.println("Order place successfully for "+de.name);
        System.out.println("Thank you for placing this order!");
        System.out.println("Enjoy your meal!");

    }
}
