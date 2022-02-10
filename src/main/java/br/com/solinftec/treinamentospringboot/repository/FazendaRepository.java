package br.com.solinftec.treinamentospringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.solinftec.treinamentospringboot.model.Fazenda;

@Repository
public interface FazendaRepository extends JpaRepository<Fazenda, Long> {

}
