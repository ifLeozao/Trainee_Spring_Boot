package br.com.solinftec.treinamentospringboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "PRODUTO")
@Data
@NoArgsConstructor
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "DESCRICAO")
    private String descricao;

    @Column(name = "LATITUDE")
    private Float latitude;

    @Column(name = "ID_CRIDADE")
    private Float id_cidade;

    @Column(name = "ATIVO")
    private Boolean ativo;
}
