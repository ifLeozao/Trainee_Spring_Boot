package br.com.solinftec.treinamentospringboot.service;

import org.springframework.stereotype.Service;

import br.com.solinftec.treinamentospringboot.repository.TipoServicoRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TipoServicoService {

    private final TipoServicoRepository tipoServicoRepository;

}
