package br.com.solinftec.treinamentospringboot.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.solinftec.treinamentospringboot.service.OrdemServicoService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/ordemservice")
@RequiredArgsConstructor
public class OrdemServicoResource {

    private final OrdemServicoService ordemServicoService;

}
