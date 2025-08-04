import java.util.Scanner;

public class Coffee_Counter {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String coffeeType;
        
        while (true) {
            System.out.print("Enter coffee type (Espresso/Latte/Cappuccino) or 'exit' to quit: ");
            coffeeType = sc.next().toLowerCase();

            if (coffeeType.equals("exit")) {
                break;
            }

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();

            double price = 0;

            switch (coffeeType) {
                case "espresso":
                    price = 100;
                    break;
                case "latte":
                    price = 120;
                    break;
                case "cappuccino":
                    price = 150;
                    break;
                default:
                    System.out.println("Invalid coffee type!");
                    continue;
            }

            double total = price * quantity;
            double gst = total * 0.18;
            double finalAmount = total + gst;

            System.out.printf("Bill: ₹%.2f (GST included)%n%n", finalAmount);
        }
    }
}