// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Empresa empresa = new Empresa();

        empresa.agregarPersonal(new EmpleadoComision("44762823", "Jorgito", "Agrasojona", 2021, 30000, 100, 500));
        empresa.agregarPersonal(new EmpleadoComision("44762823", "Jorgito2", "Agrasojona", 2011, 1500.0, 20.0, 10));
        empresa.agregarPersonal(new EmpleadoComision("44762823", "Jorgito3", "Agrasojona", 2011, 1500.0, 20.0, 10));
        empresa.agregarPersonal(new EmpleadoComision("44762823", "Jorgito4", "Agrasojona", 2011, 1500.0, 20.0, 10));

        empresa.agregarPersonal(new EmpleadoFijo("123213123", "marquitos", "condo", 2021, 45000));
        empresa.agregarPersonal(new EmpleadoFijo("123213123", "marquitos2", "condo", 2014, 3000));
        empresa.agregarPersonal(new EmpleadoFijo("123213123", "marquitos3", "condo", 2012, 4000));

        empresa.mostrarSalario();
        System.out.println(empresa.empleadoconMayorClientes().nombresCompletos());


        daewrs();
    }

    public static void daewrs() {
        int e, ab = 0, b = 1, c = 0;
        for (e = 0; e < 10; e++) {
            if (e < 9) {
                System.out.print(ab + ",");
            } else {
                System.out.print(ab);
            }
            c = ab + b;
            b = ab;
            ab = c;
        }
    }

    public static void whilkea () {
           
    }
}