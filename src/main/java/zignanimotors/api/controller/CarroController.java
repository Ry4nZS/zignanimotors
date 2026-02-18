package zignanimotors.api.controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;
import zignanimotors.api.dto.cadastrarCarroDTO;
import zignanimotors.api.dto.atualizarCarroDTO;
import zignanimotors.api.dto.listarCarroDTO;
import zignanimotors.api.service.CarroService;

@RestController
@RequestMapping("carros")
public class CarroController {

    @Autowired
    private CarroService service;

    @PostMapping
    @Transactional
    public void cadastrarCarro (@RequestBody @Valid cadastrarCarroDTO carroDTO){
        service.cadastrarCarro(carroDTO);
        System.out.println("Carro cadastrado com sucesso");
    }

    @GetMapping
    public Page <listarCarroDTO> listarCarros(@PageableDefault(size = 10, sort = {"nome"}) Pageable paginacao){
        return service.listarCarros(paginacao);
    }

    @PutMapping
    @Transactional
    public void atualizarCarro(@RequestBody @Valid atualizarCarroDTO atualizarDTO){
    service.atualizarCarro(atualizarDTO);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void desativarCarro(@PathVariable Long id){
    service.desativarCarro(id);
    }


}
