package model;

public class Direccion {
    private String pais;
    private String ciudad;
    private String comuna;
    private String calle;

    public Direccion(String pais, String ciudad, String comuna, String calle) {
        this.pais = pais;
        this.ciudad = ciudad;
        this.comuna = comuna;
        this.calle = calle;
    }

    public Direccion() {
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    @Override
    public String toString() {
        return "Direccion{" +
                "pais='" + pais + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", comuna='" + comuna + '\'' +
                ", calle='" + calle + '\'' +
                '}';
    }
}
