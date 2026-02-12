package zignanimotors.api.enums;

public enum TipoCombustivel {

    GASOLINA("Gasolina"),
    ETANOL("Etanol"),
    FLEX("Flex"),
    DIESEL("Diesel"),
    ELETRICO("Elétrico"),
    HIBRIDO("Híbrido"),
    PLUG_IN_HIBRIDO("Híbrido Plug-in"),
    GNV("GNV");

    private String descricao;

    TipoCombustivel(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
