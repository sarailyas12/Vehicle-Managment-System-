import java.util.ArrayList;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<vehicle> vehicles = new ArrayList<>();
        int choice;
        do {
            System.out.println("===== Vehicle Management System =====");
            System.out.println("1. Add Car");
            System.out.println("2. Add Bike");
            System.out.println("3. View Vehicles");
            System.out.println("4. update Vehicles");
            System.out.println("5. delete Vehicles");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Brand: ");
                    String brand = sc.nextLine();
                    System.out.print("Enter Year: ");
                    int year = sc.nextInt();
                    System.out.print("Enter Doors: ");
                    int doors = sc.nextInt();
                    vehicles.add(new car(id, brand, year, doors));
                    System.out.println("Car Added!");
                    break;
                case 2:
                    System.out.print("Enter ID: ");
                    int bid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Brand: ");
                    String bbrand = sc.nextLine();
                    System.out.print("Enter Year: ");
                    int byear = sc.nextInt();
                    System.out.print("Sports Bike? true/false: ");
                    boolean sports = sc.nextBoolean();
                    vehicles.add(new bike(bid, bbrand, byear, sports));
                    System.out.println("Bike Added!");
                    break;
                case 3:

                    for(vehicle v : vehicles) {
                        v.displayInfo();
                    }
                    break;
case 4:
    System.out.print("Enter Vehicle ID to Update: ");
    int updateId = sc.nextInt();
    boolean found = false;
    for(vehicle v : vehicles) {
        if(v.getId() == updateId) {
            sc.nextLine();
            System.out.print("Enter New Brand: ");
            String newbrand = sc.nextLine();
            System.out.print("Enter New Year: ");
            int newyear = sc.nextInt();
            v.setbrand(newbrand);
            v.setyear(newyear);
            System.out.println("Vehicle Updated Successfully!");
            found = true;
        }
    }
    if(!found) {
        System.out.println("Vehicle Not Found!");
    }
    break;
case 5:
    System.out.print("Enter Vehicle ID to Delete: ");
    int deleteId = sc.nextInt();
    boolean removed = false;
    for(int i = 0; i < vehicles.size(); i++) {
        if(vehicles.get(i).getId() == deleteId) {
            vehicles.remove(i);
            System.out.println("Vehicle Deleted Successfully!");
            removed = true;
            break;
        }
    }
    if(!removed) {
        System.out.println("Vehicle Not Found!");
    }
    break;
                case 0:
                    System.out.println("Program Closed");
                    break;
                default:
                    System.out.println("Invalid Choice");
                    
            }

        } while(choice != 0);

        sc.close();
    }
}

