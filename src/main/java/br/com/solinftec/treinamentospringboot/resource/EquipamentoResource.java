package br.com.solinftec.treinamentospringboot.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.solinftec.treinamentospringboot.service.EquipamentoService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/equipamento")
@RequiredArgsConstructor
public class EquipamentoResource {

    private final EquipamentoService equipamentoService;

}
