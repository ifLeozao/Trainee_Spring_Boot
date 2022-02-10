package br.com.solinftec.treinamentospringboot.service;

import org.springframework.stereotype.Service;

import br.com.solinftec.treinamentospringboot.repository.MonitoramentoRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MonitoramentoService {

    private final MonitoramentoRepository monitoramentoRepository;

}
