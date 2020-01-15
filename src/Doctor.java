import javax.print.Doc;

public class Doctor {
    //Atributos
    static int id;
    String name;
    String speciality;

    Doctor(){
        System.out.println("Construyendo el Objeto Doctor");
    }

    Doctor(String name, String speciality){
        id++;
        System.out.println("El nombre del Doctor asignado es: " + name);
        this.name = name;
        this.speciality = speciality;
    }

    //Comportamientos
    public void showName(){
        System.out.println(name);
    }

}