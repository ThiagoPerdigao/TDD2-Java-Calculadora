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

@Test 
public void testMultiplicacao(){
Calculadora calc = new Calculadora();
assertEquals (10, calc.multiplicacao(2,5));
}

@Test 
public void testDivisao(){
Calculadora calc = new Calculadora();
assertEquals (2, calc.divisao(10,5));
}

}