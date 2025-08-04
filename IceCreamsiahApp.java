import java.util.*;
class Flavor {
    String name;
    int sales;

    Flavor(String name, int sales) {
        this.name = name;
        this.sales = sales;
    }
}

class IceCreamShop {
    List<Flavor> flavors;

    IceCreamShop() {
        flavors = new ArrayList<>();
    }

    void addFlavor(String name, int sales) {
        flavors.add(new Flavor(name, sales));
    }

    void sortFlavorsByPopularity() {
        int n = flavors.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (flavors.get(j).sales < flavors.get(j + 1).sales) {
                    Flavor temp = flavors.get(j);
                    flavors.set(j, flavors.get(j + 1));
                    flavors.set(j + 1, temp);
                }
            }
        }
    }

    void displayFlavors() {
        for (Flavor f : flavors) {
            System.out.println(f.name + ": " + f.sales + " sold");
        }
    }
}

public class IceCreamsiahApp {
    public static void main(String[] args) {
        IceCreamShop shop = new IceCreamShop();
        shop.addFlavor("Vanilla", 15);
        shop.addFlavor("Chocolate", 25);
        shop.addFlavor("Strawberry", 10);
        shop.addFlavor("Mango", 20);

        shop.sortFlavorsByPopularity();
        shop.displayFlavors();
    }
}
