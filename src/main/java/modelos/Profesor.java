package modelos;

import java.util.List;

public class Profesor extends Persona {
    String str;
    int edad;
    String numeroDeTelefono;
    List<Prestamo> prestamos;

    public Profesor(String numeroDeTelefono) {
        super(numeroDeTelefono);
    }

    public Profesor(String numeroDeTelefono, String str, int edad, String numeroDeTelefono1, List<Prestamo> prestamos) {
        super(numeroDeTelefono);
        this.str = str;
        this.edad = edad;
        this.numeroDeTelefono = numeroDeTelefono1;
        this.prestamos = prestamos;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String getNumeroDeTelefono() {
        return numeroDeTelefono;
    }

    @Override
    public void setNumeroDeTelefono(String numeroDeTelefono) {
        this.numeroDeTelefono = numeroDeTelefono;
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(List<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

}
