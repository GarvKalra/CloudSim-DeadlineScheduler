package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DeadlineTest {

    @Test
    public void testDeadlineMet() {
        double finishTime = 40.0;
        double deadline = 50.0;
        assertTrue(finishTime <= deadline, "Deadline should be met");
    }

    @Test
    public void testDeadlineMissed() {
        double finishTime = 60.0;
        double deadline = 50.0;
        assertFalse(finishTime <= deadline, "Deadline should be missed");
    }
}
