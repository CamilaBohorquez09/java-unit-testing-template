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
    assertThrows(IllegalArgumentException.class,
        () -> Propina.totalConPropina(-1.0, 10.0));
  }

  @Test
  void totalConPropina_porcentajeCero_devuelveSubtotal() {
    double obtenido = Propina.totalConPropina(75.0, 0.0);
    assertEquals(75.0, obtenido, 0.000001);
  }

  @Test
  void totalConPropina_porcentajeNegativo_lanzaExcepcion() {
    assertThrows(IllegalArgumentException.class,
        () -> Propina.totalConPropina(50.0, -5.0));
  }
}
