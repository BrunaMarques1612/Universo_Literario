package main.java.model;

public class Review {
    private int id;
    private int livroId;
    private int usuarioId;
    private int rating;
    private String comment;

    // Construtor vazio
    public Review() {
    }

    // Getter e Setter para 'id'
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter e Setter para 'livroId'
    public int getLivroId() {
        return livroId;
    }

    public void setLivroId(int livroId) {
        this.livroId = livroId;
    }

    // Getter e Setter para 'usuarioId'
    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    // Getter e Setter para 'rating'
    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    // Getter e Setter para 'comment'
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
