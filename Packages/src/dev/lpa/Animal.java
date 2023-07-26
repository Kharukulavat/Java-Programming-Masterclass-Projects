package dev.lpa;

public abstract class Animal {
    protected String type;
    private String size;
    private double weight;
    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }
    public abstract void move(String speed); //abstract method can't have bodies!!
    public abstract void makeNoise();

}
