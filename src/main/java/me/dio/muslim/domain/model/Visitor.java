package me.dio.muslim.domain.model;

public class Visitor {
    private long id; 
    private String number;
    private String limite;

    public Visitor(long id, String number, String limite) {
        this.id = id;
        this.number = number;
        this.limite = limite;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getLimite() {
        return limite;
    }

    public void setLimite(String limite) {
        this.limite = limite;
    }
}