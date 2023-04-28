import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class FibonacciTest {
    @BeforeAll
    public void setUpAll(){
        System.out.println("This is ran before anything else i.e all Tests");
    }
    @BeforeEach
    public void setUp(){
        System.out.println("This is ran before each test");
    }
    @Test
    @DisplayName("Test #1: F(10)")
    void nthPlace1() {
        var fib = new Fibonacci();
        assertEquals(55, fib.nthPlace(10));
    }
    @Test
    @DisplayName("Test #2: F(3)")
    void nthPlace2() {
        var fib = new Fibonacci();
        assertEquals(2, fib.nthPlace(3));
    }
    @AfterEach
    public void tearDown(){
        System.out.println("This is ran after each test");
    }
    @AfterAll
    public void tearDownAll(){
        System.out.println("This is ran at the very ending, after everything else");
    }
}