public class EmpleadoComision extends Personal{
    private double MINIMOSALARIO;
    private double montoxCliente;
    private int clientesCaptados;

    public EmpleadoComision(String DNI, String nombre, String apellido, int anoIngreso, double MINIMOSALARIO, double montoxCliente, int clientesCaptados) {
        super(DNI, nombre, apellido, anoIngreso);
        this.MINIMOSALARIO = MINIMOSALARIO;
        this.montoxCliente = montoxCliente;
        this.clientesCaptados = clientesCaptados;
    }

    public int getClientesCaptados() {
        return clientesCaptados;
    }

    @Override
    public double Salario() {

        double sueldoFinal = 0;
        double saldoporcomsion = montoxCliente * clientesCaptados;
        if (saldoporcomsion > MINIMOSALARIO){
            return saldoporcomsion;
        }else {
            return MINIMOSALARIO;}
    }


}
