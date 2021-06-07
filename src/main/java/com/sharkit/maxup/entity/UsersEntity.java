package com.sharkit.maxup.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "usr")
public class UsersEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private String email;
    private float balance;
    private String login, password;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private List<BasketEntity> basket;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userE")
    private List<ResponseEntity> response;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
