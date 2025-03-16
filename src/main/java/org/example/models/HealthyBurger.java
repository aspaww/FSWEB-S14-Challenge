package org.example.models;

public class HealthyBurger extends Hamburger {
    // Sağlıklı ekstra malzeme değişkenleri
    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    // Constructor:
    // - name, price ve breadRollType constructor üzerinden set edilebiliyor.
    // - Meat tipi sabit "Tofu" olarak atanır.
    public HealthyBurger(String name, double price, String breadRollType) {
        super(name, "Tofu", price, breadRollType);
    }

    // Sağlıklı ek malzeme ekleme metodları
    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    // Tüm malzemeleri ekrana basan ve toplam fiyatı hesaplayan metod.
    // Öncelikle Hamburger'ın itemizeHamburger metodunu çağırır,
    // ardından sağlıklı ek malzemeleri ekler.
    @Override
    public double itemizeHamburger() {
        double total = super.itemizeHamburger();

        if (this.healthyExtra1Name != null) {
            total += this.healthyExtra1Price;
            System.out.println("HealthyAddition1: " + this.healthyExtra1Name);
        }
        if (this.healthyExtra2Name != null) {
            total += this.healthyExtra2Price;
            System.out.println("HealthyAddition2: " + this.healthyExtra2Name);
        }

        System.out.println("Price: " + total);
        setPrice(total);
        return total;
    }
}
