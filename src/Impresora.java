import java.util.Date;

public class Impresora {




    private String modelo;
    private String tipoConexion;
    private Date fechaFabricacion;
    private int hojasDisponible;
    private int porcentajeTinta;

    public Impresora(String modelo, String tipoConexion, Date fechaFabricacion) {
        this.modelo = modelo;
        this.tipoConexion = tipoConexion;
        this.fechaFabricacion = fechaFabricacion;
        this.setHojasDisponible(0);
        this.porcentajeTinta = 100;
    }

    public void setHojasDisponible(int hojasDisponible){
        this.hojasDisponible =  hojasDisponible;

    }

    public boolean tienePapel() {
        return this.hojasDisponible > 0;
    }

    public boolean necesitatinta() {

        return this.porcentajeTinta == 0;
    }

    public abstract String imprimir() ;


}
