package zignanimotors.api.model;

import com.sun.tools.attach.AgentInitializationException;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
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

}
