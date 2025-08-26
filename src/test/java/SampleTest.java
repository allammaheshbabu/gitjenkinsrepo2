import org.junit.Test;

import com.example.Sample;

import static org.junit.Assert.*;

public class SampleTest {
    @Test
    public void testAdd() {
        Sample s = new Sample();
        assertEquals(8, s.add(5, 3));
    }
}
