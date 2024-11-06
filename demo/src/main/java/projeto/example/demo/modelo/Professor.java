package projeto.example.demo.modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "Professor")

public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "departamento")
    private int departamento;
}
