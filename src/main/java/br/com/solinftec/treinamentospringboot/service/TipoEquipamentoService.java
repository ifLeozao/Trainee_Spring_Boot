package br.com.solinftec.treinamentospringboot.service;

import org.springframework.stereotype.Service;

import br.com.solinftec.treinamentospringboot.repository.TipoEquipamentoRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TipoEquipamentoService {

    private final TipoEquipamentoRepository tipoEquipamentoRepository;

}
