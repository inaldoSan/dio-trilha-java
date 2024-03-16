package fundamentosPOO.estados;

public enum EstadoBrasileiro {
    SAO_PAULO ("SP", "SÃO PAULO"),
    RIO_JANEIRO("RJ", "RIO DE JANEIRO"),
    PIAUI ("PI", "PIAUÍ"),
    MARANHAO ("MA", "MARANHÃO"),
    CEARA ("CE", "CEARA");

    private String nome;
    private String sigla;

    private EstadoBrasileiro(String sigla, String nome) {
        this.nome = nome;
        this.sigla = sigla;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSigla() {
        return sigla;
    }
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }
    
}
