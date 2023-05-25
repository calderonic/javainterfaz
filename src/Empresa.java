import java.util.ArrayList;

public class Empresa {
    private ArrayList<Personal> empleados;

    public Empresa() {
        this.empleados = new ArrayList<>();
    }

    public void agregarPersonal(Personal p){
        this.empleados.add(p);
    }
    public void mostrarSalario()   {
        int i=0;
        for (Personal e : empleados) {
            System.out.println(e.nombresCompletos() + "\n" + e.Salario());

        }
    }
    public Personal empleadoconMayorClientes() {
        int max= -1;
        Personal elMayor = null;
        for (Personal e :empleados) {
            if (e instanceof EmpleadoComision) {
                EmpleadoComision each = (EmpleadoComision) e;
                int cant = each.getClientesCaptados();
                if(cant > max) {
                    max = cant;
                    elMayor = each;
                }
            }

        }
        return elMayor;
    }

}
