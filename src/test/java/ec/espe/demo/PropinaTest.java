package ec.espe.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

class PropinaTest {

  @Test
  void totalConPropina_calculaPropinaNormal() {
    double obtenido = Propina.totalConPropina(100.0, 10.0);
    assertEquals(110.0, obtenido, 0.000001);
  }

  @Test
  void totalConPropina_subtotalNegativo_lanzaExcepcion() {
    Exception exception = assertThrows(IllegalArgumentException.class,
        () -> Propina.totalConPropina(-1.0, 10.0));
    assertEquals("El subtotal no puede ser negativo", exception.getMessage());
  }

  // porcentaje 0 devuelve subtotal
  @Test
  void totalConPropina_porcentajeCero_devuelveSubtotal() {
    double obtenido = Propina.totalConPropina(200.0, 0.0);
    assertEquals(200.0, obtenido, 0.000001);
  }

  // porcentaje 100 duplica subtotal
  @Test
  void totalConPropina_porcentajeCien_duplicaSubtotal() {
    double obtenido = Propina.totalConPropina(50.0, 100.0);
    assertEquals(100.0, obtenido, 0.000001);
  }

  // porcentaje fuera de rango lanza excepcion
  @Test
  void totalConPropina_porcentajeFueraDeRango_lanzaExcepcion() {
    Exception exception = assertThrows(IllegalArgumentException.class,
        () -> Propina.totalConPropina(100.0, 150.0));
    assertEquals("El porcentaje debe estar entre 0 y 100", exception.getMessage());
  }

 
}
