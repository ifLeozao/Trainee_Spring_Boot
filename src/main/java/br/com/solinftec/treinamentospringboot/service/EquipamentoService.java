package br.com.solinftec.treinamentospringboot.service;

import org.springframework.stereotype.Service;

import br.com.solinftec.treinamentospringboot.repository.EquipamentoRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EquipamentoService {

    private final EquipamentoRepository equipamentoRepository;

}
