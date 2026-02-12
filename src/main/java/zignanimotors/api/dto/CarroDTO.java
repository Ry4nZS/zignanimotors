package zignanimotors.api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import zignanimotors.api.enums.TipoCombustivel;

public record CarroDTO(

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
        double km,

        @NotNull
        TipoCombustivel combustivel,

        @NotBlank
        String cor,

        @NotBlank
        String finalplaca) {
}
