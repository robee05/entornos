package utilidades;


import modelos.Festividad;
import modelos.Poblacion;
import modelos.Prestamo;
import modelos.Profesor;

import java.util.ArrayList;
import java.util.List;

public class UtilidadesEjercicios {
    public void printInformacionPersonal(Profesor profesor){
        System.out.println("Nombre: " + profesor.getStr());
        System.out.println("Edad: " + profesor.getEdad());
        System.out.println("Telefono: " + profesor.getNumeroDeTelefono());
    }
    public void printTodaLaInformacion(Profesor profesor){
        System.out.println("Nombre: " + profesor.getStr());
        System.out.println("Edad: " + profesor.getEdad());
        System.out.println("Telefono: " + profesor.getNumeroDeTelefono());
        System.out.println("Prestamos: " + profesor.getPrestamos());
    }

    public static void datosEmpresa(String cliente, Poblacion pob){
        System.out.println("Datos del cliente");
        List<String> lc = new ArrayList<>();
        lc.add(cliente);
        System.out.println("Cliente: " + lc);
        if (pob.getNombre().equals("Sevilla")){
            System.out.println(pob.getHabitantes());
        }
    }

    public static void main(String[] args) {
        Festividad f1 = new Festividad("Abril", "Feria de Sevilla");
        Poblacion p1 = new Poblacion("Sevilla", 1945000, 140.8, 1000000, 152014, f1);
        datosEmpresa("Manuel", p1);
        datosEmpresa("Rocio", p1);
    }


}

