package org.example.models;

public class DeluxeBurger extends Hamburger {
    // Private değişkenler: cips ve drink
    private String cips;
    private String drink;

    // Constructor:
    // - Fiyat 19.10 olarak belirlenir.
    // - Meat "Double" ve BreadRollType "Double Sandwich" olarak set edilir.
    // - cips "CURVY" ve drink "COKE" olarak otomatik atanır.
    public DeluxeBurger() {
        super("Deluxe Burger", "Double", 19.10, "Double Sandwich");
        this.cips = "CURVY";
        this.drink = "COKE";
    }

    // Getter metodları
    public String getCips() {
        return cips;
    }

    public String getDrink() {
        return drink;
    }

    // Ek malzeme eklenmesine izin verilmediği için tüm ekleme metodlarını override ediyoruz.
    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("\nDeluxe Burger için yeni malzeme eklenemez");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("\nDeluxe Burger için yeni malzeme eklenemez");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("\nDeluxe Burger için yeni malzeme eklenemez");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("\nDeluxe Burger için yeni malzeme eklenemez");
    }

    // itemizeHamburger() metodunu değiştirmeye gerek yok çünkü temel fiyat, isim, meat ve ekmek tipi zaten üst sınıfta tanımlı.
    // Ek malzeme eklenmediğinden toplam fiyat sabit kalır.
}
