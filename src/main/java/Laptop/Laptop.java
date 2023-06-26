package Laptop;

import java.util.Objects;

public class Laptop {
    private String brand;
    private String model;
    private double price;
    private int ramSize;
    private int storageSize;
    private String processor;

    public Laptop(String brand, String model, double price, int ramSize, int storageSize, String processor) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.ramSize = ramSize;
        this.storageSize = storageSize;
        this.processor = processor;
    }

    // Getters and Setters

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public int getStorageSize() {
        return storageSize;
    }

    public void setStorageSize(int storageSize) {
        this.storageSize = storageSize;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    // Other methods

    public void printDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
        System.out.println("RAM Size: " + ramSize + "GB");
        System.out.println("Storage Size: " + storageSize + "GB");
        System.out.println("Processor: " + processor);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", ramSize=" + ramSize +
                ", storageSize=" + storageSize +
                ", processor='" + processor + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return Double.compare(laptop.price, price) == 0 &&
                ramSize == laptop.ramSize &&
                storageSize == laptop.storageSize &&
                brand.equals(laptop.brand) &&
                model.equals(laptop.model) &&
                processor.equals(laptop.processor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, price, ramSize, storageSize, processor);
    }
}

