package parcial1;

public class EquipoNacional {
    private String color;
    private String pais;

    public EquipoNacional(){

    }
    public EquipoNacional(String color, String pais){
        this.color = color;
        this.pais = pais;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
