import static org.junit.jupiter.api.Assertions.*;

/**
 *
 */
class TrimestreTest {

    private Trimestre trimestre = new Trimestre();

    public TrimestreTest() {
        trimestre.setMes(1);
    }

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        trimestre.setMes(1);
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void verificarTrimestre() {
        assertEquals("primeiro trimestre", trimestre.verificarTrimestre());
        trimestre.setMes(2);
        assertEquals("primeiro trimestre", trimestre.verificarTrimestre());
        trimestre.setMes(3);
        assertEquals("primeiro trimestre", trimestre.verificarTrimestre());
        trimestre.setMes(4);
        assertEquals("segundo trimestre", trimestre.verificarTrimestre());
        trimestre.setMes(5);
        assertEquals("segundo trimestre", trimestre.verificarTrimestre());
        trimestre.setMes(6);
        assertEquals("segundo trimestre", trimestre.verificarTrimestre());
        trimestre.setMes(7);
        assertEquals("terceiro trimestre", trimestre.verificarTrimestre());
        trimestre.setMes(8);
        assertEquals("terceiro trimestre", trimestre.verificarTrimestre());
        trimestre.setMes(9);
        assertEquals("terceiro trimestre", trimestre.verificarTrimestre());
        trimestre.setMes(10);
        assertEquals("quarto trimestre", trimestre.verificarTrimestre());
        trimestre.setMes(11);
        assertEquals("quarto trimestre", trimestre.verificarTrimestre());
        trimestre.setMes(12);
        assertEquals("quarto trimestre", trimestre.verificarTrimestre());
    }
}