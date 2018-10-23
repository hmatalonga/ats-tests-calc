/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 23 14:21:32 GMT 2018
 */

package ats.tests;

import org.junit.Test;
import static org.junit.Assert.*;
import ats.tests.Calculadora;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Calculadora_ESTest extends Calculadora_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Calculadora calculadora0 = new Calculadora();
      int int0 = calculadora0.subtrai(0, (-2144));
      assertEquals(2144, int0);
      
      int int1 = calculadora0.ultimoResultado();
      assertEquals(2144, int1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Calculadora calculadora0 = new Calculadora();
      int int0 = calculadora0.subtrai(2794);
      assertEquals((-2794), int0);
      
      int int1 = calculadora0.ultimoResultado();
      assertEquals((-2794), int1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Calculadora calculadora0 = new Calculadora();
      int int0 = calculadora0.subtrai(0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Calculadora calculadora0 = new Calculadora();
      int int0 = calculadora0.subtrai((-1873));
      assertEquals(1873, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Calculadora calculadora0 = new Calculadora();
      int int0 = calculadora0.adiciona(615, (-1));
      assertEquals(614, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Calculadora calculadora0 = new Calculadora();
      int int0 = calculadora0.adiciona((-2794), 394);
      assertEquals((-2400), int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Calculadora calculadora0 = new Calculadora();
      int int0 = calculadora0.adiciona(331);
      assertEquals(331, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Calculadora calculadora0 = new Calculadora();
      int int0 = calculadora0.subtrai(2794);
      assertEquals((-2794), int0);
      
      int int1 = calculadora0.adiciona(0);
      assertEquals((-2794), int1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Calculadora calculadora0 = new Calculadora();
      int int0 = calculadora0.adiciona(0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Calculadora calculadora0 = new Calculadora();
      int int0 = calculadora0.ultimoResultado();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Calculadora calculadora0 = new Calculadora();
      int int0 = calculadora0.subtrai(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Calculadora calculadora0 = new Calculadora();
      int int0 = calculadora0.subtrai(0, 1488);
      assertEquals((-1488), int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Calculadora calculadora0 = new Calculadora();
      int int0 = calculadora0.adiciona(0);
      assertEquals(0, int0);
  }
}
