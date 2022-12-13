import java.io.*;
import java.util.*;
public class Details {
    Scanner sc= new Scanner(System.in);
    String name;
    String address;
    int ph_no;
    void getDetails(){
        System.out.print("Kindly enter your name- ");
        this.name= sc.nextLine();
        System.out.print("Enter your address- ");
        this.address= sc.nextLine();
        while(true){
            System.out.print("Enter your phone number");
            this.ph_no= sc.nextInt();
            if(Integer.toString(ph_no).length()==10){
                break;
            }
            else{
                System.out.println("Invalid phone number");
                System.out.println("Enter again");
            }
        }
    }

    void storeDetails() throws FileNotFoundException, IOException{
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Diya Singla\\Desktop\\details.txt", true);
        DataOutputStream dos= new DataOutputStream(fos);
        dos.writeChars(name);
        dos.writeChar('\n');
        dos.writeChars(address);
        dos.writeChar('\n');
        dos.writeInt(ph_no);
        dos.writeChar('\n');

        dos.close();
        fos.close();
    }
}
