//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ListEstudiante estudianteList =new ListEstudiante();
        estudianteList.añadir(new Estudiante("juan",20, 101L,4.5));
        estudianteList.añadir(new Estudiante("Maria",22,102L,4.1));
        estudianteList.añadir(new Estudiante("Carlos", 21, 103L, 3.8));
        estudianteList.añadir(new Estudiante("Rosa", 23, 101L, 4.5));
        estudianteList.añadir(new Estudiante("Luisa", 24, 102L, 4.1));
        estudianteList.añadir(new Estudiante("Camila", 21,103L, 3.8));


        ListaCarrera listaCarrera=new ListaCarrera();
        listaCarrera.añadir(new Carrera(101L,"Ingenieria de Sistemas"));
        listaCarrera.añadir(new Carrera(102L,"Ingenieria Industrial"));
        listaCarrera.añadir(new Carrera(103L,"Matematicas"));


        estudianteList.imprimirestudiantes();
        ListNotaCarrera listNotaCarrera= new ListNotaCarrera();
        listNotaCarrera.imprimir();

    }
}