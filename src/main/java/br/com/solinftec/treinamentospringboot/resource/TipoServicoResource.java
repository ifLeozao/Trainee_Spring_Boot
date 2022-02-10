package br.com.solinftec.treinamentospringboot.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.solinftec.treinamentospringboot.service.TipoServicoService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/tiposervice")
@RequiredArgsConstructor
public class TipoServicoResource {

    private final TipoServicoService tipoServicoService;

}
