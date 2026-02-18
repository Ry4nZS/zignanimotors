package zignanimotors.api.dto;

import jakarta.validation.constraints.NotNull;
import zignanimotors.api.enums.TipoCombustivel;

public record atualizarCarroDTO(
        @NotNull
        Long id,
        String nome,
        String modelo,
        String descricao,
        String ano,
        Double km,
        TipoCombustivel combustivel,
        String cor,
        String finalPlaca,
        Boolean vendido) {
}
