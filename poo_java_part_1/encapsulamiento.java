/*
Para practicar la encapsulación:

Crear clase Persona.

Crear variables las privadas edad, nombre y telefono de la clase Persona.

Crear gets y sets de cada propiedad.

Crear un objeto persona en el main.

Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola.
*/
// By Ricardo

public static void main(String[] args) {
    Persona persona = new Persona();
    persona.setEdad(30);
    persona.setNombre("Juan");
    persona.setTelefono("555-1234");

    System.out.println("La persona se llama " + persona.getNombre() +
                       ", tiene " + persona.getEdad() + " años, y su teléfono es " +
                       persona.getTelefono() + ".");
}


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

