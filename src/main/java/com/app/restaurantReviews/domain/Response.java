package com.app.restaurantReviews.domain;

import javax.persistence.*;

@Entity
public class Response {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idResponse;
    private String commentaire;
    private int noteEtoile;
    @OneToOne(cascade = CascadeType.ALL )
    @JoinColumn(name = "idEvaluation")
    private Evaluation evaluation;


    public Response(String commentaire, int noteEtoile, Evaluation evaluation) {
        this.commentaire = commentaire;
        this.noteEtoile = noteEtoile;
        this.evaluation = evaluation;
    }

    public Long getIdResponse() {
        return idResponse;
    }

    public void setIdResponse(Long idResponse) {
        this.idResponse = idResponse;
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

    public Evaluation getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(Evaluation evaluation) {
        this.evaluation = evaluation;
    }

    public Response() {
    }
}
