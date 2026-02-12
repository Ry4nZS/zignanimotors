package zignanimotors.api.controller;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zignanimotors.api.dto.CarroDTO;

@RestController
@RequestMapping("carros")
public class CarroController {

    @PostMapping
    public void cadastrarCarro (@RequestBody @Valid CarroDTO carroDTO){
        System.out.println("Carro cadastrado com sucesso");
        System.out.println(carroDTO);
    }


}
