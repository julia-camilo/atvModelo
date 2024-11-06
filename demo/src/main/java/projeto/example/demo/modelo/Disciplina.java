package projeto.example.demo.modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "Disciplina")

public class Disciplina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "cargaHoraria")
    private int cargaHoraria;
}

