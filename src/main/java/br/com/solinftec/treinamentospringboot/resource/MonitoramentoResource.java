package br.com.solinftec.treinamentospringboot.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.solinftec.treinamentospringboot.service.MonitoramentoService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/monitoramento")
@RequiredArgsConstructor
public class MonitoramentoResource {

    private final MonitoramentoService monitoramentoService;

}
