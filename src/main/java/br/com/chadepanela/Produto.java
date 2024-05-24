package br.com.chadepanela;


import jakarta.persistence.*;
import lombok.*;

@Entity(name = "produto")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data

public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;

    @Column
    private String nome;

    @Column
    private Double valor;

    @Column
    private String descricao;

    @Column(name = "qtd_disponivel")
    private Integer quantidadeDisponivel;

    @Column(name = "qtd_comprado")
    private Integer qtdComprado;

    @Column
    private Enum Status;
}

// Nome,Valor,Descricao,qtdDisponivel, qtdComprado, img, Status
