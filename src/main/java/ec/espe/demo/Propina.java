package ec.espe.demo;

public class Propina {

  public static double totalConPropina(double subtotal, double porcentajePropina) {

    if (subtotal < 0) {
      throw new IllegalArgumentException("El subtotal no puede ser negativo");
    }

    if (porcentajePropina < 0 || porcentajePropina > 100) {
      throw new IllegalArgumentException("El porcentaje debe estar entre 0 y 100");
    }

    return subtotal + subtotal * (porcentajePropina / 100);
  }
}
