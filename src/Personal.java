public abstract class Personal {
    private String DNI;
    private String nombre;
    private String apellido;
    private int anoIngreso;

    public Personal(String DNI, String nombre, String apellido, int anoIngreso) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.anoIngreso = anoIngreso;
    }

    public int getAnoIngreso() {
        return anoIngreso;
    }


   public String nombresCompletos() {
        String nombress = this.nombre + " " + this. apellido;
        return nombress;
   }
    public abstract double Salario();
}
