package zignanimotors.api.service;

import org.hibernate.annotations.Array;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zignanimotors.api.dto.CarroDTO;
import zignanimotors.api.model.Carro;
import zignanimotors.api.repository.CarroRepository;

@Service
public class CarroService {

    @Autowired
    private CarroRepository repository;

    public Carro cadastrarCarro (CarroDTO carro) {
        Carro c = new Carro();
        c.setNome(carro.nome());
        c.setModelo(carro.modelo());
        c.setDescricao(carro.descricao());
        c.setAno(carro.ano());
        c.setKm(carro.km());
        c.setCombustivel(carro.combustivel());
        c.setCor(carro.cor());
        c.setFinalplaca(carro.finalplaca());

        return repository.save(c);
    }

}
