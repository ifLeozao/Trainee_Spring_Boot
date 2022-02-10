package br.com.solinftec.treinamentospringboot.service;

import org.springframework.stereotype.Service;

import br.com.solinftec.treinamentospringboot.repository.OrdemServicoRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrdemServicoService {

    private final OrdemServicoRepository ordemServicoRepository;

}
