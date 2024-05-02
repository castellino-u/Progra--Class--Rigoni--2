package parcial1;
//esta es una clase de asociación


public class Sede {
   private int sede;
   private String fecha;
   private String hora;

   public Sede(){
   }
   public Sede(int sede, String hora, String fecha){
       this.sede = sede;
       this.fecha = fecha;
       this.hora = hora;
   }

    public int getSede() {
        return sede;
    }

    public void setSede(int sede) {
        this.sede = sede;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}
