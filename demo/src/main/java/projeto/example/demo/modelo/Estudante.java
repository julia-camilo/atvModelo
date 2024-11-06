package projeto.example.demo.modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "Estudante")

public class Estudante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "email")
    private String email;
}
