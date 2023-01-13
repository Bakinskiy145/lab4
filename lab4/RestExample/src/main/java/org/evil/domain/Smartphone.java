package org.evil.domain;


public class Smartphone {
    private String id;
    private String firm;
    private String model;
    private String color;
    private int ramGB;
    private int memoryGB;
    private Double price;

    public Smartphone() {
        this.id = "0000";
        this.firm = "";
        this.model = "";
        this.color = "";
        this.ramGB = 0;
        this.memoryGB = 0;
        this.price = 0.0;
    }

    @Override
    public String toString() {
        return firm + " | " + model + " | " + color
                + " | " + ramGB + "GB | " + memoryGB +"GB | " + price + "P";
    }

    public Smartphone(String id, String firm, String model, String color, int ramGB, int memoryGB, double price) {
        this.id = id;
        this.firm = firm;
        this.model = model;
        this.color = color;
        this.ramGB = ramGB;
        this.memoryGB = memoryGB;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirm() {
        return firm;
    }

    public void setFirm(String firm) {
        this.firm = firm;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRamGB() {
        return ramGB;
    }

    public void setRamGB(int ramGB) {
        this.ramGB = ramGB;
    }

    public int getMemoryGB() {
        return memoryGB;
    }

    public void setMemoryGB(int memoryGB) {
        this.memoryGB = memoryGB;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}

