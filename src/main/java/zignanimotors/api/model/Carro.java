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
    private Long Id;

    private String Nome;

    private String Modelo;

    private String Descricao;

    private String Ano;

    private double Km;

    @Enumerated(EnumType.STRING)
    private TipoCombustivel Combustivel;

    private String Cor;

    private String Finalplaca;

}
