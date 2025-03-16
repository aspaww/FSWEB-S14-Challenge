package org.example.models;

public class Hamburger {
    // Private instance değişkenleri
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;

    // Constructor: Temel özellikler set ediliyor.
    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    // Getter metodları
    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    // Protected setter: Alt sınıflar tarafından fiyat güncellemesi için
    protected void setPrice(double price) {
        this.price = price;
    }

    // Ek malzeme ekleme metodları
    public void addHamburgerAddition1(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addHamburgerAddition4(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;
    }

    // Tüm malzemeleri ekrana basan ve toplam fiyatı hesaplayan metod.
    // Fiyat alanını güncelleyip toplam değeri döner.
    public double itemizeHamburger() {
        double total = this.price;
        System.out.println("Name: " + this.name);
        System.out.println("Meat: " + this.meat);
        System.out.println("BreadRollType: " + this.breadRollType);

        if (this.addition1Name != null) {
            total += this.addition1Price;
            System.out.println("Addition1: " + this.addition1Name);
        }
        if (this.addition2Name != null) {
            total += this.addition2Price;
            System.out.println("Addition2: " + this.addition2Name);
        }
        if (this.addition3Name != null) {
            total += this.addition3Price;
            System.out.println("Addition3: " + this.addition3Name);
        }
        if (this.addition4Name != null) {
            total += this.addition4Price;
            System.out.println("Addition4: " + this.addition4Name);
        }

        System.out.println("Price: " + total);
        setPrice(total);
        return total;
    }
}
