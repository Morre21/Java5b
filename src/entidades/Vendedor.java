package entidades;

public class Vendedor extends Empleado {
    private double porcenComision;
    private double totalVentas;

    public Vendedor(String dni, String nombre, String apellido, String email, double sueldoBase, double porcenComision, double totalVentas) {
        super(dni, nombre, apellido, email, sueldoBase);
        this.porcenComision = porcenComision;
        this.totalVentas = totalVentas;
    }
  @Override 
  public double getSueldo() {
	  return sueldoBase + (porcenComision * totalVentas /100);
  }
}

