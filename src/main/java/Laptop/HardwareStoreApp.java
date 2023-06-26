package Laptop;

import java.util.HashSet;
import java.util.*;

public class HardwareStoreApp {

    private static void filterLaptops(Set<Laptop> laptops) {
        Map<Integer, String> criteriaMap = new HashMap<>();
        criteriaMap.put(1, "ramSize");
        criteriaMap.put(2, "storageSize");
        criteriaMap.put(3, "processor");
        criteriaMap.put(4, "brand");
        criteriaMap.put(5, "model");
        criteriaMap.put(6, "price");

        // Prompt the user for filtering criteria
        System.out.println("Enter the number corresponding to the required criteria:");
        criteriaMap.forEach((key, value) -> System.out.println(key + " - " + value));

        Scanner scanner = new Scanner(System.in);
        int criteriaNumber = scanner.nextInt();
        String filterCriteria = criteriaMap.get(criteriaNumber);

        // Prompt the user for the minimum value for the specified criteria
        System.out.println("Enter the minimum value for " + filterCriteria + ":");
        scanner.nextLine(); // Consume the newline character
        String filterValue = scanner.nextLine();

        // Filter laptops based on the specified criteria and minimum value
        List<Laptop> filteredLaptops = new ArrayList<>();
        for (Laptop laptop : laptops) {
            switch (filterCriteria) {
                case "ramSize":
                    if (laptop.getRamSize() >= Integer.parseInt(filterValue)) {
                        filteredLaptops.add(laptop);
                    }
                    break;
                case "storageSize":
                    if (laptop.getStorageSize() >= Integer.parseInt(filterValue)) {
                        filteredLaptops.add(laptop);
                    }
                    break;
                case "processor":
                    if (laptop.getProcessor().equalsIgnoreCase(filterValue)) {
                        filteredLaptops.add(laptop);
                    }
                    break;
                case "brand":
                    if (laptop.getBrand().equalsIgnoreCase(filterValue)) {
                        filteredLaptops.add(laptop);
                    }
                    break;
                case "model":
                    if (laptop.getModel().equalsIgnoreCase(filterValue)) {
                        filteredLaptops.add(laptop);
                    }
                    break;
                case "price":
                    if (laptop.getPrice() >= Double.parseDouble(filterValue)) {
                        filteredLaptops.add(laptop);
                    }
                    break;
                default:
                    System.out.println("Invalid filter criteria.");
                    return;
            }
        }

        // Display the filtered laptops
        System.out.println("Filtered Laptops:");
        if (filteredLaptops.isEmpty()) {
            System.out.println("No laptops match the filter.");
        } else {
            for (Laptop laptop : filteredLaptops) {
                System.out.println(laptop);
            }
        }
    }

    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("HP", "Pavilion", 999.99, 8, 512, "Intel i5");
        Laptop laptop2 = new Laptop("Dell", "XPS 13", 1299.99, 16, 512, "Intel i7");
        Laptop laptop3 = new Laptop("Lenovo", "ThinkPad", 1499.99, 16, 1_000, "Intel i7");
        Laptop laptop4 = new Laptop("Apple", "MacBook Pro", 1999.99, 16, 512, "Apple M1");
        Laptop laptop5 = new Laptop("ASUS", "ROG Strix", 1799.99, 32, 1_000, "AMD Ryzen 9");
        Laptop laptop6 = new Laptop("Acer", "Predator Helios", 1399.99, 16, 1_000, "Intel i7");
        Laptop laptop7 = new Laptop("Microsoft", "Surface Laptop", 1299.99, 8, 256, "Intel i5");

        HashSet<Laptop> laptopSet = new HashSet<>();
        laptopSet.add(laptop1);
        laptopSet.add(laptop2);
        laptopSet.add(laptop3);
        laptopSet.add(laptop4);
        laptopSet.add(laptop5);
        laptopSet.add(laptop6);
        laptopSet.add(laptop7);

        for (Laptop laptop : laptopSet) {
            System.out.println(laptop);
        }

        System.out.println("Laptop1 equals Laptop2: " + laptop1.equals(laptop2));

        Laptop searchLaptop = new Laptop("HP", "Pavilion", 999.99, 8, 512, "Intel i5");
        System.out.println("Laptop found: " + laptopSet.contains(searchLaptop));

        // Call the filterLaptops method
        filterLaptops(laptopSet);
    }
}

