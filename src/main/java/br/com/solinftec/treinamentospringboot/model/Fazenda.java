package br.com.solinftec.treinamentospringboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(name = "FAZENDA")
public class Fazenda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "id_fazendeiro")
    private Fazendeiro id_fazendeiro;

    @Column(name = "AREA")
    private float area;

    @Column(name = "LATITUDE")
    private float latitude;

    @Column(name = "LONGITUDE")
    private float longitude;
}
