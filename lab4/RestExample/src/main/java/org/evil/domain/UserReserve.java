package org.evil.domain;

public class UserReserve {
    private Smartphone smartphone;
    private int quantity;

    public UserReserve() {
        this.smartphone = new Smartphone();
        this.quantity = 0;
    }

    public UserReserve(Smartphone smartphone, int quantity) {
        this.smartphone = smartphone;
        this.quantity = quantity;
    }

    public Smartphone getSmartphone() {
        return smartphone;
    }

    public void setSmartphone(Smartphone smartphone) {
        this.smartphone = smartphone;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
