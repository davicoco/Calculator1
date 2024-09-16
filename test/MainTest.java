import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    @DisplayName("Testa addera")
    public void testAdd(){
        assertEquals(11, Main.add(5,6));
    }

    @Test
    @DisplayName("Testa subtrahera")
    public void testSubtract(){
        assertEquals(4, Main.subtract(8,4));
    }
}
