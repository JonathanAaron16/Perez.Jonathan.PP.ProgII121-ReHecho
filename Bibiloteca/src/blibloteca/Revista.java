
package blibloteca;


public class Revista extends Publicacion implements Leible{
    private int numeroEdicion;

    public Revista(int numeroEdicion, String titulo, int anio) {
        super(titulo, anio);
        this.numeroEdicion = numeroEdicion;
    }

    

    

    @Override
    public String toString() {
        return "Revista [" + "numeroEdicion=" + numeroEdicion + ']';
    }
    
    
    @Override
    public void leer() {
        System.out.println("leyendo revista");
    }
    
    
    
}
