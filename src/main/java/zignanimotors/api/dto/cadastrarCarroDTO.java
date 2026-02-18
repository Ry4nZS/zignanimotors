package zignanimotors.api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import zignanimotors.api.enums.TipoCombustivel;
import zignanimotors.api.model.Carro;

public record cadastrarCarroDTO(

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
        String finalplaca

        ){

        public cadastrarCarroDTO(Carro carro){
                this(carro.getNome(), carro.getModelo(), carro.getDescricao(), carro.getAno(), carro.getKm(), carro.getCombustivel(), carro.getCor(), carro.getFinalplaca());
        }
}
