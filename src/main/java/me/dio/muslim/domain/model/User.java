package me.dio.muslim.domain.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity(name = "tb_user") 
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; 
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    private String email; 
    private Address address;
    private List<Feature> features;
    private Visitor visitante;
    private List<Hadith> ahadith;

    public User(long id, String name, String email, Address address, List<Feature> features, Visitor visitante, List<Hadith> ahadith) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.features = features;
        this.visitante = visitante;
        this.ahadith = ahadith;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    public Visitor getVisitante() {
        return visitante;
    }

    public void setVisitante(Visitor visitante) {
        this.visitante = visitante;
    }

    public List<Hadith> getAhadith() {
        return ahadith;
    }

    public void setAhadith(List<Hadith> ahadith) {
        this.ahadith = ahadith;
    }
}