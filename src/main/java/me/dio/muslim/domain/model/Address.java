package me.dio.muslim.domain.model;

import java.math.BigDecimal;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

@Entity(name = "tb_address") // Adicionada a anotação @Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String street;

    @Column(unique = true)
    private String number;
    private String flat;
    private String floor;
    private String neighborhood;

    @Column(name = "available_limit", precision = 13, scale = 2)
    private BigDecimal limit;

    public Address() {
    }

    public Address(Long id, String street, String number, String flat, String floor, String neighborhood, BigDecimal limit) {
        this.id = id;
        this.street = street;
        this.number = number;
        this.flat = flat;
        this.floor = floor;
        this.neighborhood = neighborhood;
        this.limit = limit;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public BigDecimal getLimit() {
        return limit;
    }

    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }
}
