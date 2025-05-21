package biblioteca;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.Year;

import org.junit.jupiter.api.Test;

import com.example.demo.entity.Libro;
import com.example.demo.service.LibroServiceImpl;

public class TestMetodosValidacion {

    private LibroServiceImpl libroService = new LibroServiceImpl();

    @Test
    public void anioPublicacionPosteriorDebeFallar() {
        Libro libro = new Libro();
        libro.setAnioPublicacion(Year.now().getValue() + 1);
        assertThrows(IllegalArgumentException.class, () -> libroService.publicacionValida(libro));
    }

    @Test
    public void anioPublicacionValido() {
        Libro libro = new Libro();
        libro.setAnioPublicacion(Year.now().getValue());
        assertDoesNotThrow(() -> libroService.publicacionValida(libro));
    }

    @Test
    public void anioPublicacionNullDebeSerValido() {
        Libro libro = new Libro();
        libro.setAnioPublicacion(null);
        assertDoesNotThrow(() -> libroService.publicacionValida(libro));
    }
}

