package Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import src.Dodawanie;
import org.junit.jupiter.api.Test;
/**
 * DodawanieTest
 */
public class DodawanieTest {
    private final Dodawanie dodawanie = new Dodawanie();

    @Test
    void addition(){
        assertEquals(2, dodawanie.dodaj(1,1));
    }
}