package br.com.solinftec.treinamentospringboot.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "ORDEM_SERVICO")
public class OrdemServico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "DATA_EXECUCAO")
    private Date data_execucao;

    @OneToOne
    private Cooperativa id_cooperativa;

    @OneToOne
    private Fazenda id_fazenda;

    @OneToOne
    private Equipamento id_equipamento;

    @OneToOne
    private TipoServico id_Tipo_Servico;

    @OneToOne
    private Produto id_produto;
}
