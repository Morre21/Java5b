package entidades;

public class Administrativo extends Empleado{
	private int hsExtra;
	private int hsMes;
  
	 public Administrativo(String dni, String nombre, String apellido, String email, double sueldoBase, int hsExtra, int hsMes) {
	        super(dni, nombre, apellido, email, sueldoBase);
	        this.hsExtra = hsExtra;
	        this.hsMes = hsMes;
	    }

	    @Override
	    public double getSueldo() {
	        return  sueldoBase *((hsExtra * 1.5) + hsMes) / hsMes;
	    }
}
