import java.util.Scanner;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int capacity = 5;
        int parkedCars = 0;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Park");
            System.out.println("2. Exit");
            System.out.println("3. Show Occupancy");
            System.out.println("4. Quit");

            System.out.print("Choose an option: ");
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    if (parkedCars < capacity) {
                        parkedCars++;
                        System.out.println("Car parked. Slots left: " + (capacity - parkedCars));
                    } else {
                        System.out.println("Parking lot is full.");
                    }
                    break;
                case 2:
                    if (parkedCars > 0) {
                        parkedCars--;
                        System.out.println("Car exited. Slots left: " + (capacity - parkedCars));
                    } else {
                        System.out.println("Parking lot is empty.");
                    }
                    break;
                case 3:
                    System.out.println("Occupied: " + parkedCars + "/" + capacity);
                    break;
                case 4:
                    System.out.println("Exiting system.");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}