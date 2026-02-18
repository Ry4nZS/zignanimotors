package zignanimotors.api.model;

import com.sun.tools.attach.AgentInitializationException;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import zignanimotors.api.dto.atualizarCarroDTO;
import zignanimotors.api.enums.TipoCombustivel;

@Table(name = "carros")
@Entity(name = "Carro")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Carro {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String modelo;

    private String descricao;

    private String ano;

    private double km;

    @Enumerated(EnumType.STRING)
    private TipoCombustivel combustivel;

    private String cor;

    private String finalplaca;

    private boolean vendido;

    public void atualizarInformacoes(@Valid atualizarCarroDTO dadosCarro) {
        if(dadosCarro.nome() != null){
            this.nome = dadosCarro.nome();
        }
        if(dadosCarro.modelo() != null){
            this.modelo = dadosCarro.modelo();
        }
        if(dadosCarro.descricao() != null){
            this.descricao = dadosCarro.descricao();
        }
        if(dadosCarro.ano() != null){
            this.ano = dadosCarro.ano();
        }
        if(dadosCarro.km() != null){
            this.km = dadosCarro.km();
        }
        if(dadosCarro.combustivel() != null){
            this.combustivel = dadosCarro.combustivel();
        }
        if(dadosCarro.cor() != null){
            this.cor = dadosCarro.cor();
        }
        if(dadosCarro.finalPlaca() != null){
            this.finalplaca = dadosCarro.finalPlaca();
        }
        if(dadosCarro.vendido() != null){
            this.vendido = dadosCarro.vendido();
        }
    }
    public void vender(){
        this.vendido = true;
    }
}
