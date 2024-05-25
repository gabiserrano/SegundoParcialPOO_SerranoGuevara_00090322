public class Empleado {
    private String nombre;
    private String puesto;
    private boolean salario;

    public Empleado(String nombre, String puesto, boolean salario){
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;

    }

    public Empleado(String alice, String desarrolladora, int i) {
    }

    //public String getNombre(){


    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public boolean isSalario() {
        return salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setSalario(boolean salario) {
        this.salario = salario;
    }


}
