package zignanimotors.api.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zignanimotors.api.dto.CarroDTO;
import zignanimotors.api.repository.CarroRepository;
import zignanimotors.api.service.CarroService;

@RestController
@RequestMapping("carros")
public class CarroController {

    @Autowired
    private CarroService service;

    @PostMapping
    public void cadastrarCarro (@RequestBody @Valid CarroDTO carroDTO){
        service.cadastrarCarro(carroDTO);
        System.out.println("Carro cadastrado com sucesso");
    }


}
