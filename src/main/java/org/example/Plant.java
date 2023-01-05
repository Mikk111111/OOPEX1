package org.example;

public class Plant {
    private String name;
    private String latinName;
    private boolean isAnnual;
    private String origin;
    private double height;
    private boolean isEdible;

    public Plant() {

    }

    /**
     *
     * @param name of sas
     * @param latinName
     * @param isAnnual
     * @param origin
     * @param height
     * @param isEdible
     */
    public Plant(String name, String latinName,boolean isAnnual,String origin,double height,boolean isEdible) {
        this.name = name;
        this.latinName = latinName;
        this.isAnnual=isAnnual;
        this.origin=origin;
        this.height=height;
        this.isEdible=isEdible;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLatinName() {
        return latinName;
    }

    public void setLatinName(String latinName) {
        this.latinName = latinName;
    }

    public boolean isAnnual() {
        return isAnnual;
    }

    public void setAnnual(boolean annual) {
        isAnnual = annual;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isEdible() {
        return isEdible;
    }

    public void setEdible(boolean edible) {
        isEdible = edible;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "name='" + name + '\'' +
                ", latinName='" + latinName + '\'' +
                ", isAnnual=" + isAnnual +
                ", origin='" + origin + '\'' +
                ", height=" + height +
                ", isEdible=" + isEdible +
                '}';
    }
}
