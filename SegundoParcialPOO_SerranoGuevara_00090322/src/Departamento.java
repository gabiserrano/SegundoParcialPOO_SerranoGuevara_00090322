import java.util.ArrayList;
import java.util.List;

public class Departamento implements ComponentOrganizacional {
    private String nombre;
    private List<ComponentOrganizacional> componentes;

    // Proper constructor that initializes the 'nombre' and 'componentes' list
    public Departamento(String nombre) {
        this.nombre = nombre;
        this.componentes = new ArrayList<>();
    }

    public void agregarComponentes(ComponentOrganizacional componente) {
        componentes.add(componente);
    }

    public void removerComponente(ComponentOrganizacional componente) {
        componentes.remove(componente);
    }

    @Override
    public void mostrarEstructura() {
        System.out.println("Departamento: " + nombre);
        for (ComponentOrganizacional componente : componentes) {
            componente.mostrarEstructura();
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<ComponentOrganizacional> getComponentes() {
        return componentes;
    }
}
