package me.dio.muslim.domain.model;

import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.FetchType;

@Entity(name = "tb_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    @OneToOne(cascade = CascadeType.ALL) // Relacionamento com Address
    private Address address;

    @OneToOne(cascade = CascadeType.ALL)
    private Email email;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Feature> features;

    @OneToOne(cascade = CascadeType.ALL) // Relacionamento com Visitor
    private Visitor visitante;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Hadith> ahadith;

    public User() {
    }

    public User(long id, String name, Address address, Email email, List<Feature> features, Visitor visitante, List<Hadith> ahadith) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
        this.features = features;
        this.visitante = visitante;
        this.ahadith = ahadith;
    }

    // Getters e Setters
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
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