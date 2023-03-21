package ru.netology.java.product;

public class Smartphone extends Product {
    private String phoneMaker;

    public Smartphone(int id, String name, int price, String phoneMaker) {
        super(id, name, price);
        this.phoneMaker = phoneMaker;

    }

    public String getPhoneMaker() {
        return phoneMaker;
    }


}
