package me.dio.muslim.domain.model;

import java.math.BigDecimal;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

@Entity(name = "tb_visitor")
public class Visitor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(unique = true)
    private String number;

    @Column(name = "additional_limit", precision = 13, scale = 2)
    private BigDecimal limit;

    @Column(precision = 13, scale = 2)
    private BigDecimal balance;

    private String nomeDaMesquita;

    public Visitor() {
    }

    public Visitor(long id, String number, BigDecimal limit, BigDecimal balance, String nomeDaMesquita) {
        this.id = id;
        this.number = number;
        this.limit = limit;
        this.balance = balance;
        this.nomeDaMesquita = nomeDaMesquita;
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

    public BigDecimal getLimit() {
        return limit;
    }

    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getNomeDaMesquita() {
        return nomeDaMesquita;
    }

    public void setNomeDaMesquita(String nomeDaMesquita) {
        this.nomeDaMesquita = nomeDaMesquita;
    }
}