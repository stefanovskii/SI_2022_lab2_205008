import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {
    @Test
    public void test1(){
        assertEquals(SILab2.function(25),"Perfect Square");
        assertEquals(SILab2.function(3),"Not Perfect Square");
    }

    @Test
    public void test2(){
        assertEquals(SILab2.function(64),"Perfect Square");
        assertEquals(SILab2.function(7),"Not Perfect Square");
    }
}