package test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import src.Calculadora;

public class testCalculadora {

@Test
public void testSoma() {
Calculadora calc = new Calculadora();
assertEquals(5, calc.soma(2, 3));
}

@Test 
public void testSubtracao(){
Calculadora calc = new Calculadora();
assertEquals (5, calc.subtracao(10,5));
}


}