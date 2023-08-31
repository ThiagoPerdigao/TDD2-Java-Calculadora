package test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class CalculadoraTest {
@Test
public void testSoma() {
Calculadora calc = new Calculadora();
assertEquals(5, calc.soma(2, 3));
}

@test 
public void testSubtracao(){
Calculadora calc = new Calculadora();
assertEquals (5, calc.subtracao(10,5))
}


}