package projeto.example.demo.modelo;

import jakarta.persistence.*;

    @Entity
    @Table(name = "Curso")

    public class Curso {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        @Column(name = "titulo")
        private String titulo;

        @Column(name = "duracao")
        private int duracao;
}
