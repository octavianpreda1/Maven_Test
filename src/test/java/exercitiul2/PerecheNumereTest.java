package exercitiul2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PerecheNumereTest {

    @Test
    void Test1_pare_egale() {
        PerecheNumere n = new PerecheNumere(324,22);
        assertEquals(true , n.pare_egale());
    }
    @Test
    void Test2_pare_egale() {
        PerecheNumere n = new PerecheNumere(314,22);
        assertTrue(false==n.pare_egale());
    }
    @Test
    void Test3_pare_egale() {
        PerecheNumere n = new PerecheNumere(314,22);
        assertFalse(true==n.pare_egale());
    }

    @Test
    void Test1_suma_numere() {
        PerecheNumere n= new PerecheNumere(12,3);
        assertEquals(true,n.suma_numere());
    }
    @Test
    void Test2_suma_numere() {
        PerecheNumere n= new PerecheNumere(4,3);
        assertTrue(false==n.suma_numere());
    }
    @Test
    void Test3_suma_numere() {
        PerecheNumere n= new PerecheNumere(32,41);
        assertFalse(true!=n.suma_numere());
    }

    @Test
    void Test1_cmmmc() {
        PerecheNumere n= new PerecheNumere(10,10);
        assertEquals(10,n.cmmmc());
    }
    @Test
    void Test2_cmmmc() {
        PerecheNumere n= new PerecheNumere(10,10);
        assertTrue(10==n.cmmmc());
    }
    @Test
    void Test3_cmmmc() {
        PerecheNumere n= new PerecheNumere(8,10);
        assertFalse(10==n.cmmmc());
    }

    @Test
    void Test1_fib() {
        PerecheNumere n= new PerecheNumere(2,1);
        assertEquals(true, n.fib());
    }
    @Test
    void Test2_fib() {
        PerecheNumere n= new PerecheNumere(3,2);
        assertTrue(true== n.fib());
    }
    @Test
    void Test3_fib() {
        PerecheNumere n= new PerecheNumere(3,1);
        assertFalse(true== n.fib());
    }
}