import javax.print.Doc;

import java.util.Date;

import static UI.Interfaz.*;

public class Main {
    public static void main(String[] args) {

        String nombre = "Omar";
        String speciality = "Desarrollo";

        Doctor nuevoDoctor = new Doctor(nombre, speciality);

        nuevoDoctor.addCita(new Date(), "2:30 am");
        nuevoDoctor.addCita(new Date(), "4:30 am");
        nuevoDoctor.addCita(new Date(), "7:30 am");
        nuevoDoctor.addCita(new Date(), "11:30 pm");

        for (Doctor.Citas a:nuevoDoctor.getCitas()) {
            System.out.println("Fecha: " + a.fecha + " Hora: " + a.hora);
        }
    }



}