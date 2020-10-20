import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FanTest {
    public Fan f1;
    public String color;
    public double radius;
    public int level;
    public boolean onOff;


    @BeforeEach
    void setUp() {
        f1 = new Fan(color, radius, level, onOff);
        f1.color = "blue";
        f1.radius = 5;
        f1.level = 0;
        f1.onOff = false;

    }

    @Test
    void increase() {
        setUp();
        assertEquals(1, f1.increase(f1.level));
        assertTrue(f1.onOff);
    }

    @Test
    void decrease() {
        setUp();
        f1.level = 1;
        assertEquals(0, f1.decrease(f1.level));
        assertFalse(f1.onOff);
    }
    @Test
    void toStringtest(){
        setUp();
        f1.increase(f1.level);
        f1.increase(f1.level);
        assertEquals("The fan is blue, it has a radius of 5.0 and it's level is 2", f1.toString());
        f1.decrease(f1.level);
        f1.decrease(f1.level);
        assertEquals("The fan is blue, it has a radius of 5.0 and it's turned off", f1.toString());
    }
}