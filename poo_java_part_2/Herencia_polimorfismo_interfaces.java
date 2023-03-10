/*
Crea una clase Persona con las siguientes variables:

La edad

El nombre

El teléfono

Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable credito solo para esa clase.

Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.

Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que solo tenga la clase Trabajador.
*/

//By Ricardt


public class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}

public class Cliente extends Persona {
    private double credito;

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }
}

public class Trabajador extends Persona {
    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setEdad(35);
        cliente.setNombre("Maria");
        cliente.setTelefono("555-4321");
        cliente.setCredito(1000.0);

        System.out.println("El cliente se llama " + cliente.getNombre() +
                           ", tiene " + cliente.getEdad() + " años, su teléfono es " +
                           cliente.getTelefono() + ", y su crédito es de $" +
                           cliente.getCredito() + ".");

        Trabajador trabajador = new Trabajador();
        trabajador.setEdad(25);
        trabajador.setNombre("Juan");
        trabajador.setTelefono("555-5678");
        trabajador.setSalario(2000.0);

        System.out.println("El trabajador se llama " + trabajador.getNombre() +
                           ", tiene " + trabajador.getEdad() + " años, su teléfono es " +
                           trabajador.getTelefono() + ", y su salario es de $" +
                           trabajador.getSalario() + ".");
    }
}
