package fr.lernejo;
import fr.lernejo.Sample;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
class SampleTest {

    private final Sample sample = new Sample();
    /*@BeforeEach
    void setUp() {
    }
    @AfterEach
    void tearDown() {
    } */
    @Test
    void op() {
        int a = 2, b = 4;
        int result = sample.op(Sample.Operation.ADD, a, b);
        int result2 = sample.op(Sample.Operation.MULT, a, b);
        assertEquals(result,6);
        assertEquals(result2,8);
    }
    @Test
    void fact() {
        int c = 5;
        assertThrows(IllegalArgumentException.class,() -> sample
                .fact(-1));
        assertEquals(sample.fact(c), 120);
    }
}
