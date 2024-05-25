public class Empleado implements ComponentOrganizacional {
    private String nombre;
    private String puesto;
    private double salario; // Changed from boolean to double

    public Empleado(String nombre, String puesto, double salario) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void mostrarEstructura() {
        System.out.println("Empleado: " + nombre + ", Puesto: " + puesto + ", Salario: " + salario);
    }
}
