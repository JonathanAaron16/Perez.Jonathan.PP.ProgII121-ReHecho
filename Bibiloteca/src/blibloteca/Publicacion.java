
package blibloteca;

import java.util.Objects;

public abstract class Publicacion {
    protected String titulo;
    protected int anio;

    public Publicacion(String titulo, int anio) {
        this.titulo = titulo;
        this.anio = anio;
    }
   
    // Sobrescribir equals() para comparar por título y año
      @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; // Si son el mismo objeto
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false; // Si es null o no es de la misma clase
        }

        Publicacion that = (Publicacion) obj;
        return anio == that.anio && titulo.equals(that.titulo);
    }
    
    @Override
    public int hashCode() {
        return  Objects.hash(titulo, anio);
    }
    
    
    
}
