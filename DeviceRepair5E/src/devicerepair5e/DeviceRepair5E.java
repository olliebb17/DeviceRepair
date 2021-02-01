
package devicerepair5e;

import java.util.Scanner;
public class DeviceRepair5E{

    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Device myDevice  = new Device ("12345", "Lenovo 3", "Julie", "Smashed screen", "Not started yet", 100);
        System.out.println(myDevice.toString());
        
    }
    public static void MainMenu(){
        while (true){
            System.out.println("Please select an option:");
            int option = input.nextInt();
            switch(option){
            case 1:
            System.out.println("You chose 1");
            break;
            case 2:
            System.out.println("You chose 2");
            break;
            case 0:
                System.exit(0);
        }
            
        }
    }
   
    
}
