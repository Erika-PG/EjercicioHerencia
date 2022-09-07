package Herencia;

public class Principal {
    public static void main(String[] args) {
        Persona p1=new Persona("Eduardo",11,"M","San Francisco");
        Estudiante e1=new Estudiante("Erika",18,"F","Atlacomulco","2124","paradigmas","B+");
        Estudiante e2=new Estudiante();
        e1.mostrarInfo();
        p1.mostrarInfo();



    }
}
