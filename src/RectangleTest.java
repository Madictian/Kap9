import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
@Test
    void Rectangle(){
    Rectangle r1 = new Rectangle(1, 1);
    Rectangle r2 = new Rectangle(3.5, 35.9);
        assertEquals(1, r1.height);
        assertEquals(1, r1.width);
        assertEquals(3.5, r2.height);
    }
@Test
    public void testPerimeter(){
        Rectangle r1 = new Rectangle(1, 1);
        assertEquals(4, r1.perimeter());
}

@Test
    public void testArea(){
    Rectangle r1 = new Rectangle(1, 1);
    assertEquals(1, r1.area());

}

    @Test
    void perimeter() {
        Rectangle r1 = new Rectangle(1, 1);
        assertEquals(4, r1.perimeter());
    }
}