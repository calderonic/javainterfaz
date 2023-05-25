public class EmpleadoFijo extends Personal {
    private double sueldobasico;
    public final double DOSANOS = 0.05;
   public final double CINCOANOS = 0.1;
    public final int CINCOANOSANTIFUEDAD = 5;
    public final int DOSANOSAANTIGUEDAD = 2;
    public final int ANOALTUAL = 2023;

    public EmpleadoFijo(String DNI, String nombre, String apellido, int anoIngreso, double sueldobasico) {
        super(DNI, nombre, apellido, anoIngreso);
        this.sueldobasico = sueldobasico;
    }

    @Override
    public double Salario() {

        double sueldoFinal = 0;
        if(calcularAntiguedad() > CINCOANOSANTIFUEDAD) {
            sueldoFinal = this.sueldobasico * CINCOANOS;
        }else if (calcularAntiguedad() > DOSANOSAANTIGUEDAD) {
            sueldoFinal = this.sueldobasico * DOSANOS;
        }else {sueldoFinal = this.sueldobasico; }

        return sueldoFinal;
    }



    public int calcularAntiguedad() {
        int antigueadad = ANOALTUAL - getAnoIngreso();
        return antigueadad;
    }
}
