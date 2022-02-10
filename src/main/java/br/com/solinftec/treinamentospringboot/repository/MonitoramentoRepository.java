package br.com.solinftec.treinamentospringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.solinftec.treinamentospringboot.model.Monitoramento;

@Repository
public interface MonitoramentoRepository extends JpaRepository<Monitoramento, Long> {

}
