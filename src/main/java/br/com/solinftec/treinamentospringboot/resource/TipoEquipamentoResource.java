package br.com.solinftec.treinamentospringboot.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.solinftec.treinamentospringboot.service.TipoEquipamentoService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/tipoequipamento")
@RequiredArgsConstructor
public class TipoEquipamentoResource {

    private final TipoEquipamentoService tipoEquipamentoService;
}
