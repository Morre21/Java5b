package entidades;

public class Empleado {
	private String dni;
	private String nombre;
	private String apellido;
	private String email;
	protected double sueldoBase; 
	 
	public Empleado(String dni, String nombre, String apellido, String email, double sueldoBase) {
	        this.dni = dni;
	        this.nombre = nombre;
	        this.apellido = apellido;
	        this.email = email;
	        this.setSueldoBase(sueldoBase);
	    }


	    public String toString() {
	        return "DNI: " + dni + ", Nombre: " + nombre + ", Apellido: " + apellido + ", Sueldo: " + getSueldo();
	    }

		public double getSueldo() {
			return sueldoBase;
		}

		public void setSueldoBase(double sueldoBase) {
			this.sueldoBase = sueldoBase;
		}
	}

