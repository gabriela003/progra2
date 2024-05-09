package factory;

public class Cliente {
	private String tipoAuto;
    private String contratoEmpresa;
    public Cliente(String tipoAuto, String conContrato) {
        this.tipoAuto= tipoAuto;
        this.contratoEmpresa = conContrato;
    }
	public String getTipoAuto() {
		return tipoAuto;
	}
	public String getContratoEmpresa() {
		return contratoEmpresa;
	}

	
	
}
