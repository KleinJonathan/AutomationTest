import org.example.MathClass;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestMath {

    @Test
    public void math_subAB(){
        MathClass m = new MathClass();
        m.setA(12);
        assertEquals(12, m.subAB());
    }

    @Test
    public void math_subBA(){
        MathClass m = new MathClass();
        m.setA(12);
        assertEquals(-12, m.subBA());
    }

    @Test
    public void math_multiplyWithZero(){
        MathClass m = new MathClass();
        m.setA(12);
        assertEquals(0, m.multAB());
    }

    @Test
    public void math_multiply(){
        MathClass m = new MathClass();
        m.setA(12);
        m.setB(2);
        assertEquals(24, m.multAB());
    }

    @Test
    public void math_multiply2(){
        MathClass m = new MathClass();
        m.setA(12);
        m.setB(3);
        assertEquals(36, m.multAB());
    }
}
