import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class JUnit5 {
    private Triangle triangle;

    @BeforeEach
    public void setUp() {
        triangle = new Triangle();
    }

    @Test
    public void testIsIsoscelesValid() {
        triangle.setSides(3, 3, 4);
        assertTrue(triangle.isIsosceles());
    }

    @Test
    public void testIsIsoscelesEquilateral() {
        triangle.setSides(5);
        assertTrue(triangle.isIsosceles());
    }

    @Test
    public void testIsIsoscelesScalene() {
        triangle.setSides(3, 4, 5);
        assertFalse(triangle.isIsosceles());
    }

    @Test
    public void testIsEquilateralValid() {
        triangle.setSides(5);
        assertTrue(triangle.isEquilateral());
    }

    @Test
    public void testIsEquilateralIsosceles() {
        triangle.setSides(3, 3, 4);
        assertTrue(triangle.isEquilateral());
    }

    @Test
    public void isEquilateralScalene() {
        triangle.setSides(3, 4, 5);
        assertFalse(triangle.isEquilateral());
    }

    @Test
    public void isScaleneValid() {
        triangle.setSides(3, 4, 5);
        assertTrue(triangle.isScalene());
    }

    @Test
    public void isSetSidesValid() {
        triangle.setSides(2, 1, 8);
    }

    @RepeatedTest(4)
    public void setSidesNegative() {
    }

    @ParameterizedTest
    @CsvSource({
            "3, 4, 5, true",
            "1, 2, 3, false",
            "1, 1, 3, false"
    })
    public void setSidesParameterized(int a, int b, int c, boolean expected) {
        triangle.setSides(a, b, c);
        if (expected) {
            assertTrue(triangle.isScalene());
        } else {
            assertFalse(triangle.isScalene());
        }
    }

    @Test
    public void getPerimeter() {
        triangle.setSides(3, 7, 3);
        assertEquals(13 ,triangle.getPerimeter());
    }

    @Test
    public void getAverageLength() {
        triangle.setSides(4, 9, 2);
        assertEquals(5, triangle.getAverageLength());
    }
}
