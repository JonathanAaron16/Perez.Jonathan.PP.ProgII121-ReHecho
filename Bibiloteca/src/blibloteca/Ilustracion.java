
package blibloteca;


public class Ilustracion extends Publicacion{
    private String nombreIlustrador;
    private double ANCHO;
    private double ALTO;

    public Ilustracion(String nombreIlustrador, double ANCHO, double ALTO, String titulo, int anio) {
        super(titulo, anio);
        this.nombreIlustrador = nombreIlustrador;
        this.ANCHO = ANCHO;
        this.ALTO = ALTO;
    }

    @Override
    public String toString() {
        return "Ilustracion[" + "nombreIlustrador=" + nombreIlustrador + ", ANCHO=" + ANCHO + ", ALTO=" + ALTO + ']';
    }

   

    


   
    
    
}
