package zignanimotors.api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import org.aspectj.weaver.ast.Not;
import zignanimotors.api.enums.TipoCombustivel;
import zignanimotors.api.model.Carro;

public record listarCarroDTO(

        @NotBlank
        Long id,

        @NotBlank
        String nome,

        @NotBlank
        String modelo,

        @NotBlank
        String descricao,

        @Pattern(regexp = "^\\d{4}(/\\d{4})?$")
        @NotBlank
        String ano,

        @NotNull
        Double km,

        @NotNull
        TipoCombustivel combustivel,

        @NotBlank
        String cor,

        @NotBlank
        String finalplaca,

        @NotNull
        Boolean vendido)
{
    public listarCarroDTO(Carro carro){
        this(carro.getId(), carro.getNome(), carro.getModelo(), carro.getDescricao(), carro.getAno(), carro.getKm(), carro.getCombustivel(), carro.getCor(), carro.getFinalplaca(), carro.isVendido());
    }
}
