package me.dio.muslim.domain.model;

public class Address {
    private String street;
    private String number;
    private String flat;
    private String floor;
    private String neighborhood;

    public Address(String street, String number, String flat, String floor, String neighborhood) {
        this.street = street;
        this.number = number;
        this.flat = flat;
        this.floor = floor;
        this.neighborhood = neighborhood;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getFlat() {
        return flat;
    }

    public void setFlat(String flat) {
        this.flat = flat;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }
}
