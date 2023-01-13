package org.evil.domain;

public class StoreAssortment {
    private Smartphone[] smartphones;
    private int[] quantity;

    public StoreAssortment(Smartphone[] smartphones, int[] quantity) {
        this.smartphones = smartphones;
        this.quantity = quantity;
    }

    public StoreAssortment() {
    }

    public void setQuantityFromIndex(int index, int value) {
        try {
            quantity[index] = value;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Smartphone[] getSmartphones() {
        return smartphones;
    }

    public void setSmartphones(Smartphone[] smartphones) {
        this.smartphones = smartphones;
    }

    public int[] getQuantity() {
        return quantity;
    }

    public void setQuantity(int[] quantity) {
        this.quantity = quantity;
    }
}
