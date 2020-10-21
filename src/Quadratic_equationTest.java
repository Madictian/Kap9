import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Quadratic_equationTest {
@Test
        public void testGetDiscriminant(){
            Quadratic_equation eq1 = new Quadratic_equation(3, 3, 3);
            assertEquals(-27, eq1.getDiscriminant(eq1.getA(),eq1.getB(),eq1.getC()));

        }
@Test
        public void testGet1stRoot(){
            Quadratic_equation eq1 = new Quadratic_equation(2, 5, 2);
            assertEquals(-0.5, eq1.get1stRoot());
}
@Test
        public void testGet2ndRoot(){
            Quadratic_equation eq1 = new Quadratic_equation(2, 5, 2);
            assertEquals(-2.0,eq1.get2ndRoot());
    }

    }