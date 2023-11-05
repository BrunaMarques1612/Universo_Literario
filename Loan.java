package main.java.model;

import java.util.Date;

public class Loan {
    private int id;
    private int livroId;
    private int usuarioId;
    private Date inicioDate;
    private Date fimDate;

    // Construtor vazio
    public Loan() {
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

    // Getter e Setter para 'userId'
    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    // Getter e Setter para 'inicioDate'
    public Date getInicioDate() {
        return inicioDate;
    }

    public void setInicioDate(Date inicioDate) {
        this.inicioDate = inicioDate;
    }

    // Getter e Setter para 'fimDate'
    public Date getFimDate() {
        return fimDate;
    }

    public void setFimDate(Date fimDate) {
        this.fimDate = fimDate;
    }
}
