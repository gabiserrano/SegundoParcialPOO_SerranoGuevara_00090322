//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Empleado empleado1 = new Empleado("Alice", "Desarrolladora", 6000);
        Empleado empleado2 = new Empleado("Jorge", "Analista", 52080);
        Empleado empleado3 = new Empleado("Gustavo", "Manager", 60000);

        Departamento deptoPrincipal = new Departamento("Desarrollo de Software");
        deptoPrincipal.agregarComponentes((ComponentOrganizacional) empleado1);
        deptoPrincipal.agregarComponentes((ComponentOrganizacional) empleado2);

        Departamento deptoSecundario = new Departamento("QA");
        deptoSecundario.agregarComponentes((ComponentOrganizacional) empleado3);

        deptoPrincipal.agregarComponentes(deptoSecundario);

        deptoPrincipal.mostrarEstructura();

    }
}
