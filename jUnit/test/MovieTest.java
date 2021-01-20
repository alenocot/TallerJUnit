import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getPriceCode() {
        System.out.println("getPriceCode");
        Movie instance = new Movie("Over the moon",Movie.CHILDRENS);
        int expResult = Movie.CHILDRENS;
        int result = instance.getPriceCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    void setPriceCode() {
        System.out.println("setPriceCode");
        int arg = Movie.NEW_RELEASE;
        Movie instance = new Movie("Lo que sea", Movie.REGULAR);
        instance.setPriceCode(arg);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(arg, instance.getPriceCode());
        //fail("The test case is a prototype.");
    }
}