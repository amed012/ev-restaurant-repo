package com.app.restaurantReviews.domain;

import javax.persistence.*;

@Entity
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long   idRestaurant;

    private String description ;
    private String categorie ;
    private String email ;
    private String adresse ;
    private String active ;

    @OneToOne( )
    @JoinColumn(name = "idUser")
    private User user;

    public Long getIdRestaurant() {
        return idRestaurant;
    }

    public void setIdRestaurant(Long idRestaurant) {
        this.idRestaurant = idRestaurant;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Restaurant(Long idRestaurant, String description, String categorie, String email, String adresse, String active, User user) {
        this.idRestaurant = idRestaurant;
        this.description = description;
        this.categorie = categorie;
        this.email = email;
        this.adresse = adresse;
        this.active = active;
        this.user = user;
    }
    public Restaurant() {
      
    }
    
    
}
