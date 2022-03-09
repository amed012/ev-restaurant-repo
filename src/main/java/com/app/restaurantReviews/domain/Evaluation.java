package com.app.restaurantReviews.domain;

import javax.persistence.*;

@Entity
public class Evaluation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEvaluation;
    private String commentaire;
    private int noteEtoile;
    @OneToOne(cascade = CascadeType.ALL )
    @JoinColumn(name = "idUser")
    private User user;

    @OneToOne(cascade = CascadeType.ALL )
    @JoinColumn(name = "idRestaurant")
    private Restaurant restaurant;

    public Evaluation() {
    }

    public Evaluation( String commentaire, int noteEtoile, User user, Restaurant restaurant) {

        this.commentaire = commentaire;
        this.noteEtoile = noteEtoile;
        this.user = user;
        this.restaurant = restaurant;
    }

    public Long getIdEvaluation() {
        return idEvaluation;
    }

    public void setIdEvaluation(Long idEvaluation) {
        this.idEvaluation = idEvaluation;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public int getNoteEtoile() {
        return noteEtoile;
    }

    public void setNoteEtoile(int noteEtoile) {
        this.noteEtoile = noteEtoile;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurent) {
        this.restaurant = restaurent;
    }
}
