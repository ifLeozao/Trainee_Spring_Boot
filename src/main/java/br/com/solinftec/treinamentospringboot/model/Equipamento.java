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
@Table(name = "EQUIPAMENTO")
@Data
@NoArgsConstructor
public class Equipamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ID_TIPO_EQUIPAMENTO")
    private Long id_tipo_equipamento;

    @Column(name = "DESCRICAO")
    private String descricao;

    @Column(name = "LATITUDE")
    private Float latitude;

    @Column(name = "LONGITUDE")
    private Float longitude;

    @Column(name = "ATIVO")
    private Boolean ativo;
}
