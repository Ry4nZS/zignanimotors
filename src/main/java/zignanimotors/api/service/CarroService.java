package zignanimotors.api.service;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import zignanimotors.api.dto.cadastrarCarroDTO;
import zignanimotors.api.dto.atualizarCarroDTO;
import zignanimotors.api.dto.listarCarroDTO;
import zignanimotors.api.model.Carro;
import zignanimotors.api.repository.CarroRepository;

@Service
public class CarroService {

    @Autowired
    private CarroRepository repository;

    public Carro cadastrarCarro (cadastrarCarroDTO carro) {
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

    public Page<listarCarroDTO> listarCarros(Pageable paginacao){
        return repository.findAll(paginacao).map(listarCarroDTO::new);
    }

    public void atualizarCarro(@Valid atualizarCarroDTO dadosCarro) {
        var carro = repository.getReferenceById(dadosCarro.id());
        carro.atualizarInformacoes(dadosCarro);
    }

    public void desativarCarro(Long id) {
            var carro = repository.getReferenceById(id);
            carro.vender();
        }
    }

