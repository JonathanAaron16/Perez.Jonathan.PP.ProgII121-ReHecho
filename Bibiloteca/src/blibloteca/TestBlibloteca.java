
package blibloteca;


public class TestBlibloteca {

    
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

            Libro libro1 = new Libro("carlos",Genero.FICCION,"el hostital", 2000 );
            Libro libro2 = new Libro("carlos",Genero.FICCION,"el hostital", 2000 );
            Revista revista1 = new Revista(100, "titulo", 2000);
            Revista revista2 = new Revista(100, "titulo", 2000);
            Ilustracion ilustracion1 = new Ilustracion("asd",5.25,1.25,"Juan Perez", 2010);
       
        try {
            biblioteca.agregarPublicacion(libro1);

            biblioteca.agregarPublicacion(revista1);
            
            biblioteca.agregarPublicacion(ilustracion1);

            biblioteca.agregarPublicacion(libro2);// Esto lanzará la excepción
            biblioteca.agregarPublicacion(revista2);// Esto lanzará la excepción

        } catch (PubicacionYaExisteException e) {
            System.out.println(e.getMessage());
        }

        // Mostrar todas las publicaciones
        biblioteca.mostrarPublicaciones();
        // Leer todas las publicaciones
        biblioteca.leerPublicaciones();
        
    }
    
    
    
}
